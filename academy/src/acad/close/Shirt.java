package acad.close;

public class Shirt extends Clothes implements ManClose, WomanClose{

	
	
	
	
	public Shirt() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Shirt(int size, String collor, double cost) {
		super(size, collor, cost);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void dressWoman() {
		System.out.println("Женщина одета");
		
	}

	
	@Override
	public void dressMan() {
		System.out.println("Мужчина одет");
		
	}

}
