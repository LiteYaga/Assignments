package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	
	private Pattern pattern;
	private static String regex1="^(\\d{3}-?\\d{2}-?\\d{4})$";
	private static String regex2="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#\\$%\\^&\\*])[A-Za-z0-9#$%^&*]{8,}$";
	private Matcher matcher;
	static Validate vd;
	public Validate(String regex) {
		pattern= Pattern.compile(regex);
	}
	private boolean isValid(String id) {
		boolean valid=false;
		matcher=pattern.matcher(id);
		valid=matcher.matches();
		return valid;
	}

	public static void main(String[] args) {
		
		vd=new Validate(regex1);
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter ID :");
		String id=scan.next();
		boolean validId = vd.isValid(id);
        if(validId)
        {
        	System.out.println("ID Valid");
        	System.out.println("Enter password");
        	do
        	{
        	String pass=scan.next();
        	vd=new Validate(regex2);
        	boolean validPassword=vd.isValid(pass);
        	if(validPassword)
        	{
        		System.out.println("ID and password valid");
        		break;
            }
        	else 
        	{
        		System.err.println("Password not valid,Re-enter");
        		
        	}
        	}while(true);
	    }
        else
        	System.err.println("Sorry,ID not valid");
        scan.close();
		

	}

}
