package by.deals;

public class Deal {

	String date;
	Person seller;
	Person buyer;
	Product[] products;

	public Deal() {
		super();
	}

	public Deal(String date, Person seller, Person buyer, Product[] products) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void result() {
		double sum = 0;
		for (Product product : products) {
			sum += product.getPrice() * product.getQuantity();
		}
		if (sum > buyer.getCash()) {
			System.out.println("У вас не хватает денег ");
		} else {
			printBill();
		}
	}

	private void printBill() {
		double summ = 0;
		System.out.println("Выводим чек ");
		for (Product product : products) {
			double totalProductPrice = product.getPrice() * product.getQuantity();
			summ += totalProductPrice;
			System.out.println("Стоимость: " + product.getName() + " " + product.getPrice() + "*" + product.getQuantity()
					+ "=" + totalProductPrice);
		}
		System.out.println("Сумма покупки " + summ);
		buyer.setCash(buyer.getCash() - summ);
		seller.setCash(seller.getCash() + summ);
		System.out.println("Деньги покупателя " + buyer.getCash());
		System.out.println("Деньги продовца " + seller.getCash());

	}
}
