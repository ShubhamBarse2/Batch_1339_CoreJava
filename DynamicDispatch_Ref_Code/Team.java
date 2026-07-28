package DynamicDispatch_Ref_Code;

public class Team {

	public static void main(String[] args) {

		Employee emp;

		emp = new Manager();
		emp.salary();

		emp = new Developer();
		emp.salary();

		emp = new Tester();
		emp.salary();

	}

}
