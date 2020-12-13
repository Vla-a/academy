package by.homework.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		Task2 nn = new Task2();
		ArrayList<Integer> mark = new ArrayList<Integer>();

		long timeArrayList = System.currentTimeMillis();
		System.out.println(nn.completion(mark));
		System.out.println("Time Arraylist: " + (System.currentTimeMillis() - timeArrayList));

		LinkedList<Integer> mark1 = new LinkedList<Integer>();

		long timeLinkedList = System.currentTimeMillis();
		System.out.println(nn.completion(mark1));
		System.out.println("Time Linkedlist: " + (System.currentTimeMillis() - timeLinkedList));

		long timeProgram1 = System.currentTimeMillis();
		nn.choice(mark);
		System.out.println("\nTime Program1: " + (System.currentTimeMillis() - timeProgram1));

		long timeProgram2 = System.currentTimeMillis();
		nn.choice(mark1);
		System.out.println("\nTime Program2: " + (System.currentTimeMillis() - timeProgram2));
	}

	public List<Integer> completion(List<Integer> list) {
		for (int i = 0; i < 10000; i++) {
			int a = (int) (Math.random() * 10);
			Integer b = (int) a;
			list.add(b);
		}

		return list;
	}

	public void choice(List<Integer> list) {

		for (int i = 0; i < 10000; i++) {
			int a = (int) (Math.random() * 10000);
			Integer b = (int) a;
			System.out.print(list.get(b) + " ");
		}
	}

}
