package com.sv.mjxt.web.tcp.server.exception;

/**
 * 不能识别的PB指令
 */
public class InvalidCommandException extends RuntimeException {

	private static final long serialVersionUID = 5642310942536427175L;
	
	
	public InvalidCommandException() {
       super();
    }

    public InvalidCommandException(String remoteAddress) {
       super(remoteAddress);
    }
}
