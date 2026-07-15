package Constr_RefCode;

public class Employee {

//	fields 

	int empId;
	String name;
	String city;

	//  for Initilization we used constr 
	public Employee(int empId, String name, String city) {
		this.empId = empId;
		this.name = name;
		this.city = city;
	}

	public void display() {
		System.out.println(empId + " " + name + " " + city);
	}

}
