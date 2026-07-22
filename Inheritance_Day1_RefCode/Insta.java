package Inheritance_Day1_RefCode;

public class Insta extends Meta {

	public void home() {
		System.out.println("this is home page of insta");
	}

	public void logout() {
		System.out.println("this is LOGOUT page of insta");
	}

	public static void main(String[] args) {
		Insta i = new Insta();
		i.home();
		i.login();
		i.logo();
		i.logout();
	}
}
