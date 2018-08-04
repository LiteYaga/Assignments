package com.del;

import java.util.Scanner;

public class NumberUtil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			double a = 0, b = 0;
			double prod = 0, root = 0;

			System.out.println("enter choice");
			System.out.println("1. product");
			System.out.println("2. square root");
			System.out.println("3. exit");

			int choice = 0;

			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.err.println("please enter integer");
				sc.nextLine();
			}

			switch (choice) {

			case 1:

				System.out.println("enter first number");
				try {
					a = sc.nextDouble();
					System.out.println("enter second number");
					b = sc.nextDouble();
					prod = product(a, b);
					System.out.println("the product is " + prod);
				} catch (Exception e) {

					System.err.println("please enter numbers ");
					sc.nextLine();
				}

				break;

			case 2:

				System.out.println("enter the number");
				try {
					a = sc.nextDouble();
					try {
						root = squareRoot(a);
						System.out.println("the square root is " + root);
					} catch (Exception e) {
						System.err.println("Cannot find the root of negative number");
					}
				} catch (Exception e) {
					System.err.println("please enter a number");
					sc.nextLine();
				}

				break;

			case 3:
				System.out.println("exiting...");
				System.exit(0);

			default:
				System.err.println("please enter correct choice");

			}

		}

	}

	private static double squareRoot(double a) throws Exception {
		if (a < 0) {
			throw new Exception();
		} else {
			return Math.sqrt(a);
		}

	}

	private static double product(double a, double b) {
		return a * b;

	}

}
