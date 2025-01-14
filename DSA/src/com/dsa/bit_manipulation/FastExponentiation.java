package com.dsa.bit_manipulation;

import java.util.Scanner;

public class FastExponentiation {
	//Important̥
	/**
	 * @param a
	 * @param n
	 * @return
	 */
	static int fastExpo(int a,int n) {
		int exp=1;
		while(n>0) {
			int t = n&1;
			if(t==1) {
				exp *= a;
			}
			a*=a;
			n=n>>1;
		}
		return exp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,n;
		a= sc.nextInt();
		n=sc.nextInt();
		System.out.println(fastExpo(a, n));
		sc.close();
	}
}
