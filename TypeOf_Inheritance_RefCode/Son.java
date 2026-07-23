package TypeOf_Inheritance_RefCode;

public class Son extends Father1 {

	public void sProperty() {
		System.out.println("Son P --> 1 cr");
	}

	public static void main(String[] args) {
		Son f = new Son();
		f.gfProperty();
		f.fProperty();
		f.sProperty();

	}
}
