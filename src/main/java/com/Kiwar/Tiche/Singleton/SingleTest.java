package com.Kiwar.Tiche.Singleton;

public class SingleTest {

	public static void main(String[] args) {
		try {
			

			Student student = Student.getSingle("Kiwar", "Tiche", "Estudiante");
			Student b= Student.getSingle("Kiwar", "Tiche", "Estudiante");
			
		} catch (Exception e) {
			System.out.println("Err: "+e);
		}
		
	}
	
}
