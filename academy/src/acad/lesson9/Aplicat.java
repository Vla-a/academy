package acad.lesson9;

public class Aplicat {

	public static void main(String[] args) {
		
		Printable m = new Magazine();
		Printable m1 = new Magazine();
		Printable b = new Book();
		Printable b1 = new Book();
		m.print(); 
          
		Printable[] arr = {m,b,m1,b1};
		
//		for(Printable printable: Printable) {
//			
//			System.out.println(printable);
			
//		}
		
		
		Magazine.PrintMagazines( arr);
		System.out.println("--------------");
		Book.PrintBook(arr);
	}

}
