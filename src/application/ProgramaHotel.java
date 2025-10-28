
package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.DadosHotel;

public class ProgramaHotel {  

	public static void main(String[] args) {  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Cria um vetor (array) de 10 posições para armazenar objetos do tipo DadosHotel.
		// Cada índice do vetor representa um quarto do hotel (do 0 ao 9).
		DadosHotel [] vet = new DadosHotel[10]; 
		
		// Pergunta quantos quartos serão alugados
		System.out.println("Quantos quartos serão alugados: ");
		int n = sc.nextInt();  // Lê o número digitado pelo usuário e armazena em 'n'
		
		// Estrutura de repetição que vai rodar 'n' vezes
		// OBS: aqui você começou do 1 até n-1 (deveria ser i=1; i<=n; i++)
		for( int i=1; i<n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":"); // Mostra o número do aluguel que está sendo registrado
			
			System.out.println("Nome: ");
			sc.nextLine(); // Limpa o buffer do teclado (para evitar pular a leitura do nome)
			String nome = sc.nextLine(); // Lê o nome do hóspede
			
			System.out.println("Email: ");
			String email = sc.nextLine(); // Lê o e-mail do hóspede
			
			System.out.println("Numero do quarto: ");
			int numero = sc.nextInt(); // Lê o número do quarto escolhido pelo hóspede
			
			// Cria um novo objeto DadosHotel com nome e email e armazena no vetor
			// na posição correspondente ao número do quarto escolhido
			vet[numero] = new DadosHotel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		
		// Percorre os quartos de 0 até n-1 para verificar se estão ocupados
		for(int i=0; i<n; i++) {
			// Se naquela posição do vetor houver um objeto (ou seja, != null)
			if(vet[i] != null) {
				// Imprime o número do quarto e as informações do hóspede
				// vet[i] chama o método toString() da classe DadosHotel
				System.out.println(i + ":" + vet[i]);
			}
		}
		
		sc.close();
	}

}

/* 📌 Explicando a lógica do programa

O programa cria um vetor de 10 posições (representando os 10 quartos do hotel).

Pergunta ao usuário quantos quartos serão alugados.

Para cada aluguel:

Pede o nome e e-mail do hóspede.

Pede o número do quarto que ele vai ocupar.

Guarda essas informações no vetor, na posição do número do quarto.

No final, mostra a lista de quartos ocupados e os dados dos respectivos hóspedes.*/
