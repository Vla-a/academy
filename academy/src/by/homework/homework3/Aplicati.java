package by.homework.homework3;

import java.util.Scanner;

public class Aplicati {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ��������: ");
		String str = sc.next();
		
		System.out.println("������� �����: ");
		String d  = sc.next();
		
		AmericanPhoneValidator apv = new AmericanPhoneValidator();
		System.out.println("����� ���: "+apv.isValid(str));
		
		BelarusPhoneValidator aaa = new BelarusPhoneValidator();
		System.out.println("����� ��������: "+aaa.isValid(str));
		
		System.out.println(validMail(d));
	}
	
	private static boolean validMail(String d) {
        String regex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}"; 
        return d.matches(regex);
	}

}
