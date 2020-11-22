package acad.lesson8;

public class Carcl {

	double radius;
	public static final double PI_CONST = 3.14;
	
	

	public Carcl(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius(double radius) {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public  double ploschad (double radius) {
		
		double s = radius * PI_CONST;
		return s;
		
	}
}
