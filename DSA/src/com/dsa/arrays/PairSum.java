package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;
public class PairSum {	
	static ArrayList<Integer> pairSum(int[] arr,int s){
		List<Integer> t = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			int x = s - arr[i];
			if(t.contains(x)) {
				result.add(x);
				result.add(arr[i]);
				return result;
			}
			t.add(arr[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,2,3,-6,9,11};
		int S=4;
		List<Integer> alist = new ArrayList<Integer>();
		alist = pairSum(arr,S);
		if(alist.size() == 0) {
			System.out.println("NO SUCH PAIR");
		}
		else {
		System.out.println(alist);
		}
	}
}
