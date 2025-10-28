package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor: ");
		int N = sc.nextInt();
		
		Baixo[] vet = new Baixo[N];
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			double numero = sc.nextDouble();
			
			vet[i] = new Baixo(numero);
			
		}
		double soma = 0; 
		for(int i=0; i<vet.length; i++) {
			soma += vet[i].numero;
		}
		
		double media = soma / N;
		
		System.out.printf("Media do Vetor = %.3f%n", media);
		
		
		
		System.out.println("Elementos Abaixo Da Media: ");
		for(int i=0; i<vet.length; i++) {
			if (vet[i].numero < media) {
				
				System.out.printf(vet[i].numero + " ");
			}
		}
		
		
		sc.close();
	}

	public static class Baixo {
		
		public double numero;
		
		 public Baixo(double numero) {
	            this.numero = numero;
	        }
	}
}
