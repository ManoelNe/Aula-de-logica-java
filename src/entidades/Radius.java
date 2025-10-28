package entidades;

public class Radius {

	public static final double PI = 3.14159;
	
	public static double circumference( double radius) {
		
		double pi = 3.14159; 
		
		return  2 * pi * radius; 
	}
	
	public static double volume(double radius) {
		double pi = 3.14159;
		
		return (4.0/3.0) * pi * radius * radius * radius;
	}
	
	
}
