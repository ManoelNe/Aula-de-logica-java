package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.CalcularDolar;

public class Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual e o preco do dolar: ");
		double preco = sc.nextDouble();
		System.out.println("Quantos dolares serao comprados: ");
		double quantity = sc.nextDouble();
		
		
		
		System.out.printf("Valor a ser pago em reais: %.2f " , CalcularDolar.valorDolar(preco, quantity) );
		
		sc.close();
	}

}
