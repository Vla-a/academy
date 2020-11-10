package by.academy.lessn2;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		
		String anotherPalindrome = console.nextLine();
		
		
		
		
		String[] bArray = {anotherPalindrome.substring(0, 3),
				           anotherPalindrome.substring(1, 4),
				           anotherPalindrome.substring(2, 5),
				           anotherPalindrome.substring(3, 6),
				           anotherPalindrome.substring(4, 7),
				           anotherPalindrome.substring(5, 8),
				   		anotherPalindrome.substring(6, 9),
				   		anotherPalindrome.substring(7, 10),
				   	    anotherPalindrome.substring(8, 11),
				   		anotherPalindrome.substring(9, 12),
				   		anotherPalindrome.substring(10, 13)};
		
		 for (int j = 0; j < bArray.length; j++)
		 {
		 for (int i = j + 1; i < bArray.length; i++)
		 {
		 
		 String t = bArray[j];
		 bArray[j] = bArray[i];
		 bArray[i] = t;
		 }
		 
		 }
		 System.out.println(bArray[0]);
		 System.out.println(bArray[10]);
		 }


		
		
		
	}

