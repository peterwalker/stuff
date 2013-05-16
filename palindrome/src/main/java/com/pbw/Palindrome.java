package com.pbw;

public class Palindrome {
	boolean isPalindrome(String word) {
		String reversed = new StringBuffer().append(word).reverse().toString();
		return word.equalsIgnoreCase(reversed);
	}
}
