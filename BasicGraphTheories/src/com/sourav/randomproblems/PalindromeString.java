package com.sourav.randomproblems;

public class PalindromeString {
	
	public static void main(String args[]) {
		PalindromeString palindromeString = new PalindromeString();
		System.out.println(palindromeString.checkPalindrome("radar"));
		System.out.println(palindromeString.checkPalindrome("madam"));
		System.out.println(palindromeString.checkPalindrome("mango"));
		System.out.println(palindromeString.checkPalindrome("satoroperatenetareporotas"));
	}
	
	public boolean checkPalindrome(String str) {
		int median = str.length()/2;
		
		if(str.length() % 2 == 0) {
			for(int i = 0, j = str.length() - 1; i<median && j>median+1 ; i++,j--) {
				if(str.charAt(i)!=str.charAt(j)) {
					return false;
				}
			}
		}else {
			for(int i = 0, j = str.length() - 1; i<median && j>median ; i++,j--) {
				if(str.charAt(i)!=str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
