package com.dsa.recursion;

import java.util.Scanner;

//Important
public class ladders {

	public static int countWays(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		return countWays(n-1) + countWays(n-2) + countWays(n-3);
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(countWays(n));
		sc.close();
	}
}
