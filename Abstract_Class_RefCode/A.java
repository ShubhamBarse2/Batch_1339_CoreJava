package Abstract_Class_RefCode;

public abstract class A {

	int a = 56;

	public A() {
		System.out.println("this is constr of ab class ");
	}

	public void m1() {
		System.out.println("this is concreate method / non ab method  of ab class ");
	}

	public abstract void m2();

	public static void main(String[] args) {

		Demo d = new Demo();
	}
}
