package com.dsa.sort_and_search;

import java.util.Scanner;

//INCOMPLETE
public class QuickSelect2 {
	static int partition(int[] a, int s, int e) {
		int pivot = a[e],i = s - 1;
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

	static int quickselect(int[] a, int s, int e, int k) {
		int p = partition(a, s, e);
		System.out.println("P ->"+p);
		if (p == k) {
			System.out.println("P* ->"+p);
			return a[p-1];
		} else if (k < p) {
			return quickselect(a, s, p - 1, k);
		} else {
			return quickselect(a, p + 1, e, k);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 0, 7, 6, 4 };
		int n = arr.length;
//		quicksort(arr, 0, n - 1);
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(quickselect(arr, 0, n-1, k));
//		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
