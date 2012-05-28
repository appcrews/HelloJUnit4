package com.appcrews.junit.ch03;

public class ErrorResponse implements Response {
	private Request originalRequest;
	private Exception originalException;
	
	public ErrorResponse(Request request, Exception exception) {
		this.originalException = exception;
		this.originalRequest = request;
	}

	public Request getOriginalRequest() {
		return originalRequest;
	}

	public Exception getOriginalException() {
		return originalException;
	}

	public String getName() {
		return null;
	}
	

}
