package by.deals;

public class Milke extends Product {

	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Milke(double price, String type, String name, int quantity, String color) {
		super(price, type, name, quantity);
		
		
	}

	public void discount() {
		
		this.price = 0.90 * price;
		System.out.println(price);
	}
}
