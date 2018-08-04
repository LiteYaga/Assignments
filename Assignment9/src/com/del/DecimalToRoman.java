package com.del;

public class DecimalToRoman {

	public static void main(String[] args) {

		String m[] = { "", "M", "MM", "MMM", "MMMM" };
		String c[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String x[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String i[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		String ans = "";
		// Converting to Roman from 1 t0 3000

		for (int decimal = 1; decimal < 3001; decimal++) {
			
			String thousands = m[decimal / 1000];
			String hundereds = c[(decimal % 1000) / 100];
			String tens = x[(decimal % 100) / 10];
			String ones = i[decimal % 10];
			ans = thousands + hundereds + tens + ones;
			System.out.println(decimal + "-" + ans);
		}
      
	}

}
