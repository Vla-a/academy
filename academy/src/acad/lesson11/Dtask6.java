package acad.lesson11;

public class Dtask6 {

	
	public static void main(String args[]) {
		int i = 0;
		int[] arr = new int[8];

		while (i < 10) {
		try {
			arr[i] = i;
			
		} catch (Exception e) {

			System.out.println(("\n Array is to small, expand the array"));
		}

		System.out.print(arr[i]);
		i++;
	}

	

		}
}
