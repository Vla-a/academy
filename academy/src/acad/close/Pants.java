package acad.close;

public class Pants extends Clothes implements ManClose, WomanClose{

	
	
	public Pants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pants(int size, String collor, double cost) {
		super(size, collor, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dressWoman() {
		System.out.println("Женщина одета");
		
	}

	@Override
	public void dressMan() {
		System.out.println("Мужчина одета");
		
	}

}
