package com.pbw;

public class FizzBuzz {
	public String check(int value) {
		String result = "";
		if (value % 3 == 0 && value % 5 == 0) {
			result = "FizzBuzz";
		} else if (value % 3 == 0) {
			result = "Fizz";
		} else if (value % 5 == 0) {
			result = "Buzz";
		}
		return result;
	}
}
