package acad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDateTime;

public class Files {

	public static void main(String[] args) throws IOException {
		File dir = new File("files");

		if (!dir.exists()) {
			dir.mkdir();

		}
		File src = new File("text.txt");
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
		int counter = 0;
		for (int i = 0; i < 20; i++) {
			File file = new File(dir, (i + 1) + ".txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			try (FileWriter fw = new FileWriter(file)) {

				fw.write(word[counter++] + " ");
				fw.write(word[counter++] + " ");
				fw.write(word[counter++] + " " + "\n ");
				LocalDateTime date = LocalDateTime.now();
				fw.write(date.toString());

			}

		}
	}
}