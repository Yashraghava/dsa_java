package com.dsa.recursion;

//Important
public class CountSubsets {
	public static int count_subsets(int[] arr, int n, int i, int X) {
		if (i == n) {
			if (X == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		int inc = count_subsets(arr, n, i + 1, X - arr[i]);
		int exc = count_subsets(arr, n, i + 1, X);
		return inc + exc;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int X = 10;
		System.out.println(count_subsets(arr, arr.length, 0, X));
	}

}
