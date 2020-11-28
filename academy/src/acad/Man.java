package acad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Man {

	public static void main(String[] args) throws ParseException {

		DayOfWeek dayWeek =  DayOfWeek.MONDAY;
		Datee date = new Datee();
		Scanner sc = new Scanner(System.in);

//		System.out.println("Введите дату в формате: dd-mm-yyyy ");
//		String str1 = sc.next();

		String str2 = "25-11-2020";
		String str1 = "26-11-2020";

//		System.out.println("Проверка на волидность: " + date.prDate(str1));
		while (!date.prDate(str1)) {

			System.out.println("Не верный формат ввода, введите дату в формате: dd-mm-yyyy ");
			str1 = sc.next();
		}
//		System.out.println("Введите вторую  дату: dd-mm-yyyy ");
//		String str2 = sc.next();
		while (!date.prDate(str2)) {

			System.out.println("Не верный формат ввода, введите вторую дату в формате: dd-mm-yyyy ");
			str2 = sc.next();
		}

		Datee.Day d = date.new Day();
		System.out.println("Разность дней: " + date.raznostDate(str1, str2));

		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("dd-MM-yyyy");

		Date dat = format.parse(str1);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		simpleDateFormat.applyPattern("dd");
;
		String day1 = simpleDateFormat.format(dat);
		int d1 = Integer.parseInt(day1.trim());
		simpleDateFormat.applyPattern("M");
		String month1 = simpleDateFormat.format(dat);
		int m1 = Integer.parseInt(month1.trim());

		simpleDateFormat.applyPattern("yyyy");

		String year1 = simpleDateFormat.format(dat);
		int y1 = Integer.parseInt(year1.trim());
		

		simpleDateFormat.applyPattern("E");
		System.out.println("День недели: " + simpleDateFormat.format(dat));



		Datee.Year year = date.new Year();
		

		
	System.out.println(year.isLeapYear(y1));
	}

}
