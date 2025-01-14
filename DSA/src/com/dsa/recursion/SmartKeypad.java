package com.dsa.recursion;

import java.util.Scanner;

public class SmartKeypad {
	static String[] keypad = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	public static void printKeypadOutput(String input,String output,int i) {
		if(input.isEmpty()) {
			System.out.println(i+"--"+output);
			return;
		}
		char ch = input.charAt(0);
		input = input.substring(1);
		int current_digit = ch - '0';
//		System.out.println(input.charAt(i)+" "+i+" "+current_digit);
		if(current_digit==0 || current_digit==1) {
			printKeypadOutput(input, output, i+1);
		}
		for(int k=0; k<keypad[current_digit].length();k++ ) {
			printKeypadOutput(input, output + keypad[current_digit].charAt(k), i+1);
		}
		return;
		
	}
	public static void main(String[] args) {
		String input;
		String output =" ";
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		System.out.println("->"+input.length());
		printKeypadOutput(input,output,0);
		sc.close();
	}
}
