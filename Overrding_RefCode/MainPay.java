package Overrding_RefCode;

public class MainPay {

	public static void main(String[] args) {
		Payment p1 = new Payment();
		p1.pay();
		PhonePay p = new PhonePay();
		p.pay();
		G_Pay g = new G_Pay();
		g.pay();
	}
}
