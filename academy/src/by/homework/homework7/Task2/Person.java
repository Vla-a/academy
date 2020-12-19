package by.homework.homework7.Task2;

import java.lang.reflect.Method;

import by.academy.lesson15.Zoo;

public class Person {

	public String firstName;
	public String lastName;
	protected int age;
	protected String dateOfBirth;
	
	
	@Pep(name = "Socs")

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		
	}

	protected void slepp( ) {
		System.out.println("Человек спит");
	}

}
