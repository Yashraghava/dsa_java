package com.dsa.recursion;

import java.util.Arrays;

class GameOfCoinOptimal {

	static int oSRec(int[] arr, int i, int j, int sum) {
		if (j == i + 1) {
			System.out.println("i -> "+i+" j -> "+j+" max ->"+Math.max(arr[i], arr[j]));
			return Math.max(arr[i], arr[j]);
		}
		// For both of your choices, the opponent gives you total sum minus maximum of
		// his value
		return Math.max((sum - oSRec(arr, i + 1, j, sum - arr[i])), (sum - oSRec(arr, i, j - 1, sum - arr[j])));
//		return Math.max((oSRec(arr, i + 1, j, sum - arr[i])), (oSRec(arr, i, j - 1, sum - arr[j])));
		
	}

	// Returns optimal value possible that a player can
	// collect from an array of coins of size n. Note
	// than n must be even
	static int optimalStrategyOfGame(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum -> "+sum);
		return oSRec(arr, 0, n - 1, sum);
	}

	// Driver code
	static public void main(String[] args) {
		int n;
//		int[] arr1 = { 8, 15, 3, 7 };
//		n = arr1.length;
//		System.out.println(optimalStrategyOfGame(arr1, n));
//
//		int[] arr2 = { 2, 2, 2, 2 };
//		n = arr2.length;
//		System.out.println(optimalStrategyOfGame(arr2, n));

		int[] arr3 = { 20, 30, 2, 2, 2, 10 };
		n = arr3.length;
		System.out.println(optimalStrategyOfGame(arr3, n));
	}
}

// This code is contributed by anuj_67..
