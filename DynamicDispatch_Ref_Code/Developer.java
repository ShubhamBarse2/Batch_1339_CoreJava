package DynamicDispatch_Ref_Code;

public class Developer extends Employee {

	@Override
	public void salary() {
		System.out.println("Dev salary --> 40K + 6K");
	}
}
