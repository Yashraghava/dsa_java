package com.java.latest_version;

public class PatternMatchingNestedRecords {
	record Customer(String name,String email) {}
	record Product(String name,double price) {}
	record Order(Customer customer,Product product) {}
	
	public static void processingOrder(Object obj) {
		if(obj  instanceof Order(
				Customer(String name,String email),
				Product(String productname,double price))) {
			System.out.println("Customer "+name+" Product Name "+productname+" Price "+price);
		}
	}
	public static void main(String[] args) {
		processingOrder(new Order(new Customer("Yash", "email"),new Product("Cricket Bat",100)));
	}
}
