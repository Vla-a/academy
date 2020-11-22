package acad.lesson9;

public class Aplicat {

	public static void main(String[] args) {
		
		Printable m = new Magazine();
		Printable b = new Book();
          
          
		Printable[] Printable = {m,b};
		
		for(Printable printable: Printable) {
			
			System.out.println(printable);
			
		}
		
	   
	}

}
