package com.dsa.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BiggestNumberString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] snos = line.split(",");
//		System.out.println(Arrays.deepToString(snos));
		
		
//		List<Integer> nos = Arrays.stream(snos).map(Integer::valueOf).collect(Collectors.toList());
		List<String> nos2 = Arrays.asList(snos);
//		System.out.println(nos2);
		
		nos2.sort(
				new Comparator<String>() {
					public int compare(String s1,String s2) {
						return (s2+s1).compareTo(s1+s2);
					}
				});
		
		System.out.println(nos2);
	}
}
/*
nos.sort(
		new Comparator<Integer>() {
			public int compare(Integer i1,Integer i2) {
				String s1 = i1.toString();
				String s2 = i2.toString();
				int l = s1.length()>s2.length()?s2.length():s1.length();
				System.out.println("****"+s1+" "+s2);
				for(int i=0;i<l;i++) {
					if(Integer.valueOf(s1.charAt(i)) < Integer.valueOf(s2.charAt(i))) {
						System.out.println("A"+i2+" "+i1);
						return i2-i1;
					}
					else if(Integer.valueOf(s1.charAt(i)) > Integer.valueOf(s2.charAt(i))) {
						System.out.println("B"+i1+" "+i2);
						return i1-i2;
					}
					else {
						continue;
					}
				}
				if(s1.length()>s2.length())
					{
						System.out.println("A"+i2+" "+i1);
						return i2-i1;
					}
				else{
					System.out.println("B"+i1+" "+i2);
					return i1-i2;
				}
			}
		});*/