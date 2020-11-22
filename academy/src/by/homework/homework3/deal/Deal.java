package by.homework.homework3.deal;

public class Deal {

	public final static int DEFAULT_PRODUCT_SIZE = 2;
	String date;
	Person seller;
	Person buyer;
	Product[] products;
	private int productCounter;
	double calc = 0;

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
			sum += product.getPrice() * product.getQuantity() * product.discount();
		}
		if (sum > buyer.getCash()) {
			System.out.println("Недостаточно средств! ");
		} else {
			printBill();
		}
	}

	private void printBill() {
		double summ = 0;
		System.out.println("Сделка совершена ");
		for (Product product : products) {
			double totalProductPrice = product.getPrice() * product.getQuantity() * product.discount();
			summ += totalProductPrice;
			System.out.println("Продукт: " + product.getProducerName() + " " + product.getPrice() + "X"
					+ product.getQuantity() + "=" + totalProductPrice);
		}
		System.out.println("Сумма всей сделки " + summ);
		buyer.setCash(buyer.getCash() - summ);
		seller.setCash(seller.getCash() + summ);
		System.out.println("Деньги покупателя " + buyer.getCash());
		System.out.println("Деньги продавца " + seller.getCash());

	}

	public void addProduct(Product product) {

		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	public void deleteProduct(int index) {

		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	public void printProducts() {
		double cal = 0;
		for (int i = 0; i < productCounter; i++) {

			Product p = products[i];
			cal += p.calcTotalPrice();
			System.out.println("Name: " + p.getProducerName());
			System.out.println("Type: " + p.getType());
			System.out.println("Количество: " + p.getQuantity());
			System.out.println("Цена за шт.: " + p.getPrice());
			System.out.println("Total Price: " + p.calcTotalPrice());
			System.out.println("-----------------");
		}
		calc = cal;
	}

	public void deal() {

		System.out.println("Сумма всей сделки " + calc);
		buyer.setCash(buyer.getCash() - calc);
		seller.setCash(seller.getCash() + calc);
		System.out.println("Деньги покупателя " + buyer.getCash());
		System.out.println("Деньги продавца " + seller.getCash());

	}

}
