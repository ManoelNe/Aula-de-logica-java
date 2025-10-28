package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.SomaVetor;

public class SomaVetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		
		SomaVetor[] vetor = new SomaVetor[n]; 
		
		for(int i=0; i<vetor.length; i++) {
			double valor = sc.nextDouble();
			
			 vetor[i] = new SomaVetor(valor);
		}
		System.out.print("VALORES = ");
		for(int i=0; i<vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i].getValor());
		}
		System.out.println();
		
		double soma = 0; 
		
		for(int i=0; i<vetor.length; i++) {
			
			soma += vetor[i].getValor();
		}
		
		double media = soma / vetor.length;
		
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Media = %.2f%n ", media);
		
		sc.close();
	}

}
