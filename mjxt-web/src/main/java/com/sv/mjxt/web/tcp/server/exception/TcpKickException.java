package com.sv.mjxt.web.tcp.server.exception;

/**
 * 新TCP接入，老TCP连接被关闭
 */
public class TcpKickException extends RuntimeException {

	private static final long serialVersionUID = 5642310942536427175L;
	
	
	public TcpKickException() {
       super();
    }

    public TcpKickException(String remoteAddress) {
       super(remoteAddress);
    }
}
