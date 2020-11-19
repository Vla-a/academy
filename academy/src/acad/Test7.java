package acad;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Test7 {	
	  public static void main(String[] args) throws ParseException {
		 Scanner sc = new Scanner(System.in);
			 String  regexp = sc.next();
	    
	    DateFormat date = new SimpleDateFormat(regexp);
	    
	  
	      Date nDate1 = date.parse(regexp);
	      System.out.println(regexp + " : " + date.format(nDate1));
	     
	   
	  }
}

