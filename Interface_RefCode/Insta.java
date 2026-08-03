package Interface_RefCode;

public class Insta implements Meta {

	@Override
	public void login(String userName, String password) {

		if (userName.equals("1234") && password.equals("9876")) {
			System.out.println("Login");
		} else {
			System.err.println("Fail");
		}

	}

}
