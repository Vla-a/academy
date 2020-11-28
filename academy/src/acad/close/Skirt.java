package acad.close;

public class Skirt extends Clothes implements  WomanClose {

	
	
	public Skirt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skirt(int size, String collor, double cost) {
		super(size, collor, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dressWoman() {
		System.out.println("Женщина одета");
		
	}

	
	
		
	

}
