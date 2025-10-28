package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var X = sc.nextInt();
		
		
		
		for(int i=0; i<X; i++) {
			var N1 = sc.nextInt(); 
			var N2 = sc.nextInt(); 
			
			
			if( N2 == 0) {
				System.out.println("Divisão Impossivel");
			}else {
				double D = (double)N1 / N2; 
				System.out.println(D + " " );
			}
			
		}
		
		sc.close();

	}

}
