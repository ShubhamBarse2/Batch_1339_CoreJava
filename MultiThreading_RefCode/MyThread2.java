package MultiThreading_RefCode;

public class MyThread2 {

	public static void main(String[] args) {

		Demo d = new Demo();
		Thread t = new Thread(d);
		t.start();
		d.m1();
		d.m2();
		d.m3();
	}
}
