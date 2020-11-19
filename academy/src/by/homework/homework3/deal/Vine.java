package by.homework.homework3.deal;

public class Vine extends Product {

	public Vine(double price, String type, String producerName, int quantity) {
		super(price, type, producerName, quantity);
	}

	@Override
	public double discount() {
		if (quantity * price > 2) {
			return 0.9;// 5% discount
		}
		return 1;
	}
}
