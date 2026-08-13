package Throws_Throw_RefCode;

public class Demo {

	public void m1() {

		int a = 5;
		int b = 0;

		if (b == 0) {
			throw new OmException("this is not allowed in java ");
		}
		System.out.println(a / b);
	}

}
