package Interface_RefCode;

public class Fb implements Meta {

	@Override
	public void login(String userName, String password) {
		if (userName.equals("ram") && password.equals("12345")) {
			System.out.println("Login");
		} else {
			System.err.println("Fail");
		}
	}

}
