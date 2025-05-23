package com.java.latest_version;

public class SealedInterfacesRunner {
	sealed interface Flyable permits Bird,Aeroplane,Helicopter{}
	
	final class Bird implements Flyable{}
	
	sealed class Aeroplane implements Flyable permits Boeing{}

	final class Boeing extends Aeroplane{}
	
	non-sealed class Helicopter implements Flyable{}
	
}
