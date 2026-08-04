package Abstract_Class_RefCode;

public class Main {

	public static void main(String[] args) {

		Vehicle v = new Bike();
		v.start();
		v.engineInfo();
		v.stop();

		v = new Car();
		v.start();
		v.engineInfo();
		v.stop();

	}
}
