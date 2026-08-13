package Throws_Throw_RefCode;

public class Dev2 {

	public void m2() {
		Dev1 d = new Dev1();
		try {
			d.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("this is not alllowed ");
			e.printStackTrace();
		}
	}

}
