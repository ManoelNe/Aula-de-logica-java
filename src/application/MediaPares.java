package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor: ");
		int N = sc.nextInt();
		
		Media[] vet = new Media[N]; 
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			int numeros = sc.nextInt();
			
			vet[i] = new Media(numeros);
		}
		double soma = 0; 
		int cont = 0; 
		for(int i=0; i<vet.length; i++) {
			if( vet[i].numeros % 2 == 0) {
				soma += vet[i].numeros;
				cont ++; 
			}
		}
		 if (cont == 0) {
	            System.out.println("NENHUM NUMERO PAR");
	        } else {
	            double media = soma / cont;
	            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
	        }
		sc.close();
	}
	
	public static class Media{
		
		public int numeros;
		
		 public Media(int numeros) {
	            this.numeros = numeros;
	        }
	}

}
