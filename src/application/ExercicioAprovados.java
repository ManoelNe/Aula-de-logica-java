package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aprovados;

public class ExercicioAprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Quantos alunos serao digitados: ");
		int N = sc.nextInt();
		
		Aprovados[] vet = new Aprovados[N];
		
		
		
		for(int i=0; i<vet.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno: ");
			sc.nextLine(); 
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
		
			
			vet[i] = new Aprovados(nome, nota1, nota2);
			
		}
		
		
		
		
		
		System.out.print("Alunos Aprovados: ");
		for (int i = 0; i < vet.length; i++) {
		    double mediaAluno = vet[i].somarNota() / 2; // média do aluno
		    if (mediaAluno >= 6.0) {
		        System.out.print(vet[i].getNome() + " ");
		    }
		}
		System.out.println();
		
		
		sc.close();
	}

}
