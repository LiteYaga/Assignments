package com.del;

import java.util.Scanner;

public class DivisorsOfNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to display its divisors");
		int n = scan.nextInt();
		System.out.println("The divisors of " + n + " are : ");
		for (int i = 1; i <= n/2; i++) {
			
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.print(n + " ");
		System.out.println();
		scan.close();

	}

}
