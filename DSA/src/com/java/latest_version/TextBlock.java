package com.java.latest_version;

public class TextBlock {
	public static void main(String[] args) {
		String s1="Hello World!";
		String s2="""
				Hello World!
				""";
		String s3="""
				Hello World!""";
		String s4 ="""
				"Line1"
				Line2
				Line3
				""";
		String s5 ="""
				"Line1"
				Line2
				  Line3
				Line4""";
		String s6 ="""
				"Line1"
				Line2
				  Line3
				Line4: %s
				Line5: %s
				Line6
				""".formatted("value1","value2");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}
