package com.dsa.sort_and_search;

import java.util.Vector;

public class Inversion_Count {
	
	static int merge(int[] A, int s, int e) {
		int m = (s + e) / 2;
		int i = s, j = m + 1;
		Vector<Integer> temp = new Vector<>();
		int cnt = 0;
		while (i <= m && j <= e) {
			if (A[i] < A[j]) {
				temp.add(A[i]);
				i++;
			} else {
				cnt += (m - i + 1);
				temp.add(A[j]);
				j++;
			}
		}
		// copy rem elements from first array
		while (i <= m) {
			temp.add(A[i++]);
		}
		// or copy rem elements from second array
		while (j <= e) {
			temp.add(A[j++]);
		}
		// copy back the elements from temp to original array
		int k = 0;
		for (int idx = s; idx <= e; idx++) {
			A[idx] = temp.get(k++);
		}
		return cnt;
	}

	public static int inversion_count(int[] Array, int left, int right) {
		int CI = 0, C1 = 0, C2 = 0;
		if (right > left) {
			int m = (left + right) / 2;
			C1 = inversion_count(Array, left, m);
			C2 = inversion_count(Array, m + 1, right);
			CI = merge(Array, left, right);
		}
		return C1 + C2 + CI;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 5, 2, 3, 1 };
//			printArray(arr);
		System.out.println(inversion_count(arr, 0, arr.length - 1));
		printArray(arr);
	}

}
