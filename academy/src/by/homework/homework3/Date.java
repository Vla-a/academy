package by.homework.homework3;

import java.util.Scanner;

public class Date {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите дату: ");
		String str = sc.next();
		
		sc.close();
		Date dd = new Date();
		System.out.println(dd.prDate1(str));
		System.out.println(dd.prDate2(str));
	}

	public boolean prDate1 (String s) {
		String regex = "^\\d{2}/\\d{2}/\\d{4}$";
		
		return s.matches(regex);
	}
	public boolean prDate2 (String s) {
		String regex = "^\\d{2}-\\d{2}-\\d{4}$";
		
		return s.matches(regex);
	}
}
