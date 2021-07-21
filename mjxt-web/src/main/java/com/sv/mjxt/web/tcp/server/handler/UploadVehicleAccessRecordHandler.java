package com.sv.mjxt.web.tcp.server.handler;

import org.springframework.stereotype.Component;

import com.sv.mjxt.web.tcp.server.OperResult;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.CommandNames;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Upload_VehicleAccessRecord_Request;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Upload_VehicleAccessRecord_Response;

import io.netty.channel.ChannelHandlerContext;

@Component
public class UploadVehicleAccessRecordHandler implements BaseHandler {

	@Override
	public void process(ChannelHandlerContext ctx, Command request) {
		Upload_VehicleAccessRecord_Response.Builder responseBodyBuilder = Upload_VehicleAccessRecord_Response.newBuilder();
		try {
			Upload_VehicleAccessRecord_Request requestBody = request.getUploadVehicleAccessRecordRequest();
			
			responseBodyBuilder.setCode(OperResult.code_1.getCode());
			responseBodyBuilder.setInfo(OperResult.code_1.getMessage());
		} catch(Exception e) {
			responseBodyBuilder.setCode(OperResult.code_0.getCode());
			responseBodyBuilder.setInfo(OperResult.code_0.getMessage());
		} 
		Command response = Command.newBuilder()
			.setCommandId(request.getCommandId())
			.setCommandName(CommandNames.UploadVehicleAccessRecordResponse)
			.setUploadVehicleAccessRecordResponse(responseBodyBuilder)
			.build();
		ctx.writeAndFlush(response);
	}
	
	@Override
	public CommandNames support() {
		return CommandNames.UploadVehicleAccessRecordRequest;
	}
}