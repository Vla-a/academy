package by.homework.homework1;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {

		Scanner consol = new Scanner(System.in);

		System.out.print("¬ведите число: ");

		int a = consol.nextInt();

		for (int i = 1; i < 11; i++) {

			int b = a * i;

			System.out.println(i + " * " + a + " = " + b);
		}
	}
}
