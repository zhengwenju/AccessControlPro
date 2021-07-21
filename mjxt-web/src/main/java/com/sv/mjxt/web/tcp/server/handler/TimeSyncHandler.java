package com.sv.mjxt.web.tcp.server.handler;

import org.springframework.stereotype.Component;

import com.sv.mjxt.web.tcp.server.OperResult;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.CommandNames;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.TimeSync_Response;
import com.sv.mjxt.web.tcp.server.utils.TimestampDateUtil;

import io.netty.channel.ChannelHandlerContext;

@Component
public class TimeSyncHandler implements BaseHandler {

	@Override
	public void process(ChannelHandlerContext ctx, Command request) {
		TimeSync_Response responseBody = TimeSync_Response.newBuilder()
				.setCode(OperResult.code_1.getCode())
				.setInfo(OperResult.code_1.getMessage())
				.setTime(TimestampDateUtil.getCurrentTimestamp())
				.build();
		Command response = Command.newBuilder()
			.setCommandId(request.getCommandId())
			.setCommandName(CommandNames.TimeSyncResponse)
			.setTimeSyncResponse(responseBody)
			.build();
		ctx.writeAndFlush(response);
	}
	
	@Override
	public CommandNames support() {
		return CommandNames.TimeSyncRequest;
	}
}