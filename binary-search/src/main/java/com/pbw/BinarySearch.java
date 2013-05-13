package com.pbw;

public class BinarySearch {

	int bsearch(int[] sorted, int value) {
		int left, right, middle;

		left = 0;
		right = sorted.length - 1;

		while (left <= right) {
			middle = ((left + right) / 2);
			if (value == sorted[middle]) {
				return (middle);
			}
			if (value > sorted[middle]) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return (-1);
	}
}
