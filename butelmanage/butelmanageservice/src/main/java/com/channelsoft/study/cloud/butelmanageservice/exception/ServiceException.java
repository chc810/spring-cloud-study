package com.channelsoft.study.cloud.butelmanageservice.exception;

public class ServiceException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 961755319967503669L;
	private int code;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
	
	public ServiceException(int code, String message) {
		super(message);
		this.code = code;
	}

	public ServiceException(int code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public ServiceException(int code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}