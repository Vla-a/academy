package by.homework.homework5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {

	List<String> list;

	public static void main(String[] args) {
		System.out.println("Значения: ");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("2");
		list.add("2");
		list.add("3");
		list.add("4");

		for (String temp : list) {
			System.out.print(temp + " ");

		}
		Task1 mm = new Task1();
		mm.method(list);
	}

	public Set<String> method(List<String> list) {
		Set<String> set = new HashSet<String>(list);

		System.out.println("\nЗначения без дубликатов: ");
		for (String temp : set) {
			System.out.print(temp + " ");
		}
		return set;
	}
}
