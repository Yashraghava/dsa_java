package com.dsa.sort_and_search;

import java.util.Arrays;

public class QuickSort2 {

	static int partition(int[] a, int s, int e) {
		int pivot = a[e];
		int i = s - 1;
		for (int j = s; j < e; j++) {
			if (a[j] < pivot) {
				i++;
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}

		int t = a[i + 1];
		a[i + 1] = a[e];
		a[e] = t;
		return i + 1;
	}

	static void quicksort(int[] a, int s, int e) {
		if (s >= e) {
			return;
		}
		int p = partition(a, s, e);
		quicksort(a, s, p - 1);
		quicksort(a, p + 1, e);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 0, 7, 6, 4 };
		int n = arr.length;
		quicksort(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));
	}
}
