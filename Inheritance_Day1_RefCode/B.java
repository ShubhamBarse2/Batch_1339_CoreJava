package Inheritance_Day1_RefCode;

public class B extends A {

	public void m2() {
		System.out.println("this is m2 method of child class B ");
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a = 34);
		b.m1();
		b.m2();
	}
}
