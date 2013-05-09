package com.pbw;

public class Quicksort {
	int[] sorted;

	void sort(int[] values) {
		this.sorted = values;
		// Check for empty or null array
		if (values == null || values.length == 0) {
			return;
		}
		quicksort(0, values.length - 1);
	}

	private void quicksort(int low, int high) {
		System.out.println("quicksort low=" + low + " high=" + high);
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
			// As we are done we can increase i and j
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		printNumbers();
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void swap(int i, int j) {
		int temp = sorted[i];
		sorted[i] = sorted[j];
		sorted[j] = temp;
	}

	private void printNumbers() {
		System.out.print("numbers =");
		for (int i = 0; i < sorted.length; ++i) {
			System.out.print(" " + sorted[i] + " ");
		}
		System.out.println();
	}
}
