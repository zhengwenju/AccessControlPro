package com.sv.mjxt.web.tcp.server;

import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.sv.mjxt.web.tcp.server.handler.BaseHandler;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.CommandNames;
import com.sv.mjxt.web.tcp.server.utils.ObjectUtils;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

@Sharable
@Component
public class DispatcherHandler extends ChannelInboundHandlerAdapter {

	@Autowired
	private Map<String, BaseHandler> handlers;
	
	private Map<CommandNames, BaseHandler> handlerMap ;
	
	@PostConstruct
	private void init() {
		if(!CollectionUtils.isEmpty(handlers)) {
			handlerMap = handlers.values().stream().collect(Collectors.toMap(BaseHandler::support, e->e));
		}
	}
	
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    	Command command = (Command) msg ;
    	ObjectUtils.checkValidCommand(handlerMap.get(command.getCommandName()), "command.getCommandName()").process(ctx, command);
    }
    
}