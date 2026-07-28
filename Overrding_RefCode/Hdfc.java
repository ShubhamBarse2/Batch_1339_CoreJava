package Overrding_RefCode;

public class Hdfc extends Bank {

	@Override
	public void rateOfInterest(double roi) {
		System.out.println("HDFC ROI value " + roi);
	}

	public void hdfcHome() {
		System.out.println("HDFC Default Home Page ");
	}
}
