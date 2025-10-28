package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.MaiorPosicao;

public class ExercicioMaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		System.out.println("Quantos numeros voce vai digitar: ");
		int N = sc.nextInt();
		
		MaiorPosicao [] vet = new MaiorPosicao[N]; 
		
		
		
		for(int i=0; i<vet.length; i++) {
			System.out.println("Digite um numero: ");
			double posicao = sc.nextDouble();
			
			vet[i] = new MaiorPosicao(posicao);
		}
		
		double maiorP = vet[0].getPosicao(); // aqui o meu maiorP, já vai começar com o numero do indice 0 
		int indiceMaior = 0;
		for(int i=1; i<vet.length; i++) {
			
			if(vet[i].getPosicao() > maiorP) {
			
				maiorP = vet[i].getPosicao(); // Assim, o maiorP vai sendo atualizado a cada vez que encontra um número maior.
				indiceMaior = i; // aqui vou pegar em qual indice está o meu numero
			}
		
		}
		
		System.out.printf("Maior Valor = %f %n" + maiorP);
		System.out.printf("Posicao do Maior valor = %d", indiceMaior);
		
		sc.close();
	}

}
