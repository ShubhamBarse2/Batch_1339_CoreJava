package Encapsulation_RefCode;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e = new Employee();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee info ");
		System.out.println("-----------------------");
		System.out.println("Enter EmpId ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter city ");
		String city = sc.nextLine();
		System.out.println("Enter salary ");
		double salary = sc.nextDouble();

		e.setEmpId(empId);
		e.setName(name);
		e.setCity(city);
		e.setSalary(salary);
		System.out.println("--------------------");
		System.err.println(e.getEmpId());
		System.err.println(e.getName());
		System.err.println(e.getCity());
		System.err.println(e.getSalary());

	}
}
