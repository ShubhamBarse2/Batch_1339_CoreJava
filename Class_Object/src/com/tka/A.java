package com.tka;

public class A {

	int age = 45;
	String name = "Ayush";

	public void display() {
		System.out.println("this is method of A class ");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m2();
	}

}
