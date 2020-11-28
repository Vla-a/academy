package acad.close;

import acad.lesson9.Magazine;
import acad.lesson9.Printable;

public class Studio  {

	
	public void dressWoman(Clothes[] clothes ) {
		for (Clothes clos : clothes) {
			if (clos instanceof WomanClose ) {
				System.out.println(clos.getSize() + clos.getCollor() + clos.getCost());
			}
			
		}
	}

	
	public void dressMan(Clothes[] clothes) {
		
		for (Clothes clos : clothes) {
			if (clos instanceof ManClose ) {
				System.out.println(clos.getSize() + clos.getCollor() + clos.getCost());
	}

}
}
}