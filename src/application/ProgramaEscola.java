package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.CadastroAluno;

public class ProgramaEscola {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.printf("Digite sua idade");
		int idade = sc.nextInt();
		
		System.out.printf("Digite sua primeira Nota: ");
		double nota1 = sc.nextDouble();
		System.out.printf("Digite sua segunda nota Nota: ");
		double nota2 = sc.nextDouble();
		System.out.printf("Digite sua terceira Nota: ");
		double nota3 = sc.nextDouble();
		
		CadastroAluno aluno = new CadastroAluno(nome, idade, nota1, nota2, nota3);
		
		if(aluno.semestre() > 60) {
			System.out.printf("Boas Ferias %s voce esta aprovado", aluno.getNome());
		}else {
			System.out.printf("Caro aluno: %s, voce ficou de recuperacao, faltou: %.0f ponto(s), para voce ser aprovado", aluno.getNome(), aluno.passou());
		}
		
		sc.close();

	}

}
