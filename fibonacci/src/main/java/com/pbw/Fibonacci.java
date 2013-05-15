package com.pbw;

public class Fibonacci {
	int[] sequence(int value) {
		int[] result = new int[value + 1];
		for (int i = 0; i <= value; ++i) {
			result[i] = fibCalc(i);
		}
		return result;
	}

	// *TODO memoize
	private int fibCalc(int value) {
		if (value == 0)
			return 0;
		if (value == 1)
			return 1;
		return fibCalc(value - 1) + fibCalc(value - 2);
	}
}
