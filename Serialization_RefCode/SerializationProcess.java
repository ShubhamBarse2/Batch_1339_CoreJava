package Serialization_RefCode;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationProcess {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(126, "ramesh", "nsk");

//		Student s = new Student(12235, "kiran");
		// for Write
		FileOutputStream file = new FileOutputStream("C:/java material/employee.text");
		ObjectOutputStream obj = new ObjectOutputStream(file);

		obj.writeObject(e);

		System.out.println("file Generated SuccessFully ... !");

		obj.close();
		file.close();

	}

}
