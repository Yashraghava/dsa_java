package com.dsa.sliding_window;

public class Housing {
	
	static void housing(int[] plots,int n,int k) {
		int i=0,j=0,cs=0;
		while(j<n) {
			cs+=plots[j];
			j++;
			while(cs>k && i<j) {
				cs-=plots[i];
				i++;
			}
			if(cs == k) {
				System.out.println(i+" "+(j-1));
			}
		}
	}
	
	public static void main(String[] args) {
		int[] plots = {1,3,2,1,4,1,3,2,1,1};
		int n= plots.length;
		int k=8;
		housing(plots,n,k);
	}
}
