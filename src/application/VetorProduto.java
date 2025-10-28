package application;

import java.util.Locale;
import java.util.Scanner;


import entidades.ProdutoVetor;

public class VetorProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		ProdutoVetor[] produtos = new ProdutoVetor[n];
		
		for(int i=0; i<produtos.length; i++) {
			 String nome = sc.nextLine();
			 double preco   = sc.nextDouble();
			 sc.nextLine(); 
			 
			 produtos[i] = new ProdutoVetor(nome, preco);
			 
			 
		
		}
		double soma = 0; 
		for(int i=0; i<produtos.length; i++) {
			soma += produtos[i].getPreco();
		}
		double media = soma/produtos.length; 
		
		System.out.printf("Media Produto: %.2f", media);
		
	
		
		
		sc.close();
	}

}
