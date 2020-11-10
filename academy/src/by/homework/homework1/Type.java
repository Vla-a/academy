package by.homework.homework1;

import java.util.Scanner;

public class Type {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("enter the type: ");

		String type = console.nextLine();

		System.out.println("entered value: ");

		String age = console.nextLine();

		switch (type) {

		case "int":
			int s = Integer.parseInt(age);
			s = s % 2;

			System.out.println("��� �����: " + s);

			break;

		case "double":
			double d = Double.parseDouble(age);
			d = d * 70 / 100;

			System.out.println("Your answer: " + d);

			break;

		case "float":
			float f = Float.parseFloat(age);
			int a = 2;

			System.out.println("Your answer: " + Math.pow(f, a));

			break;

		case "char":
			char h = (char) age.charAt(0);

			System.out.println("Your answer: " + (int) h);

			break;

		case "String":

			System.out.println("Hello " + age);

			break;

		default:

			System.out.println("Unsupported type");

		}

	}
	
}
