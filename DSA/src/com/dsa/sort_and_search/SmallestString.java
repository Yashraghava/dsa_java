package com.dsa.sort_and_search;

import java.util.Arrays;
import java.util.Comparator;

public class SmallestString {
	public static void main(String[] args) {
		String[] arr = {"a","ab","aba"};
		int n=3;
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1,String s2) {
				return (s1+s2).compareTo(s2+s1);
			}
		});
		
//		System.out.println(Arrays.toString(arr));
		StringBuilder s = new StringBuilder();
		for(String t:arr) {
			s.append(t);		
			}
		System.out.println(s.toString());
//		System.out.println(s.getClass());
//		System.out.println(s.hashCode());
//		StringBuilder s2 =  s.clone();
	}

}
