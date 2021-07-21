package com.sv.mjxt.web.tcp.server;

public enum OperResult {

	code_0(0, "失败"),
	code_1(1, "成功");
	
	private int code;
	private String message;
	
	private OperResult(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
