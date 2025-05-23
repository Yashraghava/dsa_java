package com.dsa.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Minimum_Swaps {

	public static int countMinSwaps(int[] arr) {
		int n=arr.length;
		int ans = 0;
		Map<Integer,Integer> ap = new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			ap.put(arr[i],i);
		}
		
		System.out.println("------>"+ap.toString());
		
		System.out.println("---->"+ ap);
		int[] visited = new int[n];
		Arrays.fill(visited, 0);
//		System.out.println("----->"+Arrays.toString(visited));
		
		for(int i=0;i<n;i++) {
			int oldposition = ap.get(arr[i]);
			if(visited[i]==1 || oldposition==i) {
				continue;
			}
			int node=i;
			int cycle=0;
			while(visited[node] == 0) {
				visited[node] = 1;
				int next_node = ap.get(node);
				node = next_node;
				cycle+=1;
			}
			ans += (cycle-1);
		}
		
 		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		System.out.println(countMinSwaps(arr));
	}
}
