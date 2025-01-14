package com.dsa.string;

import java.util.Scanner;

public class DigitalClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in;
		in = sc.nextInt();
		int hour = (in/60);
		int min = in - (hour*60);
		String time = hour+":"+ ((min<10)?"0"+min:min);
		System.out.println(time);
	}
}
