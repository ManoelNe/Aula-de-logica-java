package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Funcionario f = new Funcionario();
		
		System.out.print("Name: ");
		f.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		f.salarioBruto = sc.nextDouble();
		System.out.print("Tax: ");
		f.taxa = sc.nextDouble();
		
		System.out.printf("Funcionario: %s, $ %.2f", f.nome, f.salarioLiquido());
		
		System.out.print("Qual a porcentagem de aumento salarial: ");
		var porcentagem = sc.nextDouble();
		f.aumentoSalario(porcentagem);
		
		System.out.printf("Salario: %s, %.2f ", f.nome, f.salarioLiquido());
		
		sc.close();

	}

}
