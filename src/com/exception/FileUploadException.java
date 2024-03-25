package com.exception;

public class FileUploadException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String message;
	
	public  FileUploadException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
