package Overrding_RefCode;

public class G_Pay extends Payment {

	@Override
	public void pay() {
		System.out.println("Pay through G pay ");
	}
}