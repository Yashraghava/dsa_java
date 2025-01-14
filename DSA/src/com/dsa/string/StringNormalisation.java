package com.dsa.string;

import java.util.Scanner;

public class StringNormalisation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder s1 = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(i==0 || s.charAt(i-1)==' ') {
				String t= String.valueOf(s.charAt(i));
				s1.append(t.toUpperCase());
			}
			else {
				String t= String.valueOf(s.charAt(i));
				s1.append(t.toLowerCase());
			}
		}
		System.out.println(s1);
	}
}
