package com.sv.mjxt.web.tcp.server.exception;

/**
 * 不正确的企业IP
 */
public class InvalidRemoteAddressException extends RuntimeException {

	private static final long serialVersionUID = 5642310942536427175L;
	
	
	public InvalidRemoteAddressException() {
       super();
    }

    public InvalidRemoteAddressException(String remoteAddress) {
       super(remoteAddress);
    }
}
