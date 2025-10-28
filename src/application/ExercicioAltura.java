package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Altura;

public class ExercicioAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		
		Altura[] vet = new Altura[n];
		
		for(int i=0; i<vet.length; i++) {
			
			
			    
			System.out.println("Dados da " + (i+1) + " pessoa:");
			
			sc.nextLine();
			System.out.printf("Nome:");
			String nome = sc.nextLine();
			
			
			System.out.printf("Idade:");
			int idade = sc.nextInt();
			
			System.out.printf("Altura:");
			double altura = sc.nextDouble();
		
			
			
			vet[i] = new Altura(nome, idade, altura);
		}
		
		double soma = 0;
		
		for(int i=0; i<vet.length; i++) {
			
			soma += vet[i].getAltura();
		}
		
		double media = soma / vet.length;
		
		System.out.printf("Altura Media: %.2f%n", media);
		
		int cont = 0; 
		
		for(int i=0; i<vet.length; i++) {
			if( vet[i].getIdade() < 16) {
				cont++; 
		
			}
				
		}
		
		double porcentagem = (cont * 100.0) / vet.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
		
		for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() < 16) {
                System.out.println(vet[i].getNome());
            }
        }
		
		sc.close();
	}

}
