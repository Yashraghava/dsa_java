package com.dsa.sliding_window;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_Window {
	// Important
	static String find_Window(String s, String p) {
		Map<Character, Integer> FP = new HashMap<Character, Integer>();
		Map<Character, Integer> FS = new HashMap<Character, Integer>();
		for (int i = 0; i < p.length(); i++) {
			FP.put(p.charAt(i), FP.getOrDefault(p.charAt(i), 0) + 1);
		}
		System.out.println(FP.toString());
		int cnt = 0,start = 0,min_so_far = Integer.MAX_VALUE,start_idx = -1;
		for (int i = 0; i < s.length(); i++) {
			// expand the window by including current character
			char ch = s.charAt(i);
			FS.put(ch, FS.getOrDefault(ch, 0) + 1);
			// Count how many characters have been matched till now(string and pattern)
			if (FP.containsKey(ch) && FS.get(ch) <= FP.get(ch)) {
				cnt++;
			}
			// After knowing that all the characters of pattern are in current window,
			// we can start contracting the current window for optimal solution
			if (cnt == p.length()) {
				// start contracting from left to remove unwanted characters
				while (!FP.containsKey(s.charAt(start)) || FS.get(s.charAt(start)) > FP.get(s.charAt(start))) {
					FS.put(s.charAt(start), FS.get(s.charAt(start)) - 1);
					start++;
				}
				int window_size = i - start + 1;
				if (window_size < min_so_far) {
					min_so_far = window_size;
					start_idx = start;
				}
			}
		}
		if (start_idx == -1) {
			return "No Window Found";
		}
		return s.substring(start_idx, start_idx + min_so_far);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		System.out.println(find_Window(s, p));
		sc.close();
	}
}
