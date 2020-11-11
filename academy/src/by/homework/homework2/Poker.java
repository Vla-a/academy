package by.homework.homework2;

import java.util.Scanner;

public class Poker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество игроков от 2 до 6: ");
		int player = sc.nextInt();
		sc.close();
		if (player > 1 && player < 7) {

			int kard = 5;
			String[] suits = { "Пики", "Бубна", "Черви", "Кристи" };

			String[] och = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
			int n = suits.length * och.length;

			String[] SuitsOch = new String[n];
			for (int i = 0; i < suits.length; i++) {
				for (int j = 0; j < och.length; j++) {
					SuitsOch[och.length * i + j] = och[j] + " " + suits[i];

				}
			}

			for (int i = 0; i < n; i++) {
				int RandomMap = i + (int) (Math.random() * (n - i));
				String t = SuitsOch[RandomMap];
				SuitsOch[RandomMap] = SuitsOch[i];
				SuitsOch[i] = t;

			}

			for (int i = 0; i < player * kard; i++) {
				System.out.println(SuitsOch[i]);
				if (i % kard == kard - 1)
					System.out.println();
			}
		} else {
			System.out.println("Не верное количество игроков");
		}
	}
}
