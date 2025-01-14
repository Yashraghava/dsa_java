package com.dsa.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RunLengthCoding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		Map<String,Integer> valueMap = new LinkedHashMap<String, Integer>();
		for(int i=0;i<s.length();i++) {
			String s1 = String.valueOf(s.charAt(i));
			valueMap.put(s1, valueMap.getOrDefault(s1, 0)+1);
		}
		for(String t:valueMap.keySet()) {
			sb.append(t);
			sb.append(valueMap.get(t));
		}
		System.out.println(sb);
		sc.close();
	}
}
