package Constr_RefCode;

public class Demo {

	public Demo() {
//LOC
		System.out.println("this is NO args Cosntr ");
	}

	public Demo(String name, String city) {
		// LOC
		System.out.println("this is ARGS args Cosntr --> " + name + " " + city);
	}

	public void m1() {
		System.out.println("this is an method ");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo("Ram", "pune");
		d.m1();
	}

}
