package com.dsa.sort_and_search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//INCOMPLETE
public class ICPC_Standing {
	static int badness(Map<String, Integer> map) {
		int n=map.size();
		Map<Integer ,Integer> count = new HashMap<Integer, Integer>();
		for(int i=0;i<n+1;i++) {
			count.put(i, 0);
		}
		for(String s:map.keySet()) {
			count.put(map.get(s),count.getOrDefault(map.get(s),0)+1);
		}
		int pos=1,sum=0;
		for(int i=1;i<n+1;i++) {
			while(count.get(i) > 0) {
				sum += Math.abs(i-pos);
				count.put(i,count.get(i)-1 );
				pos++;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> teams = new HashMap<String, Integer>();
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			String ip=sc.next();
//			int no  = sc.nextInt();
//			teams.put(ip,no);
//		}
		teams.put("WinOrBooze",1);
		teams.put("BallOfDuty",2);
		teams.put("WhoKnows",2);
		teams.put("BholeChature",1);
		teams.put("DCECoders",5);
		teams.put("StrangeCase",7);
		teams.put("WhoKnows",7);
		System.out.println(badness(teams));
		for(String s:teams.keySet()) {
			System.out.println(s);
			System.out.println(teams.get(s));
		}
		sc.close();
	}
}

//WinOrBooze 1
//BallOfDuty 2
//WhoKnows 2
//BholeChature 1
//DCECoders 5
//StrangeCase 7
//WhoKnows 7
