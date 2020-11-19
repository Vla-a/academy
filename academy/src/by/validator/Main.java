package by.validator;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер телефона: ");
		String s = sc.next();
		
		System.out.println("Введите почту: ");
		String d  = sc.next();

		AmericanPhoneValidator apv = new AmericanPhoneValidator();
		System.out.println("Номер США: "+apv.isValid(s));
		
		BelarusPhoneValidator bpv = new BelarusPhoneValidator();
		System.out.println("Номер РБ: "+bpv.isValid(s));
		
		System.out.println(validMail(d));
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("Число: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println("Месяц: " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("Год: " + calendar.get(GregorianCalendar.YEAR));
	}
	
	private static boolean validMail(String d) {
        String regex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}"; 
        return d.matches(regex);
	}
	
	
}


