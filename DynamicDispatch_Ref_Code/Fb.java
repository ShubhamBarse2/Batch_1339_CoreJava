package DynamicDispatch_Ref_Code;

public class Fb extends Meta {

	@Override
	public void loginAuth(String userName, String password) {
		if (userName.equals("ramesh@gmail.com") && password.equals("Ramesh@123")) {
			System.out.println("Login SuccessFully for FB ");
		} else {
			System.err.println("Invalid Credentials ");
		}
	}
}
