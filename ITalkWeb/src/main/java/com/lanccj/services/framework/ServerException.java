package com.lanccj.services.framework;

public class ServerException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	private int code;

	public ServerException(Throwable t) {
		super(t);
	}

	public ServerException(int code) {
		this(code,null);
	}

	public ServerException(int code,Throwable t){
		super(ServerResult.getMsg(code),t);
		this.code=code;
	}
	
	public int getCode(){
		return code;
	}
}
