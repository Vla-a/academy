package by.validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер телефона: ");
		String s = sc.next();

		AmericanPhoneValidator apv = new AmericanPhoneValidator();
		System.out.println("Номер США: "+apv.isValid(s));
		
		BelarusPhoneValidator bpv = new BelarusPhoneValidator();
		System.out.println("Номер РБ: "+bpv.isValid(s));
	}

}


