package acad;

public class Test3 {

	public static void main(String[] args) {
		// Массив из нечетных чисел до 20
		int[] mass = new int[20 / 2];

		for (int i = 0, j = 1; i < mass.length; i++, j += 2) {
			mass[i] = j;
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		// for (int i = 0; i < mass.length; i++) {
		// System.out.print("\n" + mass[i]);
		// }
		// Массив из нечетных чисел до 40 с сортировкой
		int[] mass1 = new int[20];

		for (int i = 0, j = 1; i < mass1.length; i++, j += 2) {
			mass1[i] = j;
			System.out.print(mass1[i] + " ");
		}
		System.out.println();
		int a = 0;
		for (int i = 0; i < mass1.length; i++) {
			for (int j = 0; j < mass1.length - 1; j++) {
				if (mass1[i] > mass1[j]) {
					a = mass1[j];
					mass1[j] = mass1[i];
					mass1[i] = a;

				}
			}
		}
		for (int i = 0; i < mass1.length; i++) {
			System.out.print(mass1[i] + " ");
		}
		System.out.println();
		int[] array;
		array = new int[12];
		for (int i = 0; i < array.length; i++) {
		    array[i] = ((int)(Math.random() * 30-15) );
		    System.out.print(array[i]+" ");
		}
		System.out.println();
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max = array[i];
				
			}
		}System.out.println(max);
		
	}

}
