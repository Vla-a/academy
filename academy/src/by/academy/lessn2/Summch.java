package by.academy.lessn2;

import java.util.Scanner;

public class Summch {
	
	public static void main(String[] args) {		
		
		Scanner v = new Scanner(System.in);
		System.out.print( " Введите первое число: " );
		int a = v.nextInt();
		System.out.print( " Введите второе число: " );
		int b = v.nextInt(); 
		
		int c = a +b;
		System.out.print( " sum of the two numbers is: " + c );
	}

}
