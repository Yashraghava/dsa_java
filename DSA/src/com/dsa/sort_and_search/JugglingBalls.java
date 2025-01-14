package com.dsa.sort_and_search;

import java.util.Arrays;

//IMPORTANT
public class JugglingBalls {
	static int[] sortBalls(int[] arr) {
		int low=0,hi=arr.length-1;
		int mid=0;
		while(mid<=hi) {//**
			switch(arr[mid]) {
				case 0:{
					int t= arr[low];
					arr[low] = arr[mid];
					arr[mid] = t;
					low++;
					mid++;
					break;
				}
				case 1:{
					mid++;
					break;
				}
				case 2:{
					int t = arr[hi];
					arr[hi] = arr[mid];
					arr[mid] = t;
					hi--;
					break;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,0,1,2,0,1,2,0,1,2,0};
		System.out.println(Arrays.toString(sortBalls(arr)));
	}
}
