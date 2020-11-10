package by.homework.homework0;

public class Aplication {

	public static void main(String[] args) {
		Cat cat1 = new Cat();

		Cat bars = new Cat("bars");

		bars.eat();

		bars.sleep();

		bars.walk();

		cat1.grow(1);

		cat1.grow(4);

		cat1.grow(10);

		int getAge = cat1.getAge();
		System.out.println(getAge);

		double money = cat1.getMoney();
		System.out.println(money);

		cat1.setInitials();

		char getInitials = cat1.getInitials();
		System.out.println(getInitials);

		cat1.isHomeAnimals(true);

		boolean setIsHomeAnimals = cat1.setIsHomeAnimals();
		System.out.println("�������� �� �������� ��������: " + setIsHomeAnimals);
	}
}
