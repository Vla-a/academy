package acad;

import java.util.Scanner;

import by.academy.lesson1.Cat;

public class Cec {
	
	
	
	Cec(){ 
	}
	
	Cec(int Buy){
		
		Buy = Buy;
	}
	
	
	public void chek() {
	
	Scanner console = new Scanner(System.in);

	System.out.print("Введите сумму покупки: ");

	double chek = console.nextDouble();

	System.out.print("Введите возраст: ");

	int age = console.nextInt();

	if( chek < 100 ) {	

	chek = chek * 95 / 100; 
	} else if( chek >= 100 && chek < 200 ) {	

	chek = chek * 93 / 100; 
	} else if( chek >= 200 && chek < 300 ) {	

		         if( age > 18) {
		        	 
	 	            chek = chek * 85 / 100; 
	             } else {
	            	 
	            	 chek = chek * 91 / 100;
	              }
		
	} else if( chek >= 300 && chek < 400  ) {	
	    
		chek = chek * 85 / 100;
	               

	} else if( chek >= 400 ) {	

	chek = chek * 80 / 100;
	}
	

	System.out.println("Ваша сумма: "+chek);
	
	}
	
	public static void main(String[] args) {
	
		Cec cec1 = new Cec();
		Cec buy = new Cec(56);
		
		cec1.chek();
		buy.chek();
	}
	
	
  }

