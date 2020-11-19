package by.validator;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ��������: ");
		String s = sc.next();
		
		System.out.println("������� �����: ");
		String d  = sc.next();

		AmericanPhoneValidator apv = new AmericanPhoneValidator();
		System.out.println("����� ���: "+apv.isValid(s));
		
		BelarusPhoneValidator bpv = new BelarusPhoneValidator();
		System.out.println("����� ��: "+bpv.isValid(s));
		
		System.out.println(validMail(d));
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("�����: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println("�����: " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("���: " + calendar.get(GregorianCalendar.YEAR));
	}
	
	private static boolean validMail(String d) {
        String regex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}"; 
        return d.matches(regex);
	}
	
	
}


