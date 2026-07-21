package PolyMorphism_RefCode;

public class Main {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
		d.m1(1);

		Calculator c = new Calculator();
		c.add(12.8, 34);
		c.add(12, 45.8);

		Google g = new Google();
		Google g1 = new Google(324);
		g.myAuth(123445, "qwertyu");
		g.myAuth(12344234567l, "qwertyu");
		g.myAuth("om@gmail.com", "qwertyu");

	}

//	public static void main() {
//		Demo d = new Demo();
//		d.m1();
//		d.m1(1);
//	}	
}
