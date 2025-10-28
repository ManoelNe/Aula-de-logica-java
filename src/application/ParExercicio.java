package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.ExercicioPares;

public class ParExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar: ");
		int N = sc.nextInt();
		
		ExercicioPares[] vet = new ExercicioPares[N];
		
		for(int i=0; i<vet.length; i++) {
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			
			vet[i] = new ExercicioPares(numero); 
		}
		
		int cont = 0; 
		System.out.println("Numeros Pares:  ");
		for( int i=0; i<vet.length; i++) {
			if(vet[i].getNumero() % 2 == 0) {
				System.out.printf("%d ", vet[i].getNumero());
				cont ++;
			}
		}
		
		System.out.printf("Quantidade de Pares = %d", cont);
		
		sc.close();
	}

}
