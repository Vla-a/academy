package acad.lesson9;

public enum Pora {

	WINTER(0.00,"�������") ,  SPRING(10.00,"�����"), OSEN(5.00,"���������"), SAMOR(25.00,"�����");

	private double temp;
	private String des;
	
	Pora(double temp,String des){
		this.temp =temp;
	}

	public double getTemp() {
		return temp;
	}

	
	
	
}

