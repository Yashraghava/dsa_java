package com.java.latest_version;
import java.util.stream.Gatherers;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamGathererRunner {
	
	private static void fold() {
		Stream<Integer> numbers = IntStream.rangeClosed(0, 20).boxed();
		numbers.gather(Gatherers.fold(() -> 0, (sum,i)->sum+i)).forEach(System.out::println);
	}
	private static void mapConcurrent() {
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		numbers.gather(Gatherers.mapConcurrent(4, i->i*i)).forEach(System.out::println);
	}
	private static void windowFixed() {
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		numbers.gather(Gatherers.windowFixed(5)).forEach(System.out::println);
	}
	private static void windowSliding() {
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		numbers.gather(Gatherers.windowSliding(3)).forEach(System.out::println);
	}
	public static void main(String[] args) {
//		fold();
//		mapConcurrent();
//		windowFixed();
		windowSliding();
		
	}

}
