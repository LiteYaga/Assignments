package com.del.exception;

public class InvalidPhoneNumberException extends Exception {

	private static String msg="Phone no: should be of 10 digits starting with"
			+ "7 or 8 or 9";

	public InvalidPhoneNumberException() {
		super(msg);
	}

	
	
}
