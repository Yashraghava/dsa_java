package com.java.latest_version;

public class SealedClassRunner {

	sealed class Vehicle permits Truck,Bike,Car{}
	
	sealed class Truck extends Vehicle permits MegaTruck{}
	
	final class Bike extends Vehicle{}
	
	non-sealed class Car extends Vehicle{}
	
	final class MegaTruck extends Truck{}
	
//	class Dummy extends Vehicle{}
	
	public static void main(String[] args) {
		
	}
}
