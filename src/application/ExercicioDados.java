package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.DadosPessoas;

public class ExercicioDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Quantas pessoas serao digitadas: ");
		int N = sc.nextInt();
		
		DadosPessoas[] vet = new DadosPessoas[N];
		
		for(int i=0; i<vet.length; i++) {
			System.out.printf("Altura da " + (i + 1 ) + " a pessoa:");
			double altura = sc.nextDouble();
			sc.nextLine();
			
			System.out.printf("Genero da " + (i + 1 ) + " a pessoa:");
			char sexo = sc.nextLine().charAt(0);
			
			
			vet[i] = new DadosPessoas(altura,sexo);
		}
		
		double maiorAltura = vet[0].getAltura();
		
		for(int i=0; i<vet.length; i++) {
			if( vet[i].getAltura() > maiorAltura) {
				maiorAltura = vet[i].getAltura();
			}
		}
		double menorAltura = vet[0].getAltura();
		
		for(int i=0; i<vet.length; i++) {
			if( vet[i].getAltura() < menorAltura) {
				menorAltura = vet[i].getAltura();
			}
		}
		
		System.out.printf("Menor Altura: %.2f\n", menorAltura);
		System.out.printf("Maior Altura: %.2f\n", maiorAltura);
		
		int cont = 0; 
		
		for(int i=0; i<vet.length; i++) {
			if( vet[i].Sexo() == 'm' ){
				cont ++;
			}
		}
		
		
		double soma = 0.0; 
		int contf = 0; 
		for(int i=0; i<vet.length; i++) {
			if( vet[i].Sexo() == 'f' ){
				contf ++; 
				soma += vet[i].getAltura();
				
			
			}
		}
		
		double media = soma/ contf; 
		System.out.printf("Media da altura das mulheres = %.2f\n", media);
		System.out.printf("Numeros de Homens = %d", cont);
		
		
		
		sc.close();
	}

}
