package com.dsa.sliding_window;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Smallest_Distinct_Window {
	static String smallest_window(String s) {
		int idx=0;
		int start_idx=-1;
		int curr_idx=-1;
		int max_so_far=0;
		int cnt=0;
		Map<Character,Integer> window = new HashMap<Character,Integer>();
		Map<Character,Integer> result = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
//			window.put(ch,i);
			System.out.println("A = "+ch);
			if(!window.containsKey(ch)) {
				System.out.println("B = "+ch);
				cnt++;
				window.put(ch,i);
				if(window.size()==1) {
					curr_idx=i;
				}
				
				if(window.size()>max_so_far) {
					max_so_far = window.size();
					result.clear();
					result.putAll(window);
				}
			}
			else {
				curr_idx=window.remove(ch);
				window.put(ch,i);
//				window.put(ch,window.getOrDefault(ch, 0) +1);
				}
		}
//		return s.substring(start_idx, start_idx+max_so_far);
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(smallest_window(s));
		sc.close();
	}
}