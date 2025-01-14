package com.dsa.sort_and_search;

import java.util.Arrays;

public class QuickSort {

	static int partition(int[] arr, int start, int end) {
		System.out.println("part(" + start + " , " + end + ")");
//		int pivot = (start+end)/2;
		int pivot = end;
		int i = start - 1;
		for (int j = start; j <= end; j++) {
			if (arr[j] <= arr[pivot]) {
				i++;
				int temp = arr[i];
				System.out.println("i " + i + " j " + " temp " + temp);
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}

	static void quicksort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			quicksort(arr, start, pivot - 1);
			quicksort(arr, pivot + 1, end);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 0, 7, 6, 4 };
//		int len = arr.length;
		quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
