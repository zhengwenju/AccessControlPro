package com.sv.mjxt.web.tcp.server.handler;

import org.springframework.stereotype.Component;

import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.CommandNames;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Issue_EmergencyManagement_Request;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Issue_EmergencyManagement_Response;

import io.netty.channel.ChannelHandlerContext;

@Component
public class IssueEmergencyManagementHandler implements IssueBaseHandler {

	@Override
	public void process(ChannelHandlerContext ctx, Command response) {
		try {
			Issue_EmergencyManagement_Response responseBody = response.getIssueEmergencyManagementResponse();
		} catch(Exception e) {
		}
	}
	
	@Override
	public void sendMsg(ChannelHandlerContext ctx, int emergencyLevel) {
		Issue_EmergencyManagement_Request requestBody = Issue_EmergencyManagement_Request.newBuilder()
				.setEmergencyLevel(emergencyLevel)
				.build();
		Command response = Command.newBuilder()
			.setCommandId(1)
			.setCommandName(CommandNames.IssueEmergencyManagementRequest)
			.setIssueEmergencyManagementRequest(requestBody)
			.build();
		ctx.writeAndFlush(response);
	}
	
	@Override
	public CommandNames support() {
		return CommandNames.IssueEmergencyManagementResponse;
	}
}