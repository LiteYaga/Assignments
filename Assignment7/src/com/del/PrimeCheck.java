package com.del;

public class PrimeCheck {

	public static void main(String[] args) {

		int num = 11; // number you want to check

		if (num == 0 || num == 1) {
			System.out.println("Not Prime");
		} else {

			boolean status = isPrime(num);
			if (status == true) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}

	}

	private static boolean isPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}

		}
		if (count != 0) {
			return false;
		} else {
			return true;
		}

	}

}
