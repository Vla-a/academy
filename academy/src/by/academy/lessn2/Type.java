package by.academy.lessn2;

import java.util.Scanner;

public class Type {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("Введите тип данных: ");

		String type = console.nextLine();

		System.out.println("Введите число: ");

		int age = console.nextInt();

		switch (type) {

		case "int":

			age = age % 2;

			System.out.println("Ваш ответ: " + age);

			break;

		case "double":

			age = age * 70 / 100;

			System.out.println("Ваш ответ: " + age);

			break;

		case "float":

			int a = 2;

			System.out.println("Ваш ответ: " + Math.pow(age, a));

			break;

		case "String":

			System.out.println("Hello " + age);

			break;

		default:

			System.out.println("Unsupported type");

		}

	}
}
