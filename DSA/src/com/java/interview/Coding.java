package com.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Coding {

	public static void main(String[] args) {
		String s = "1-2-3-4-5";
		String[] nos = s.split("-");
		System.out.println(s);
		System.out.println(Arrays.toString(nos));
		System.out.println(nos.toString());
		System.out.println(nos.hashCode());
//		String[] nos2 = nos.clone();
//		System.out.println(Arrays.toString(nos)+" "+Arrays.toString(nos2));
//		System.out.println(nos.hashCode()+" "+nos2.hashCode());
//		System.out.println(nos.toString()+" "+nos2.toString());
		int[] i1 = Arrays.stream(nos).map(d -> d.trim()).mapToInt(d -> Integer.parseInt(d)).toArray();
		System.out.println(Arrays.toString(i1));
		Arrays.stream(i1).forEach(System.out::println);
//		System.out.println("XXXX");
//		Arrays.asList(i1).stream().forEach(System.out::println);
		List<String> l1 = new ArrayList<>(Arrays.asList(nos));
		System.out.println(l1);
		String[] s2 = l1.toArray(String[]::new);
		String[] s3 = l1.toArray(i -> new String[i]);
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(s3));
		String[] s4 = l1.toArray(new String[0]);
		System.out.println(Arrays.toString(s4));
		
		int[] i2 = new int[] {5,4,3,2,1};
		Arrays.sort(i2);
		String s5 = Arrays.toString(i2);
		System.out.println(s5);
		String[] s6 = s5.substring(1,s5.length()-1).split(",");
		System.out.println(Arrays.toString(s6));
		
		System.out.println(List.of(29,17,45,2,18).stream().max((e1,e2) -> e1-e2).get());
		System.out.println(List.of(29,17,45,2,18).stream().max((e1,e2) -> e2-e1).get());
		System.out.println(List.of(29,17,45,2,18).stream().min((e1,e2) -> e1-e2).get());
		System.out.println(List.of(29,17,45,2,18).stream().min((e1,e2) -> e2-e1).get());
		
		System.out.println(IntStream.of(10,100,200,300,400).max().getAsInt());
		System.out.println(IntStream.of(10,100,200,300,400).min().getAsInt());
		IntStream.of(10,100,200,300,400).max().ifPresent(e -> System.out.println(e));
		IntStream.of(10,100,200,300,400).min().ifPresent(e -> System.out.println(e));
		List<Integer> aList = List.of(120,121,122,123,124);
//		List<Integer> aList = List.of(120);
		System.out.println("PRINTING OF ARRAY -> "+aList.toString());
		for(int a:aList) {
			System.out.println(a);
		}
		StringBuilder sb = new StringBuilder("");
		sb.append("(");
//		for (int a : aList) {
//			sb.append("'");
//			sb.append(a);
//			sb.append("',");
//		}
		aList.stream().forEach((a) -> {sb.append("'");sb.append(a);sb.append("',");});
		int lastComma = sb.lastIndexOf(",");
		System.out.println(lastComma);
		sb.replace(lastComma, lastComma+1, ")");
		String str=sb.toString();
		System.out.println(str);
	}
}
