package com.java.latest_version;

public class SwitchExpressionRunner {
	static String findDayOfWeek(int day){
		String dayOfWeek = "";
		switch (day) {
		case 0: 
			dayOfWeek = "Sunday";
			break;
		case 1:
			dayOfWeek = "Monday";
			break;
		case 2:
			dayOfWeek = "Tuesday";
			break;
		case 3: 
			dayOfWeek = "Thursday";
			break;
		default:
			dayOfWeek = "Invalid Input";
		}
		
		return dayOfWeek;
	}
	
	static String findDayOfWeekExpression(int day) {
		String dayOfWeek = switch (day) {
		case 0 -> {
			System.out.println("Business Logic");
			yield "Sunday";
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 ->  "Thursday";
		default -> "Invalid Input";
		};
		return dayOfWeek;
	}
	
	public static void main(String[] args) {
		System.out.println(findDayOfWeek(0));
		System.out.println(findDayOfWeekExpression(1));
		System.out.println(findDayOfWeekExpression(0));
	}
}
