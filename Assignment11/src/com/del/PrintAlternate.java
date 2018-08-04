package com.del;

public class PrintAlternate {

	public static void main(String[] args) {
		
		int firstFrom=8;
		int firstTo=13;
		int secondFrom=6;
		int secondTo=1;
		
		int iteration1=Math.abs(firstFrom-firstTo);
		int iteration2=Math.abs(secondFrom-secondTo);
		
		for(int i=0;(i<=iteration1)||(i<=iteration2);i++) {
		System.out.print((firstFrom++)+" "+(secondFrom--)+" ");
			
		}
		

	}

}
