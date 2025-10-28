package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.MaisVelho;

public class ExercicioMaisV {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		MaisVelho[] pessoa  = new MaisVelho[N];
		
		for(int i=0; i<pessoa.length; i++) {
			System.out.print("dados da " + (i+1) + " ª pessoa: \n");
			System.out.print("nome: ");
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			pessoa[i] = new MaisVelho();
			pessoa[i].nome = nome; 
			pessoa[i]. idade = idade; 
			
		}
		
		int posicao = pessoa[0].idade;
		String pegar = pessoa[0].nome; 
		for(int i=1; i<pessoa.length; i++) {
			if(pessoa[i].idade > posicao) {
				posicao = pessoa[i].idade;
				pegar = pessoa[i].nome;
			}
			
		}
		
		System.out.printf("Pessoa Mais Velha: %s", pegar);
		sc.close();
	}

}
