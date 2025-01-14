package com.dsa.sliding_window;
// Java program to count subarrays having sum K
// using Hash Map
import java.util.*;

class cntSubarrays {
	// Function to find number of subarrays with sum as k
	static int countSubarrays(int[] arr, int k) {
		// HashMap to store prefix sums frequencies
		Map<Integer, Integer> prefixSums = new HashMap<>();
		int res = 0;
		int currSum = 0;
		for (int i = 0; i < arr.length; i++) {
			// Add current element to sum so far.
			currSum += arr[i];
			// If currSum is equal to desired sum, then a new subarray is found.
			if (currSum == k) {
				System.out.println("P1 | i -> " + i);
				res++;
			}
			// Check if the difference exists in the prefixSums map.
			if (prefixSums.containsKey(currSum - k)) {
				System.out.println("P2 | i -> " + i + " | currSum -> " + currSum + " | pfs -> " + prefixSums.toString()
						+ " | pfscs -> " + prefixSums.get(currSum - k));
				res += prefixSums.get(currSum - k);
			}
			// Add currSum to the set of prefix sums.
			prefixSums.put(currSum, prefixSums.getOrDefault(currSum, 0) + 1);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = { 10, 2, -2, -20, 10 };
		int k = -10;
		System.out.println(countSubarrays(arr, k));
	}
}