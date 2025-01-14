package com.dsa.sliding_window;

import java.util.HashMap;
import java.util.Scanner;

public class Smallest_Distinct_Window_2 {
	static String unique_substring(String s) {
		int i = 0, j = 0;
		int window_len = 0;
		int max_window_len = 0;
		int start_window = -1;
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		while (j < s.length()) {
			char ch = s.charAt(j);
			// if it is inside hashmap & idx>= start of current window
			if (m.containsKey(ch) && m.get(ch) >= i) {
				i = m.get(ch) + 1;
				window_len = j - i;// updated remaining window length excluding current char
			}
			m.put(ch, j);
			window_len++;
			j++;
			// update max_window_len at every step
			if (window_len > max_window_len) {
				max_window_len = window_len;
				start_window = i;
			}
		}
		return substringutil(s, start_window, max_window_len);
	}
	static String substringutil(String s, int start_window, int i) {
		int inc = start_window;
		StringBuilder s1 = new StringBuilder();
		while (i != 0) {
			s1.append(s.charAt(inc));
			inc++;
			i--;
		}
		return s1.toString();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(unique_substring(str));
		s.close();
	}
}
