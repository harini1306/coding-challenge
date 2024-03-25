package com.exception;

public class SalaryCalculationHandlingException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String message;
	
	public  SalaryCalculationHandlingException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
