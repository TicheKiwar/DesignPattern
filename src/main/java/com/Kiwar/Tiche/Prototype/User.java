package com.Kiwar.Tiche.Prototype;

public class User implements Cloneable{
	private String firstName;
	private int age;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", age=" + age + ", lastName=" + lastName + "]";
	}
	
	@Override
	protected Object clone() {
		User cloneUser = new User();
		cloneUser.setAge(this.age);
		cloneUser.setFirstName(this.firstName);
		cloneUser.setLastName(lastName);
		return cloneUser;
	}
	
	
}
