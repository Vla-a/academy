package by.deals;

public class Aplication {

	
		
		public static void main(String[] args) {
			Person seller = new Person("Vasya", 200.00);
			Person buyer = new Person("Petya", 300.00);

			Product[] products = new Product[5];
			products[0] = new Product(10.00, "fruits", "apple", 5);
			products[1] = new Product(7.00, "fruits", "peach", 7);
			products[2] = new Product(3.00, "fruits", "banana", 15);
			
			products[3]  = new Milke(10.00, "bacaleya", "Milke", 2, "Blake");
			products[4]  = new Milke(15.00, "drinke", "Wine", 1, "Sweet");
			
			Deal firstDeal = new Deal("1 January",buyer,seller,products);
			firstDeal.result();
			
			Milke mmm = new Milke(10.00, "bacaleya", "Milke", 2, "Blake");
			mmm.discount();
		} 

		

	

}
