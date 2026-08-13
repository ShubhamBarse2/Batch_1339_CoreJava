package MultiThreading_RefCode;

public class Demo implements Runnable, A, B, C {

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

		}

	}

	@Override
	public void m3() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

		}

	}

	@Override
	public void m2() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

		}

	}

	@Override
	public void m1() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

		}

	}

}
