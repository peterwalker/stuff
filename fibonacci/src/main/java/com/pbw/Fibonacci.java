package com.pbw;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

	int[] sequence(int value) {
		cache.put(0, 0);
		cache.put(1, 1);
		int[] result = new int[value + 1];
		for (int i = 0; i <= value; ++i) {
			result[i] = fibCalc(i);
		}
		return result;
	}

	private int fibCalc(int value) {
		Integer cachedValue = cache.get(value);
		if (cachedValue != null)
			return cachedValue.intValue();
		System.out.println("Calculating Fib for " + value);
		int result = fibCalc(value - 1) + fibCalc(value - 2);
		cache.put(value, result);
		return result;
	}

}
