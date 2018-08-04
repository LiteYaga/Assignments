package com.del;

public class SumAtPrime {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1 };

		int sum = getSumAtPrime(arr);
		System.out.println();
		System.out.println();
		System.out.println("Sum is : " + sum);

	}

	private static int getSumAtPrime(int[] arr) {
		int sum = 0;
		System.out.println("prime indices are: ");
		for (int i = 0; i < arr.length; i++) {
			boolean check = isPrime(i);
			if (check) {
				System.out.print(i + " ");
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	private static boolean isPrime(int i) {
		int count = 0;
		if (i == 0 || i == 1) {
			return false;
		} else {
			for (int j = 2; j <= i/ 2; j++) {
				if (i % j == 0) {
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

}
