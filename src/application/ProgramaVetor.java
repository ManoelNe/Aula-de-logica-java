package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		double soma = 0; 
		
		
		for(int i=0; i<n; i++) {
			 vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		double media = soma / n; 
		
		System.out.printf("%.2f ", media);
		sc.close();
	}

}
