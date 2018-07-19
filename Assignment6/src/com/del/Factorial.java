package com.del;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the whole number");
		try {
			number = sc.nextInt();
			if (number < 0) {
				throw new Exception();
			} else {
				int fact = findFactorial(number);
				System.out.println("The factorial of " + number + " is " + fact);

			}
		} catch (Exception e) {
			System.err.println("You did not enter a whole number");
			sc.nextLine();
		}

	}

	public static int findFactorial(int number) {

		if (number == 0) {
			return 1;
		} else {
			return number * findFactorial(--number);
		}
	}

}
