package com.sv.mjxt.web.tcp.server.handler;

import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.CommandNames;

import io.netty.channel.ChannelHandlerContext;

public interface BaseHandler {

	public void process(ChannelHandlerContext ctx, Command request);

	public CommandNames support();
}
