package com.sv.mjxt.web.tcp.server.session;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sv.mjxt.web.dao.model.Terminal;
import com.sv.mjxt.web.tcp.server.exception.InvalidRemoteAddressException;
import com.sv.mjxt.web.tcp.server.exception.TcpKickException;
import com.sv.mjxt.web.tcp.server.handler.IssueEmergencyManagementHandler;
import com.sv.mjxt.web.tcp.server.utils.ObjectUtils;
import com.sv.mjxt.web.tcp.service.TerminalService;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SessionManager {

	public static final AttributeKey<Terminal> Key_Terminal = AttributeKey.valueOf("Terminal");
	
	@Autowired
	private IssueEmergencyManagementHandler handler;
	@Autowired
	private TerminalService terminalService;
	
	// 在线企业终端ID-channel
	private Map<Integer, ChannelHandlerContext> onlineChannel = new HashMap<>();
	
	/**
	 * TCP接入时，
	 * 1.验证IP是否属于某企业，false则关闭连接；true则断开此企业已有的tcp连接（如果有）。
	 * 2.下发管控指令。
	 */
	public void addChannel(ChannelHandlerContext ctx) {
		// InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
		// String clientIP = insocket.getAddress().getHostAddress();
		String remoteAddress = ctx.channel().remoteAddress().toString();
		String clientIP = decodeIp(remoteAddress);
		Terminal terminal = terminalService.findTerminalByIP(clientIP);
		if(terminal == null) {
			throw new InvalidRemoteAddressException(clientIP);
		}
		ctx.channel().attr(Key_Terminal).set(terminal);
		ChannelHandlerContext oldCtx = onlineChannel.put(terminal.getId(), ctx);
		if(oldCtx != null) 
			oldCtx.fireExceptionCaught(new TcpKickException(terminal.getEnterpriseName()+terminal.getId()));
		handler.sendMsg(ctx, terminalService.findEmergencyLevel(terminal.getId()));
	}
	
	//连接关闭处理
	public void closeChannel(ChannelHandlerContext ctx) {
		Terminal terminal = getTerminalFromChannel(ctx);
		if(onlineChannel.remove(terminal.getId(), ctx)) {
			log.info("【{}】企业关闭TCP连接。", terminal.getEnterpriseName()+terminal.getId());
		}
	}
	
	//从channel中获取终端信息
	public Terminal getTerminalFromChannel(ChannelHandlerContext ctx) {
		return ObjectUtils.checkNonTerminal(ctx.channel().attr(Key_Terminal).get());
	}
	
	/**
	 * 获取在线企业ID
	 */
	public Set<Integer> getOnlineEnterprise() {
		return new HashSet<>(onlineChannel.keySet());
	}

	private String decodeIp(String remoteAddress) {
		int index = remoteAddress.indexOf(":") == -1 ? remoteAddress.length() - 1 : remoteAddress.indexOf(":");
		remoteAddress = remoteAddress.substring(0, index);
		return remoteAddress.startsWith("/") ? remoteAddress.substring(1) : remoteAddress;
	}
}
