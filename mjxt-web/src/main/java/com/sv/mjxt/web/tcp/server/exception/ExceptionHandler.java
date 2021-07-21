package com.sv.mjxt.web.tcp.server.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sv.mjxt.web.dao.model.Terminal;
import com.sv.mjxt.web.tcp.server.session.SessionManager;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * 异常处理器
 */
@Slf4j
@Sharable
@Component
public class ExceptionHandler extends ChannelInboundHandlerAdapter {

	@Autowired
	private SessionManager sessionManager;
	
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    	if(cause instanceof InvalidRemoteAddressException) {
    		log.warn("无效的IP【{}】，连接关闭！", cause.getMessage());
    	} else if(cause instanceof TcpKickException) {
    		log.warn("【{}】新TCP接入，关闭老的TCP连接。", cause.getMessage());
    	} else if(cause instanceof InvalidCommandException) {
    		log.warn("无效的指令【{}】", cause.getMessage());
    	} else {
    		cause.printStackTrace();
    	}
        ctx.close();
    }
    
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
    	 if (evt instanceof IdleStateEvent) {
             IdleStateEvent e = (IdleStateEvent) evt;
             if (e.state() == IdleState.READER_IDLE) {
            	 Terminal terminal = sessionManager.getTerminalFromChannel(ctx);
            	 log.warn("【{}】长时间未收到客户端消息，主动关闭TCP连接", terminal.getEnterpriseName() + terminal.getId());
                 ctx.close();
             }
         }
    }
}