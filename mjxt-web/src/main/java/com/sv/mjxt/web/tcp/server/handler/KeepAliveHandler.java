package com.sv.mjxt.web.tcp.server.handler;

import org.springframework.stereotype.Component;

import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.CommandNames;

import io.netty.channel.ChannelHandlerContext;

@Component
public class KeepAliveHandler implements BaseHandler {

	@Override
	public void process(ChannelHandlerContext ctx, Command request) {
		Command response = Command.newBuilder()
			.setCommandId(request.getCommandId())
			.setCommandName(CommandNames.KeepAliveResponse)
			.build();
		ctx.writeAndFlush(response);
	}
	
	@Override
	public CommandNames support() {
		return CommandNames.KeepAliveRequest;
	}
}