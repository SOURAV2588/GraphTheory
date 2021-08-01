package com.sourav.randomproblems;

public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		System.out.println(reverseInteger.reverseInt(123));
	}
	
	public int reverseInt(int number) {
		int reversed = 0;
		int remainder=0;
		
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			reversed = reversed*10 + remainder;
		}
		
		return reversed;
	}

}
