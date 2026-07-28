package Overrding_RefCode;

public class PhonePay extends Payment {

	public void pay() {
		Payment p = new Payment();
		p.amount = 345675;
		System.out.println("Pay through Phone pay ...!");
	}

}
