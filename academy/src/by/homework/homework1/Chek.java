package by.homework.homework1;

import java.util.Scanner;

public class Chek {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("Сумма вашей покупки: ");

		double chek = console.nextDouble();

		System.out.print("Ваш возвраст: ");

		int age = console.nextInt();

		if (chek < 100) {

			chek = chek * 95 / 100;
		} else if (chek >= 100 && chek < 200) {

			chek = chek * 93 / 100;
		} else if (chek >= 200 && chek < 300) {

			if (age > 18) {

				chek = chek * 85 / 100;
			} else {

				chek = chek * 91 / 100;
			}

		} else if (chek >= 300 && chek < 400) {

			chek = chek * 85 / 100;

		} else if (chek >= 400) {

			chek = chek * 80 / 100;
		}

		System.out.println("Ваша покупка составила: " + chek);

	}
}
