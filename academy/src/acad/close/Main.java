package acad.close;

import java.util.Arrays;



public class Main {
	Clothes[] clothes;
	public static void main(String[] args) {
		

		System.out.println("–азмеры одежды:");
		Size[] size = Size.values();
		for (Size c : size) {
			System.out.println(c + " " + c.ordinal());
			System.out.println(c.getEvroSize());
			Size s =  Size.L;
	}
	
		Studio stud = new Studio();
		Clothes[] clothes = new Clothes[3];
		
		clothes[0] = new Skirt(10,"зеленый",2.15);
		clothes[1] = new Pants(20,"красный",3.10);
		clothes[2] = new Shirt(30,"голубой",1.20); 
		 
		for(Clothes s:clothes) {
	//		System.out.println(s.getSize());
		}
		System.out.println("----------------");
		stud.dressMan(clothes);
		System.out.println("----------------");
		stud.dressWoman(clothes);
	}
}
