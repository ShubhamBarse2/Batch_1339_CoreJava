package DynamicDispatch_Ref_Code;

public class Insta extends Meta {

	@Override
	public void loginAuth(String userName, String password) {
		if (userName.equals("ram@gmail.com") && password.equals("Ram@123")) {
			System.out.println("Login SuccessFully for Insta ");
		} else {
			System.err.println("Invalid Credentials ");
		}

	}

	public void instaHome() {
		System.out.println("Home page of INSTA .... !");
	}
}
