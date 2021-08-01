package com.sourav.randomproblems;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		Anagrams anagrams = new Anagrams();
		System.out.println(anagrams.isAnagram("restful", "fluster"));
	}
	
	public boolean isAnagram(String str1, String str2) {
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		for(int i = 0; i<str1.length(); i++) {
			if(chars2[i] != chars1[i]) {
				return false;
			}
		}
		
		return true;
	}

}
