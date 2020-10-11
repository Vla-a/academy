package by.academy.lesson1;

public class Aplication {

	public static void main(String[] args) {
		Cat cat1 = new Cat();

		Cat back = new Cat("back");
		

		back.eat();

		back.sleep();

		back.walk();

		cat1.grow(1);

		cat1.grow(4);

		cat1.grow(10);

		int getAge = cat1.getAge();
		System.out.println(getAge);

		double money = cat1.getMoney();
		 System.out.println(money);
	}

}
