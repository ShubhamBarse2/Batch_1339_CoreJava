package TypeOf_Inheritance_RefCode;

public class Axis extends Bank {

	public void roiAxis(int roi) {
		System.out.println("AXIS ROI --> " + roi);
	}

	public static void main(String[] args) {
		Axis s = new Axis();
		s.checkBalance();
		int r = s.roi = 7;
		s.roiAxis(r);
	}
}
