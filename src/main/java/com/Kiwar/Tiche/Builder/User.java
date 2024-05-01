package com.Kiwar.Tiche.Builder;

import java.util.Objects;

public class User {
	//Attributes of the class user
	//it has to be final
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String phone; 
	private final String gender;
	private final String civilStatus;
	
	//Constructor of the class user
	
	private User(String firstName, String lastName, String email, String phone, String gender, String civilStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.civilStatus = civilStatus;
	}
	
	//the problem is that there are many attributes
	//One Solution is using the design pattern Builder
	
	//Class builder in the class user
	
	public static class UserBuilder implements BuilderInterface{
		// it doesn't have to be final
		private  String firstName;
		private  String lastName;
		private  String email;
		private  String phone; 
		private  String gender;
		private  String civilStatus;
		
		public UserBuilder FirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public UserBuilder LastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public UserBuilder Email(String email) {
			this.email = email;
			return this;
		}
		public UserBuilder Phone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder Gender(String gender) {
			this.gender = gender;
			return this;
		}
		public UserBuilder CivilStatus(String civilStatus) {
			this.civilStatus = civilStatus;
			return this;
		}
		@Override
		public User build() {
			// TODO Auto-generated method stub
			return new User(firstName, lastName, email, phone, gender, civilStatus);
		}
		
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(civilStatus, email, firstName, gender, lastName, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(civilStatus, other.civilStatus) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(gender, other.gender)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(phone, other.phone);
	}
	
	
	
	
}
