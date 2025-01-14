package com.dsa.binary_search;

import java.util.ArrayList;
import java.util.List;

public class lower_bound {
	static int lower_bound_func(List<Integer> alist,int key) {
		int l=0,r=alist.size()-1;
		int mid = (l+r)/2,ans=-1;
		while(l<=r) {
			mid=(l+r)/2;
			if(alist.get(mid) == key) {
				ans=mid;
				r=mid-1;
			}
			else if(alist.get(mid)>key) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return ans;
	}
	

	static int upper_bound_func(List<Integer> alist,int key) {
		int l=0,r=alist.size()-1;
		int mid = (l+r)/2,ans=-1;
		while(l<=r) {
			mid=(l+r)/2;
			if(alist.get(mid) == key) {
				ans=mid;
				l=mid+1;
			}
			else if(alist.get(mid)>key) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<Integer>();
		int i;
		alist.add(0);
		for(i=0;i<2;i++) {
			alist.add(1);
		}
		for(i=0;i<1;i++) {
			alist.add(2);
		}
		for(i=0;i<4;i++) {
			alist.add(3);
		}
		for(i=0;i<1;i++) {
			alist.add(4);
		}
		for(i=0;i<3;i++) {
			alist.add(5);
		}
		for(i=0;i<1;i++) {
			alist.add(10);
		}
		System.out.println(lower_bound_func(alist, 5));
		System.out.println(upper_bound_func(alist, 5));
		
	}
}
