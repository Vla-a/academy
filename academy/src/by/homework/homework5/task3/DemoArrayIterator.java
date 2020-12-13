package by.homework.homework5.task3;

public class DemoArrayIterator {

	public static void main(String[] args) {
		String[][] array = new String[][] { { "1", "2" }, { "1", "2", "3", "4", "5" }, { "1", "2" },
				{ "1", "2", "3", "4", "5", } };
		ArrayIterator<?> arrayIterator = new ArrayIterator(array);
		while (arrayIterator.hasNext()) {
			System.out.print(arrayIterator.next() + ", ");
		}
	}
}
