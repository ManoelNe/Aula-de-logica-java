package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var N = sc.nextInt(); 
		
		int soma = 0; 
		
		for(int i=0; i<N; i++){
			var X = sc.nextInt(); 
			soma += X;
		}
		
		System.out.printf(soma + " ");
		
		sc.close();
	}

}
