package com.del;

public class SquarePrime {

	public static void main(String[] args) {
		boolean status = false;
		int limit = 900;
		int iteration = (int) Math.sqrt(limit);

		for (int i = 2; i < iteration; i++) {
			status = isPrime(i);
			if (status) {
				//System.out.print(i + " ");
				int square = i * i;
				if (square >= limit) {
					break;
				}
				System.out.print(square+" ");
				
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
