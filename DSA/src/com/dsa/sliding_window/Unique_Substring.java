package com.dsa.sliding_window;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unique_Substring {
	/**
	 * @param input
	 * @return
	 */
	static String unique_substring(String input) {
		int i = 0, j = 0;
		int window_len = 0;
		int max_window_len = 0;
		int start_window = -1;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		while (j < input.length()) {
			char ch = input.charAt(j);
			// if ch is inside hashmap and idx>= start of current window
			if (m.containsKey(ch) && m.get(ch) >= i) {
				i = m.get(ch) + 1;
				window_len = j - i;
				System.out.println(" i " + i + " j " + j + " wl " + window_len);
			}
			m.put(ch, j);
			window_len++;
			j++;
			// update max window at every step
			if (window_len > max_window_len) {
				max_window_len = window_len;
				start_window = i;
			}
		}
		return input.substring(start_window, start_window + max_window_len);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(unique_substring(input));
		sc.close();
	}
}
