package by.homework.homework5;

public class Task6 {

	public static void main(String args[]) {

		try {
			addArray(10);
		} catch (Exception e) {

			System.out.println(("\n Array is to small, expand the array"));
		}

	}

	public static void addArray(int a) throws Exception {
		int i = 0;
		int[] arr = new int[8];

		while (i < a) {

			arr[i] = i;
			System.out.print(arr[i]);
			i++;

		}
	}

}
