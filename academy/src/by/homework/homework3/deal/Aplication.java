package by.homework.homework3.deal;

import java.time.LocalDate;
import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя покупателя: ");
		String sName = sc.next();
		System.out.println("Введите имя продовца: ");
		String bName = sc.next();
		System.out.println("Введите сумму покупателя: ");
		int viletS = sc.nextInt();


		Person pe = new Person();
		pe.email();
		pe.dateBir();
		pe.validat();


		 sc.close();

		Person seller = new Person(sName, 0.00);
		Person buyer = new Person(bName, viletS);

		Product[] products = new Product[6];
		/*
		 * products [0] = new Product(10.00, "fruits", "apple", 3); products[1] = new
		 * Product(7.00, "fruits", "peach", 5); products[2] = new Product(3.00,
		 * "fruits", "banana", 7);
		 * 
		 * products[3] = new Milk(10.00, "bacaleya", "Milka", 2, "Blake"); products[4] =
		 * new Vine(15.00, "drinke", "Wine", 1); products[5] = new Meat(17.00, "meat",
		 * "beef", 3);
		 * 
		 * 
		 * for (Product p : products) { System.out.print("Name: " + p.getProducerName()
		 * + " "); } System.out.println();
		 * 
		 * 
		 * Deal firstDeal = new Deal("1 oct", buyer, seller, products);
		 * firstDeal.result();
		 */
		// System.out.println("Покупатель: "+seller.getName() + " . Продавец: " +
		// buyer.getName());
//		for (Product p : products) {
//			System.out.println("Name: " + p.getProducerName());
//			System.out.println("Type: " + p.getType());
//			System.out.println("Total Price: " + p.calcTotalPrice());
//			System.out.println("-----------------");
//		}

		// System.out.println(((Milk) products[3]).getNonStaticMilkCount());
//		 System.out.println(Milk.getMilkCount());
		Deal deal = new Deal("21-11-2020", seller, buyer, products);

		deal.addProduct(new Meat(17.00, "meat", "beef", 3));

		deal.addProduct(new Vine(15.00, "drinke", "Wine", 1));

		deal.addProduct(new Milk(10.00, "bacaleya", "Milka", 2, "Blake"));

		deal.addProduct(new Product(10.00, "fruits", "apple", 3));

		deal.addProduct(new Product(7.00, "fruits", "peach", 5));

		deal.printProducts();
		deal.deleteProduct(1);
		deal.deleteProduct(2);
		System.out.println("---------------------------------------");
		deal.printProducts();
		deal.deal();

		// Product pTest = new Milk(3.00, "fruits", "banana", 15, "black");
		// Milk mtest = new Product(10.00, "fruits", "apple", 5, "Blake");

		LocalDate today = LocalDate.now();
		System.out.println("Дата начала сделки: " + today);
		System.out.println("Дата окончания сделки: " + today.plusDays(10));

	}

}
