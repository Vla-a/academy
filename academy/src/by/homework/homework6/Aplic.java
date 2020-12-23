package by.homework.homework6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class Aplic {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File dir = new File("C:\\Users\\Пользователь\\git\\academy\\academy\\src\\by\\homework\\homework6\\100 txt");

		if (!dir.exists()) {
			dir.mkdir();

		}
		File src = new File(
				"C:\\Users\\Пользователь\\git\\academy\\academy\\src\\by\\homework\\homework6\\NowText.txt");
		if (!src.exists()) {
			return;
		}
		char[] arr = new char[576];
		int j = 0;
		StringBuilder str = new StringBuilder();
		try (FileReader fr = new FileReader(src)) {
			while ((j = fr.read(arr)) > 0) {
				str.append(arr);
			}
		}

		System.out.println(str.length());



		for (int i = 0; i < 100; i++) {
			File file = new File(dir, (i + 1) + ".txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			try (FileWriter fw = new FileWriter(file)) {

				int maz = (int) (Math.random() * 537);
				fw.write(str.substring(0, maz) + "");

			}

		}

		File folder = new File("C:\\Users\\Пользователь\\git\\academy\\academy\\src\\by\\homework\\homework6\\100 txt");
		File fol = new File(
				"C:\\Users\\Пользователь\\git\\academy\\academy\\src\\by\\homework\\homework6\\resullt.txt");
		try (FileWriter ff = new FileWriter(fol)) {
			for (File file : folder.listFiles()) {
				System.out.println(file.getName());
				ff.write(file.getName());
			}

		}
	}
}
