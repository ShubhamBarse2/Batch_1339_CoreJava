package TypeOf_Inheritance_RefCode;

public class Sbi extends Bank {

	public void roiSbi(int roi) {
		System.out.println("SBI ROI --> " + roi);
	}

	public static void main(String[] args) {
		Sbi s = new Sbi();
		s.checkBalance();
		int r = s.roi = 8;
		s.roiSbi(r);
	}
}
