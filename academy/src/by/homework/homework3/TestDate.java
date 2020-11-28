package by.homework.homework3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.TimeZone;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите дату: ");
		String str = sc.next();
		sc.close();

		TestDate dd = new TestDate();
		System.out.println(dd.prDate1(str));
		System.out.println(dd.prDate2(str));

		if (dd.prDate1(str)) {
			SimpleDateFormat format = new SimpleDateFormat();
			format.applyPattern("dd/MM/yyyy");	
			Date date = format.parse(str);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
			simpleDateFormat.applyPattern("dd");
			System.out.println("Day   : " + simpleDateFormat.format(date));
			simpleDateFormat.applyPattern("MMM");
			System.out.println("Month : " + simpleDateFormat.format(date));
			simpleDateFormat.applyPattern("yyyy");
			System.out.println("Year  : " + simpleDateFormat.format(date));
		} else if(dd.prDate2(str)){
			
			SimpleDateFormat format = new SimpleDateFormat();			
			format.applyPattern("dd-MM-yyyy");
			Date date = format.parse(str);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
			simpleDateFormat.applyPattern("dd");
			System.out.println("Day   : " + simpleDateFormat.format(date));
			simpleDateFormat.applyPattern("MMM");
			System.out.println("Month : " + simpleDateFormat.format(date));
			simpleDateFormat.applyPattern("yyyy");
			System.out.println("Year  : " + simpleDateFormat.format(date));
			
		}else {
			
			System.out.println("Не верный формат ввода");
		}
	}

	public boolean prDate1(String s) {
		String regex = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[0/]((19|20)\\d\\d)$";
		

		return s.matches(regex);
	}

	public boolean prDate2(String s) {
		String regex = "^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20)\\d\\d)$";

		return s.matches(regex);
	}
}
