package com.java.interview;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		System.out.println(s1.add(1));
		System.out.println(s1.add(2));
		System.out.println(s1.add(1));
		System.out.println(s1);
		Set<Integer> s2 = new TreeSet<Integer>();
		System.out.println(s2.add(1));
		System.out.println(s2.add(2));
		System.out.println(s2.add(1));
		System.out.println(s2);
		}
}
