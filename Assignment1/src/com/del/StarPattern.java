package com.del;

public class StarPattern {

	public static void main(String[] args) {
		int k = 0;

		int rows = 8;

		int limit = -1;
		limit = limit + ((rows / 2) - 1);
		int len = 2 * rows - limit;

		for (int i = 0; i < rows / 2; i++) {
			for (int j = 0; j < len; j++) {

				System.out.print(" ");
			}
			len--;
			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = rows / 2; i < rows; i++) {
			for (int j = 1; j <= (rows - i); j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < (2 * i - limit); j++) {
				System.out.print(" *");
			}

			System.out.println();
		}

	}

}
