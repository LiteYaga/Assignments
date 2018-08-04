package com.del.exception;

public class InvalidNameException extends Exception {
	
	private static String msg="Name must start with a capital letter and must consist of only alphabets";

	public InvalidNameException()
	{
		super(msg);
	}

}
