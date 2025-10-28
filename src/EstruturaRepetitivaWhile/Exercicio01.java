package EstruturaRepetitivaWhile;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		var x = sc.nextInt();
		
		int soma = 0; 
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
			
		}
		 
		
		System.out.printf(soma + " ");
		
		sc.close();
	}

}
