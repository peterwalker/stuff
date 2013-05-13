package com.pbw;

public class Quicksort {
	int[] sorted;

	void quicksort(int[] values) {
		this.sorted = values;
		// Check for empty or null array
		if (values == null || values.length == 0) {
			return;
		}
		partition(0, values.length - 1);
	}

	private void partition(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = sorted[low + (high - low) / 2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (sorted[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (sorted[j] > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and decrease j
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		// Recurse left of the pivot
		if (low < j)
			partition(low, j);
		// Recurse right of the pivot
		if (i < high)
			partition(i, high);
	}

	private void swap(int i, int j) {
		int temp = sorted[i];
		sorted[i] = sorted[j];
		sorted[j] = temp;
	}
}
