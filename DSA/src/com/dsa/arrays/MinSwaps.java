package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class Pair{
	int first,second;

	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
}
class Gfg{
	public static int minSwaps(int[] arr) {
		int n = arr.length;
		ArrayList<Pair> arrpos = new ArrayList<Pair>();
		for(int i=0;i<n;i++) {
			arrpos.add(new Pair(arr[i],i));
		}
		arrpos.sort(
				new Comparator<Pair>() {
					public int compare(Pair o1,Pair o2) {
						if(o1.first < o2.first) {
							return -1;
						}else if(o1.first == o2.first) {
							return 0;
						}
						else {
							return 1;
						}
					}
				});
		Boolean[] vis = new Boolean[n];
		Arrays.fill(vis, false);
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			if(vis[i] || arrpos.get(i).second == i) {
				continue;
			}
			int cycle_size=0,j=i;
			while(!vis[j]) {
				vis[j] = true;
				j= arrpos.get(j).second;
				cycle_size++;
			}
			if(cycle_size > 0) {
				ans+= (cycle_size-1);
			}
		}
		return ans;
	}
}

public class MinSwaps {
	
	public static void main(String[] args) {
		int[] a = {10,11,5,4,3,2,1};
		Gfg g = new Gfg();
		System.out.println(g.minSwaps(a));
	}

}
