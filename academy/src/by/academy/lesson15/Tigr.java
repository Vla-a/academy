package by.academy.lesson15;

public class Tigr extends Cat{

	private int age;
	public String name;
	protected int lines;
	
	@Zoo(number = "Z35F")
	public void run( ) {
		System.out.println("Тигр бежит");
	}
	
	private void eat(String s ) {
		System.out.println("Тигр ест"+s);
	}
	
	protected void slepp( ) {
		System.out.println("Тигр гуляет");
	}
	
}
