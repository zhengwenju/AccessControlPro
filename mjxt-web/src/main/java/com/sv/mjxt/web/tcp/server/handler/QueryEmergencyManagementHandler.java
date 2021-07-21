package com.sv.mjxt.web.tcp.server.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sv.mjxt.web.dao.model.Terminal;
import com.sv.mjxt.web.tcp.server.OperResult;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Command;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.CommandNames;
import com.sv.mjxt.web.tcp.server.protobuf.Mjxt.Query_EmergencyManagement_Response;
import com.sv.mjxt.web.tcp.server.session.SessionManager;
import com.sv.mjxt.web.tcp.service.TerminalService;

import io.netty.channel.ChannelHandlerContext;

@Component
public class QueryEmergencyManagementHandler implements BaseHandler {

	@Autowired
	private TerminalService terminalService;

	@Autowired
	private SessionManager sessionManager;
	
	@Override
	public void process(ChannelHandlerContext ctx, Command request) {
		Query_EmergencyManagement_Response.Builder responseBodyBuilder = Query_EmergencyManagement_Response.newBuilder();
		Terminal terminal = sessionManager.getTerminalFromChannel(ctx);
		responseBodyBuilder.setCode(OperResult.code_1.getCode());
		responseBodyBuilder.setInfo(OperResult.code_1.getMessage());
		responseBodyBuilder.setEmergencyLevel(terminalService.findEmergencyLevel(terminal.getId()));
		Command response = Command.newBuilder()
			.setCommandId(request.getCommandId())
			.setCommandName(CommandNames.QueryEmergencyManagementResponse)
			.setQueryEmergencyManagementResponse(responseBodyBuilder)
			.build();
		ctx.writeAndFlush(response);
	}
	
	@Override
	public CommandNames support() {
		return CommandNames.QueryEmergencyManagementRequest;
	}
}