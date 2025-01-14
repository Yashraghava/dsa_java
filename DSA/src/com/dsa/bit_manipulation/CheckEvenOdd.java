package com.dsa.bit_manipulation;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if((x&1) == 1) {
			System.out.println("ODD");
		}
		else {
			System.out.println("EVEN");
		}
		sc.close();
	}
}
