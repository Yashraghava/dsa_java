package com.java.latest_version;

import java.util.List;
import java.util.stream.Stream;

public class StringUtility {
	public static void main(String[] args) {
		System.out.println(" ".isBlank());
		Stream<String> lines = "Line1\nLine2\nLine3\nLine4".lines();
		System.out.println("lines -> "+lines);
		lines.forEach(System.out::println);
		System.out.println("UPPER".transform(s -> s.substring(2)));
		
		List<Character> var1 = List.of('A','B');
		List<Character> var2 = List.of('C','D');
		var chars = List.of(var1,var2);
		for(var c : chars) {
			System.out.println(c);
		}
 	}

}
