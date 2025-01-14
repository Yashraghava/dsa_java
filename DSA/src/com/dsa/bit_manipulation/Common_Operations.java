package com.dsa.bit_manipulation;

import java.util.Scanner;

public class Common_Operations {
	static int getIthBit(int n,int i) {
		int mask = (1<<i);
		return (n&mask) > 0 ? 1:0;
	}
	
	static int setIthBit(int n, int i) {
		int mask = (1<<i);
		n = n| mask;
		return n;
	}
	static int clearIthBit(int n,int i) {
		int mask = ~(1<<i);
		n= n&mask;
		return n;
	}
	static int updateIthBit(int n,int i,int v) {
		n = clearIthBit(n, i);
		int mask = (v<<i);
		n=n|mask;
		return n;
	}
	static int clearLastBits(int n, int i) {
		int mask = (-1)<<i;
		return n&mask;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= 13;
		int i = sc.nextInt();
//		System.out.println(getIthBit(n, i));
//		System.out.println(setIthBit(n,i));
//		System.out.println(clearIthBit(n,i));
//		System.out.println(updateIthBit(n, i, 1));
		System.out.println(clearLastBits(n, i));
		System.out.println(~0);
		sc.close();
	}
}
