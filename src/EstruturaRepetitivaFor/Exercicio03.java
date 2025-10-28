package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int X = sc.nextInt(); 
		
	
		
		int cont = 0; 
		
		int cont2 = 0; 
		
		for(int i=0; i<X; i++) {
			 var N = sc.nextInt();
			 
			 if( N >= 10 && N <= 20) {
				 cont ++; 
				 
			 }else {
				 
				 cont2++; 
				
			}
		}
		System.out.println(cont + " in");
		System.out.println(cont2 + "out");
	
			sc.close();
		}
	
	
	}



