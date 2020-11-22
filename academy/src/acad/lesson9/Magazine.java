package acad.lesson9;

public class Magazine implements Printable {

	@Override
	public void print() {

		System.out.println("fff");
	}

	public static void PrintMagazines(Printable[] printable) {
		for (Printable Printable : printable) {
			if (Printable instanceof Magazine ) {
				System.out.println("Book");
			}
			
		}
	}

}
