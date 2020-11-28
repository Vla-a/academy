package acad;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.TimeZone;

import by.homework.homework3.TestDate;

public class Date {
	
	   public void DayOfWeek( ){
		   String str = "12/02/2020";
		   TestDate dd = new TestDate();
			System.out.println(dd.prDate1(str));
			

			/*if (dd.prDate1(str)) {
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
			}else {
				
				System.out.println("Не верный формат ввода");
			}
		}

		public boolean prDate1(String s) {
			String regex = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[0/]((19|20)\\d\\d)$";
			;

			return s.matches(regex);
		}

		public boolean prDate2(String s) {
			String regex = "^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20)\\d\\d)$";

			return s.matches(regex);*/
		}
	 
	    
//	 void test() {
//		 
//	        Date date = new Date();
//	        date.test();
	        
	        class Year {
	 
	            public void bissextile() {
	 
	                Scanner input = new Scanner(System.in);
	                int year = input.nextInt();
	                if (year % 4 == 0) {
	                    if (year % 100 == 0) {
	                        if (year % 400 == 0) {
	                            System.out.println("bissextile");
	                        }
	                    }
	                } else {
	                    System.out.println("not bissextile");
	                }
   //             Year yearO = new Year();
	//                yearO.bissextile();
	            }
	        }
	    
	    class Month {
	 
	        public int getDays() {
	            Scanner input = new Scanner(System.in);
	            int month = 0;
	            String error;
	            System.out.println("Input the number of the month");
	            input = new Scanner(System.in);
	            int monthNum = input.nextInt();
	            switch (monthNum) {
	 
	                case 1:
	                    month = 31;
	                    break;
	                case 2:
	                    month = 28;
	                    break;
	                case 3:
	                    month = 31;
	                    break;
	                case 4:
	                    month = 30;
	                    break;
	                case 5:
	                    month = 31;
	                    break;
	                case 6:
	                    month = 30;
	                    break;
	                case 7:
	                    month = 31;
	                    break;
	                case 8:
	                    month = 31;
	                    break;
	                case 9:
	                    month = 30;
	                    break;
	                case 10:
	                    month = 31;
	                    break;
	                case 11:
	                    month = 30;
	                    break;
	                case 12:
	                    month = 31;
	                    break;
	                default:
	                    error = "wrong number";
	                    break;
	            }
	            return month;
	        }
	    }
	 
	 
	    class Day {
	        public  String dayOfTheWeek() {
	            Scanner input = new Scanner(System.in);
	            String day = "";
	           // input = new Scanner(System.in);
	            int weekDayNum = input.nextInt();
	 
	            switch (weekDayNum) {
	                case 1:
	                    day = "Monday";
	                case 2:
	                    day = "Tuesday";
	                case 3:
	                    day = "Wednesday";
	                case 4:
	                    day = "Thursday";
	                case 5:
	                    day = "Friday";
	                case 6:
	                    day = "Saturday";
	                case 7:
	                    day = "Sunday";
	            }
	            return day;
	        }
	    }


	
	
	
}
