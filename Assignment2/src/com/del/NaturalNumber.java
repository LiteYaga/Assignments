package com.del;

public class NaturalNumber {

	public static void main(String[] args) {
		
		int number=50;
		
		for(int i=1;i<=number;i++) {
			if(i%3==0) {
				if(i%5==0) {
					System.out.print("abcxyz ");
				}
				else {
					System.out.print("abc ");
				}
			}
			else if(i%5==0) {
				System.out.print("xyz ");
			}
			else {
				System.out.print(i+" ");
			}
		}
		

	}

}
