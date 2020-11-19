package by.homework.homework3.deal;



public class Aplication {
	public static void main(String[] args) {
		Person seller = new Person("Vasya", 200.00);
		Person buyer = new Person("Petya", 300.00);

		Product[] products = new Product[5];
		products[0] = new Product(10.00, "fruits", "apple", 5);
		products[1] = new Product(7.00, "fruits", "peach", 7);
		products[2] = new Product(3.00, "fruits", "banana", 15);

		products[3] = new Milk(10.00, "bacaleya", "Milka", 2, "Blake");
		products[4] = new Vine(15.00, "drinke", "Wine", 1);

		//Deal firstDeal = new Deal("1 January", buyer, seller, products);
		//firstDeal.result();
//		for (Product p : products) {
//			System.out.println("Name: " + p.getProducerName());
//			System.out.println("Type: " + p.getType());
//			System.out.println("Total Price: " + p.calcTotalPrice());
//			System.out.println("-----------------");
//		}
		//Person.americanPhoneValidator.isValid("+123123123");

		System.out.println(((Milk) products[3]).getNonStaticMilkCount());
		System.out.println(Milk.getMilkCount());

//		Product pTest = new Milk(3.00, "fruits", "banana", 15, "black");
//		Milk mtest = new Product(10.00, "fruits", "apple", 5);
//		Deal firstDeal = new Deal("1 January",buyer,seller,products);
//		firstDeal.result();

	}

}
