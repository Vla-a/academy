package by.homework.homework6.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<User> ar = new ArrayList<User>();
		ar.add(new User("Vasia", "Novik", 11));
		ar.add(new User("Petia", "Lazovik", 12));
		ar.add(new User("Roman", "Ersh", 13));
		ar.add(new User("Vova", "Novak", 15));
		ar.add(new User("Vika", "Navka", 17));
		ar.add(new User("Masha", "Hasan", 9));
		ar.add(new User("Sveta", "Baran", 34));
		ar.add(new User("Dima", "Port", 22));
		ar.add(new User("Maks", "Volk", 10));
		ar.add(new User("Serg", "Nik", 17));

		System.out.println(ar.toString());

		File dir = new File("C:\\Users\\Пользователь\\git\\academy\\academy\\src\\by\\homework\\homework6\\task3\\Users");
		if (!dir.exists()) {
			dir.mkdir();
		}

		for (User per : ar) {
			File file = new File(dir, (per.toString()) + ".txt");

			if (!file.exists()) {

				file.createNewFile();
			}
			try (FileOutputStream outputStream = new FileOutputStream(file);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

				objectOutputStream.writeObject(per);
			} catch (Exception e) {

				System.err.println(e.getMessage());
			} 

		}
	}
}
