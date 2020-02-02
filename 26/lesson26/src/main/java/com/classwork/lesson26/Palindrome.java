package com.classwork.lesson26;

public class Palindrome {
	public boolean isPalindrom(String a) {
		for (int i = 0; i < a.length() / 2; i++) {
			if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
