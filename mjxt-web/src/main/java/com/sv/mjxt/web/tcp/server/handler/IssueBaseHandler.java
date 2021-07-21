package com.sv.mjxt.web.tcp.server.handler;

import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.CommandNames;

import io.netty.channel.ChannelHandlerContext;

public interface IssueBaseHandler extends BaseHandler {

	public void sendMsg(ChannelHandlerContext ctx, int emergencyLevel) ;
	
	@Override
	public void process(ChannelHandlerContext ctx, Command command);
	
	@Override
	public CommandNames support();
}
