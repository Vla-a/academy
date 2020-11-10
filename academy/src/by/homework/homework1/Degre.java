package by.homework.homework1;

public class Degre {

	public static void main(String[] args) {

		int a2 = 2;
		int i;
		for (i = 1; Math.pow(a2, i) <= 1_000_000; i++) {

			System.out.println(Math.pow(a2, i));

		}
		System.out.println(Math.pow(a2, i));
	}
}
