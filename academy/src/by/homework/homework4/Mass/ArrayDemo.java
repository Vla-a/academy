package by.homework.homework4.Mass;



public class ArrayDemo {

	public static void main(String[] args) {

		Massiv<Integer> mm1 = new Massiv<>();
		Massiv<Integer> mm2 = new Massiv<>();
		Massiv<Integer> mm3 = new Massiv<>();
		Massiv<Integer> sm1 = new Massiv<>(4);
		Massiv<Integer> sm2 = new Massiv<>(5);

		System.out.println(mm1.getLast());
		sm2.chek();
		sm2.addProd(10);
		sm2.addProd(15);
		sm2.addProd(20);
		sm2.chek();


		System.out.println(sm2.getIndex(2));
		
		System.out.println(sm2.getFirst());
		
		System.out.println(sm2.length());
		
		
		sm2.ltem(0);
		sm2.chek();
		
		System.out.println(sm2.getLast());
		
	}

}
