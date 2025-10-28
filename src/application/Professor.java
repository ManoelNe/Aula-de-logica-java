package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Professor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno a = new Aluno();
		
		a.nome = sc.nextLine();
		a.nota1 = sc.nextDouble();
		a.nota2 = sc.nextDouble();
		a.nota3 = sc.nextDouble();
		
		System.out.printf("Final grade = %.2f%n", a.notaFinal());
		
		if (a.notaFinal() > 60.0) {
			System.out.println("PASS");
			}
			else {
				System.out.println("FAILED");
				System.out.printf("MISSING %.2f POINTS%n", a.passou());
			}
		
		sc.close();

	}

}
