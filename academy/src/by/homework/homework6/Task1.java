package by.homework.homework6;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task1 {
	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите, что записать в файл ");
		String a = sc.nextLine();
		File file = new File("C:\\Users\\Пользователь\\git\\academy\\academy\\src\\by\\homework\\homework6\\My.txt");
		FileWriter fw = new FileWriter(file);
		StringTokenizer st = new StringTokenizer(a);
		while (!a.equals("stop")) {

			fw.append(a + " ");
			System.out.println("Введите, что записать в файл ");
			a = sc.nextLine();

		}

		sc.close();
		fw.close();
	}
}
