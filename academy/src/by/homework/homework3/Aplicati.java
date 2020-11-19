package by.homework.homework3;

import java.util.Scanner;

public class Aplicati implements Validator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер телефона: ");
		String str = sc.next();
		
		System.out.println("Введите почту: ");
		String d  = sc.next();
		sc.close();
		AmericanPhoneValidator apv = new AmericanPhoneValidator();
		System.out.println("Номер США: "+apv.isValid(str));
		
		BelarusPhoneValidator aaa = new BelarusPhoneValidator();
		System.out.println("Номер Беларуси: "+aaa.isValid(str));
		
		Aplicati sss = new Aplicati();
		System.out.println(sss.isValid(d));
	}
	
	

	@Override
	public boolean isValid(String str) {
		 String regex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}"; 
	        return str.matches(regex);
	}

}
