package Interface_RefCode;

public class Main {

	public static void main(String[] args) {
//
//		A b = new B();
//		b.m1();
//		

//		Payment p;
//
//		p = new Upi();
//		p.pay();
//		p = new Card();
//		p.pay();

//	Meta m ;
//	m= new Insta();
//	m.login("12345","234567");
//	
//	m = new Fb();
//	m.login("23456", "w34567i");

		Gmail g;
		g = new Google();
		System.out.println(g.sent());

		Gmap map;
		map = new Google();
		System.out.println(map.direction());
		map.m1();

		GDrive d;
		d = new Google();
		System.out.println(d.uploadFiles());
		d.m1();
	}
}
