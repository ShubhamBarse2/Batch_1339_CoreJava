package Abstract_Class_RefCode;

public class B extends A {

	@Override
	public void m2() {

		System.out.println("this is ab method of A class ");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
	}

}
