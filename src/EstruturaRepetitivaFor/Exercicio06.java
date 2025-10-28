package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		double D = 0; 
		
		for (int i=1; i<=n; i++) {
			D = n % i;
			if( D == 0) {
				System.out.println(i + " ");
			}
			
			
		}
		

		
		sc.close();
	}
}