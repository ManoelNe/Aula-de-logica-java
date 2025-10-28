package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.ExercicioVetor;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		
		System.out.printf("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		
		ExercicioVetor[] vet = new ExercicioVetor[n];
		
		for( int i=0; i< vet.length; i++) {
			System.out.printf("Digite um numero: ");
			int numero = sc.nextInt();
			
			vet[i] = new ExercicioVetor(numero);
		}
		System.out.printf("Numeros Negativos: %n");
		for(int i=0; i<vet.length; i++) {
		
			if( vet[i].getNumero() < 0) {
				
				System.out.println(vet[i].getNumero() + " ");
			}
		}
		
		sc.close();
	}

}
