package com.dsa.binary_search;

public class Game_of_Greed {
	public static boolean divideAmongK(int[] arr,int n,int k,int min_coins) {
		int partitions = 0;
		int current_friend = 0;
		for(int i=0;i<n;i++) {
			if(current_friend + arr[i] >= min_coins) {
				partitions+=1;
				current_friend=0;
			}
			else {
				current_friend+=arr[i];
			}
		}
		if(partitions>=k) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int k_partition(int[] arr,int n,int k) {
		int s=0,ans=-1,e=0;
		for(int i=0;i<n;i++) {
			e+=arr[i];
		}
		while(s<=e) {
			int mid = (s+e)/2;
			boolean isPossibe = divideAmongK(arr,n,k,mid);
			if(isPossibe) {
				s=mid+1;
				ans=mid;
			}
			else {
				e=mid-1;
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
//		int[] a = {10,22,40,50};
		int[] a = {1,2,3,4};
		int n = a.length;
		int k=3;
		System.out.println(k_partition(a,n,k));
	}
}
