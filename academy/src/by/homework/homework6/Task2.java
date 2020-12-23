package by.homework.homework6;

import java.io.BufferedReader;
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

		StringBuilder stBuild = new StringBuilder();

		char[] array = new char[576];

		try (BufferedReader bufRead = new BufferedReader(new FileReader(src))) {

			while ((bufRead.read(array)) > 0)
				;

			stBuild.append(array);

		} catch (IOException e) {

			e.printStackTrace();

		}

		String outStr = stBuild.toString();

		try (BufferedWriter bufWrite = new BufferedWriter(new FileWriter(file))) {

			bufWrite.write(outStr.replaceAll("\\s", ""));

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
