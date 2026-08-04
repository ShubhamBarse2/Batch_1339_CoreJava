package Abstract_Class_RefCode;

public class CC extends BB implements AA {

	@Override
	public void a1() {
		System.out.println("a1 method ");

	}

	public static void main(String[] args) {
		BB a = new CC();
		a.b1();
	}

}
