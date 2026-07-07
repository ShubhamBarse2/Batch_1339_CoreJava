package com.tka;

public class MainClass {

	public static void main(String[] args) {

//		Object Creation

//		by default Object class data will show whenever u r creating an Object of any class 

//		heap & stack

//		heap --> A
//		stack --> a

		A a = new A();
		System.out.println(a.age);
		a.display();

		A a1 = new A();
		System.out.println(a1.age);
		a1.display();

	}

}
