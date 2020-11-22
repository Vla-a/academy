package acad.lesson9;

public enum Pora {

	WINTER(0.00,"Холодно") ,  SPRING(10.00,"тепло"), OSEN(5.00,"прохладно"), SAMOR(25.00,"Жарко");

	private double temp;
	private String des;
	
	Pora(double temp,String des){
		this.temp =temp;
	}

	public double getTemp() {
		return temp;
	}

	
	
	
}

