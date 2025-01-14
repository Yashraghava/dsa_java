package com.dsa.bit_manipulation;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(((n) & (n-1)) == 0 ) {
			System.out.println("Power of 2");
		}
		else {
			System.out.println("Not a Power of 2");
		}
		sc.close();
	}

}
