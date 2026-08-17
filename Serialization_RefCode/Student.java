package Serialization_RefCode;

import java.io.Serializable;

public class Student implements Serializable {

	int studId;
	String name;

	public Student(int studId, String name) {
		super();
		this.studId = studId;
		this.name = name;
	}

}
