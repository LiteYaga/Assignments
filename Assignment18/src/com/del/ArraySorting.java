package com.del;

import java.util.Scanner;

public class ArraySorting {

	private static void sort(int[] a, int[] b) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (b[j] > b[j + 1]) {
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	private static void resort(int[] a, int[] b) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (b[j] == b[j + 1]) {
					if (a[j] > a[j + 1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int num = 0, digit = 0, sum = 0;
		System.out.println("Enter " + n + " natural numbers >0");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			num = a[i];
			sum = 0;
			while (num > 0) {
				digit = num % 10;
				sum = sum + digit;
				b[i] = sum;
				num = num / 10;
			}
		}
		sort(a, b);
		resort(a, b);
		System.out.println();
		System.out.println("final Array");
		for (int i = 0; i < n; i++) {
		System.out.print(a[i] + " ");
		}
	}
}