
package com.java.latest_version;

import java.time.DayOfWeek;

public class SwitchEnumRunner {
	public static void main(String[] args) {
		DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
		String str =switch(dayOfWeek) {
		case MONDAY -> "First Day of the Work Week";
		case TUESDAY,WEDNESDAY,THURSDAY -> "Middle of the Work Week";
		case FRIDAY -> "Last Day of the Work Week";
		default -> "Weekend";
		};
		System.out.println(str);
	}

}
