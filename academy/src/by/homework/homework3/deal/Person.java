package by.homework.homework3.deal;

import java.util.Scanner;

import by.homework.homework3.Aplicati;
import by.homework.homework3.BelarusPhoneValidator;
import by.homework.homework3.TestDate;
import by.homework.homework3.Validator;

public class Person {

	public static final Validator belarusPhoneValidator = new BelarusPhoneValidator();
	public static final Validator email = new Aplicati();
	String name;
	double cash;
	String dateOfBirth;

	public Person(String name, double cash) {
		super();
		this.name = name;
		this.cash = cash;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	Scanner s = new Scanner(System.in);

	public void dateBir() {
		System.out.println("Введите дату рождения: ");

		dateOfBirth = s.next();

		TestDate dateB = new TestDate();
		dateB.prDate1(dateOfBirth);

		while (!dateB.prDate1(dateOfBirth)) {
			System.out.println("Не верный формат. Повторите: ");
			dateOfBirth = s.next();

		}
		System.out.println("Ваша дата рождения: " + dateOfBirth);

	}

	public void validat() {

		System.out.println("Введите телефон в формате +375---------: ");

		String phone = s.next();
		while (!belarusPhoneValidator.isValid(phone)) {
			System.out.println("Не верный формат. Повторите т.: ");
			phone = s.next();
		}
	}

	public void email() {
		System.out.println("Введите свой email: ");
		String emai = s.next();
		while (!Person.email.isValid(emai)) {
			System.out.println("Не верный формат. Повторите email: ");
			emai = s.next();
		}

	}
}
