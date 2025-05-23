package com.java.latest_version;

import java.util.ArrayList;

public class SequencedListRunner {
	public static void main(String[] args) {
		var courseDetails =  new ArrayList<>();
		courseDetails.add("Spring Boot");
		courseDetails.add("Spring Security");
		courseDetails.add("Spring Boot in AI");
		
		courseDetails.add("Cloud Computing with AWS");	
		courseDetails.add("Cloud Computing with Azure");
		System.out.println("List :: -> "+courseDetails);
		System.out.println(courseDetails.getFirst());
		System.out.println(courseDetails.getLast());
		
//		System.out.println("List :: -> "+courseDetails);
		System.out.println("Remove First Element :: -> "+courseDetails.removeFirst());
		System.out.println("Remove Last Element :: -> "+courseDetails.removeLast());
		
		var courseDetailsReversed = courseDetails.reversed();
		System.out.println("Reversed List :: ->"+courseDetailsReversed);
	}

}
