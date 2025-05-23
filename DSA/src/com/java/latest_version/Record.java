package com.java.latest_version;

public class Record {
	record Person(int id,String name) {
		Person{
			if(id==3) {
				System.out.println("ID == 3");
			}
		}
		public int id(){
			System.out.println("Entering Record::Person::id()");
			return id;
		}
	}
	public static void main(String[] args) {
		Person p1 = new Person(1,"A");
		Person p2 = new Person(2,"B");
		Person p4 = new Person(1,"A");
		System.out.println(p1);
		System.out.println(p2);
		Person p3 = new Person(3,"C");
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p4));
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.id());
		System.out.println(p4.id());
	}
}
