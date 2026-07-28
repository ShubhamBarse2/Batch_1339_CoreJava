package Overrding_RefCode;

public class Sbi extends Bank {

	@Override
	public void rateOfInterest(double roi) {
		System.out.println("SBI ROI value " + roi);
	}

	public void sbiHome() {
		System.out.println("SBI Default Home Page ");
	}

}
