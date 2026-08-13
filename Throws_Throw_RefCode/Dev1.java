package Throws_Throw_RefCode;

public class Dev1 {

	public void m1() throws ClassNotFoundException, ArithmeticException {
		Class.forName("java.lang.String");

		System.out.println(4 / 0);
	}

}
