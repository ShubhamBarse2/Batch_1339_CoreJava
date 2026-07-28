package Overrding_RefCode;

public class Payment {

	public Payment() {
		System.out.println("Constr of Payment");
	}

	final double amount = 234567;

	public void pay() {
		System.out.println("Default pay ...! ");
	}
}
