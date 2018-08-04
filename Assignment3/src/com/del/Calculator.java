package com.del;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int a = 3;   //numbers you want to operate upon
		int b = 5;

		int sum = add(a, b);
		System.out.println ( "The sum of "+a+" and "+b+" is "+sum);

		int difference = subtract(a, b);
		System.out.println ( "The subtraction of "+a+" and "+b+" is "+difference);

		int product = multiply(a, b);
		System.out.println ( "The product of "+a+" and "+b+" is "+product);

		try {
			int quotient = divide(a,b);
			System.out.println ( "The quotient of "+a+" divided by "+b+" is "+quotient);
			
		} catch (ArithmeticException e) {
			
			System.err.println("cannot divide by zero");
		}

	}

	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

	private static int multiply(int a, int b) {

		return a * b;
	}

	private static int subtract(int a, int b) {

		return a - b;
	}

	private static int add(int a, int b) {

		return a + b;
	}

}
