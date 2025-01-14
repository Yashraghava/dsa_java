package com.dsa.bit_manipulation;

import java.util.Scanner;

public class CountingBits {
	static int count_bits(int n) {
		int count = 0;
		while(n>0) {
			int last_bit = (n&1);
			count+=last_bit;
			n=n>>1;
		}
		return count;
	}
//IMPORTANT
	static int count_bits_hack(int n) {
		int count=0;
		while(n>0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(count_bits(n));
		System.out.println(count_bits_hack(n));
		sc.close();
	}
}
