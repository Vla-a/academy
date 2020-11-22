package acad.lesson9;

public class Book implements Printable {

	@Override
	public void print() {

		 System.out.println("bbbb");
		
	}

	public static void PrintBook(Printable[] printable) {
		for (Printable Printable : printable) {
			if (Printable instanceof Magazine ) {
				System.out.println("Magazine");
			}
			
		}
	
	}
}
