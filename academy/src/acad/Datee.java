package acad;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.TimeZone;






public class Datee {
	
	
	public int raznostDate(String s, String ss) throws ParseException {
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         Date date1 = dateFormat.parse(s);
         Date date2 = dateFormat.parse(ss);

 
         long milliseconds = date2.getTime() - date1.getTime();
         int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
  
         return days;
	}
	public boolean prDate(String s) {
		String regex = "^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20)\\d\\d)$";

		return s.matches(regex);
	}   
	
	        class Year {
	
	 String s;
	 
	 public String  isLeapYear(int year) {
		
	        

	        if ((year < 1580) && (year % 4 == 0)) {
	            return "Високосный год " ;
	        } else {
	            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
	               return "Високосный год " ;
	            } else {
	                return "Не високосный год";
	            }

	        }
	    }
		
	        }
	    class Month {
	 
	        
	    }
	 
	 
	    class Day {
	    	
	        	

				public  String getDayOfTheWeek(int year, int month, int chislo) {
						 
	        		
	        		String day = "";
	        		
	        		GregorianCalendar cal = new GregorianCalendar(year,month,chislo );
	        		int days = cal.get(Calendar.DAY_OF_WEEK );
	        		
	        		switch (days) {
	                case 1:
	                    day = "Monday";
	                    break;
	                case 2:
	                    day = "Tuesday";
	                    break;
	                case 3:
	                    day = "Wednesday";
	                    break;
	                case 4:
	                    day = "Thursday";
	                    break;
	                case 5:
	                    day = "Friday";
	                    break;
	                case 6:
	                    day = "Saturday";
	                    break;
	                case 7:
	                    day = "Sunday";
	                    break;
	            }
	            return day;
	        }
	    }
}
