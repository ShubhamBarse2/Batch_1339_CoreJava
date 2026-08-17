package Serialization_RefCode;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationProcess {

	public static void main(String[] args) throws Exception {

		// for read
		FileInputStream file = new FileInputStream("C:/java material/student.text");
		ObjectInputStream obj = new ObjectInputStream(file);

		Student std = (Student) obj.readObject();

		System.out.println("Student ID --> " + std.studId + " w Student Name --> " + std.name);

		obj.close();
		file.close();

	}

}
