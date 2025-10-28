package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Radius;


public class ProgramaRadius {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com o Raio: ");
		double  radius = sc.nextDouble();
		
		double c = Radius.circumference(radius);
		double v = Radius.volume(radius);
		
		
		
		System.out.printf("Circumference: %.2f%n" , c);
		System.out.printf("Volume: %.2f%n" , v);
		System.out.printf("PI: %.2f" , Radius.PI);
		
		
		
		sc.close();

	}

}
