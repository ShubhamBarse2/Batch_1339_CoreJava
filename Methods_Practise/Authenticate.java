package Methods_Practise;

public class Authenticate {

	public void secured(String userName, String Password) {

		if (userName == "Ram@gmail.com" && Password == "Ram@123") {
			System.out.println("Login Successfully ... !");
		} else {
			System.err.println("Invalid Credentials ... ! ");
		}
	}

}
