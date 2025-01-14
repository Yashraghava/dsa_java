package com.dsa.bit_manipulation;

//IMPORTANT
public class ReplaceBits {

	static int clearBitsInRange(int n,int i,int j) {
		int a = (~0)<<j+1;
		int b= (1<<i) - 1;
		int mask = a | b;
		n = n & mask;
		return n;
	}
	static int replaceBits(int n,int i,int j,int m) {
		n = clearBitsInRange(n, i, j);
		int mask = (m<<i);
		n = n| mask;
		return n;
	}
	public static void main(String[] args) {
		int n=15;
		int i=1;
		int j=3;
		int m = 2;
		n = replaceBits(n,i,j,m);
		System.out.println(n);
		
	}
}
