package com.dsa.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;



public class SortSubsequences {

	
	
	public static void subsequence(String s,String o,ArrayList<String> alist) {
		
		
		if(s.length() == 0) {
			alist.add(o);
			return;
		}
		
		char ch = s.charAt(0);
		String reduced_input = s.substring(1);
		
		//includes
		subsequence(reduced_input,o+ch,alist);
		
		
		//excludes
		subsequence(reduced_input, o, alist);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		ArrayList<String> aList = new ArrayList<String>();
		String output = "";
		
		subsequence(s,output,aList);
		
		aList.sort(new Comparator<String>() {
			public int compare(String s1,String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				return s1.length()-s2.length();
			}
		});
		
		System.out.println(aList);
	}
}
