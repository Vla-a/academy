package by.academy.lesson1;

public class Cat {
	public int age=5;
	double money=10;

	public String nickname;

	Cat() {

	}

	Cat(String CatsNickname) {

		nickname = CatsNickname;

	}

	public void grow(int adage) {

		age = age + adage;

		System.out.println(" ���� " + age + " ���. ");

	}

	public void sleep() {

		System.out.println(" ��� ����. ");

	}

	public void eat() {

		System.out.println(" ��� ���. ");

	}

	public void walk() {

		System.out.println(" ��� ������. ");

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
	
}
