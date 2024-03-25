package com.exception;

public class InvalidEmailFormatHandlingException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String message;
	
	public  InvalidEmailFormatHandlingException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
