package by.homework.homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File fileP = new File("C:\\Users\\Пользователь\\git\\academy\\academy\\src\\by\\homework\\homework6\\");

		fileP.mkdir();
		File file = new File(fileP + "\\result.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File src = new File(
				"C:\\Users\\Пользователь\\git\\academy\\academy\\src\\by\\homework\\homework6\\NowText.txt");
		if (!src.exists()) {
			return;
		}
		char[] arr = new char[1024];
		int j = 0;
		StringBuilder str = new StringBuilder();
		try (FileReader fr = new FileReader(src)) {
			while ((j = fr.read(arr)) > 0) {
				str.append(arr);
			}
		}
		System.out.println(str);
		String[] word = str.toString().split(" ");
		System.out.println(word.length);

		BufferedWriter outputWriter = null;
		outputWriter = new BufferedWriter(new FileWriter(file));
		for (int i = 0; i < word.length; i++) {

			outputWriter.write(word[i] + "");

		}
		outputWriter.flush();
		outputWriter.close();
	}

}
