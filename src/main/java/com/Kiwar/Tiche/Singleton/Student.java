package com.Kiwar.Tiche.Singleton;

public class Student {

	private String firstName;
	private String lastName;
	private String description;
	private static Student student;
	
	private Student(String firstName, String lastName, String description) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
		System.out.println(this.toString());
	}
	
	public static Student getSingle(String firstName, String lastName, String description) {
		if (student==null) {
			student = new Student(firstName,lastName,description);
		} else {
			System.err.println("Error al Crear");
		}
		return student;
	}
	
	
}
