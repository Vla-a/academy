package by.homework.homework0;

public class Cat {
	public int age = 5;
	double money = 10.15;
	public String nickname;
	public char initials = 'F';
	public boolean isHomeAnimals = true;

	Cat() {

	}

	Cat(String CatsNickname) {

		nickname = CatsNickname;

	}

	public void grow(int adage) {

		age = age + adage;

		System.out.println("Коту " + age + " лет");

	}

	public void sleep() {

		System.out.println("Кот спит");

	}

	public void eat() {

		System.out.println("Кот гуляетю");

	}

	public void walk() {

		System.out.println("Кот спит.");

	}

	public int getAge() {
		return age;

	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;

	}

	public void setInitials() {
		System.out.println(initials);
	}

	public char getInitials() {
		return initials;

	}

	public void isHomeAnimals(boolean isHomeAnimals) {
		System.out.println(isHomeAnimals);

	}

	public boolean setIsHomeAnimals() {
		return isHomeAnimals;

	}
}
