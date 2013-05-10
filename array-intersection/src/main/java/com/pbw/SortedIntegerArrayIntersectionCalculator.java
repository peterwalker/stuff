package com.pbw;

import java.util.Arrays;

public class SortedIntegerArrayIntersectionCalculator {

	public int[] intersection(int[] sortedlhs, int[] sortedrhs) {
		int[] result = new int[Math.max(sortedlhs.length, sortedrhs.length)];
		int count = 0;
		int rhsStartIndex = 0;
		for (int i : sortedlhs) {
			for (int j = rhsStartIndex; j < sortedrhs.length; ++j) {
				if (i == sortedrhs[j]) {
					result[count] = i;
					++count;
				}
				if (i > sortedrhs[j]) {
					rhsStartIndex = j + 1;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
