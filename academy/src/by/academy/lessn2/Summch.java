package by.academy.lessn2;

import java.util.Scanner;

public class Summch {
	
	public static void main(String[] args) {
		
		
		
		
		
		Scanner v = new Scanner(System.in);
		System.out.print( " ¬ведите первое целое число: " );
		int a = v.nextInt();
		System.out.print( " ¬ведите второе целое число: " );
		int b = v.nextInt();
		
		int c = a +b;
		System.out.print( " —умма первого и второго чисел составит: " + c );
	}

}
