package by.academy.lessn2;

import java.util.Scanner;

public class Tabl {
	
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("¬ведите число: ");

		int a = console.nextInt();

		for(int i = 1 ; i < 11 ; i ++) {
			
			int b = a * i;
			
			System.out.println( i + " * " + a + " = " + b);
	}
  }
}
