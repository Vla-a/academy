package by.homework.homework3.deal;



public class Person {

	
	//public static final Validator americanPhoneValidator = new AmericanPhoneValidator(s);
	String name;
	double cash;

	public Person(String name, double cash) {
		super();
		this.name = name;
		this.cash = cash;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}
}
