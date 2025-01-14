package com.dsa.arrays;

class KadaneAlgorithm {
	//Important
	private static int maxSubarraySum(int[] a) {
		// TODO Auto-generated method stub
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE , max_ending_here= 0;
		for(int i=0;i<size;i++) {
			max_ending_here = max_ending_here + a[i];
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if(max_ending_here<0) {
				max_ending_here = 0;
			}
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.println(maxSubarraySum(arr));
	}

}