package com.sv.mjxt.web.tcp.server.exception;

/**
 * channel中不能获取Terminal
 */
public class NonTerminalException extends RuntimeException {

	private static final long serialVersionUID = 5642310942536427175L;
	
	
	public NonTerminalException() {
       super();
    }
}
