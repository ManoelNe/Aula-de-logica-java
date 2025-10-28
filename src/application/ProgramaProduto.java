package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProgramaProduto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        String name = sc.next();
        System.out.printf("Price: ");
        double preco = sc.nextDouble();
        System.out.printf("Quantidade em Estoque: ");
        int quantidade = sc.nextInt();

        	Produto p = new Produto(name, preco, quantidade);
       
        System.out.printf("Product data: %s, $%.2f, %d units, total: $%.2f%n",
                p.name, p.preco, p.quantidade, p.produtoTotal());

        
        System.out.println("Entre com o numero de produtos para adicionar em estoque: ");
        var adicionar = sc.nextInt();
        p.novaQuantidade(adicionar);

        System.out.printf("Atualizado data: %s, $%.2f, %d units, total: $%.2f%n",
                p.name, p.preco, p.quantidade, p.produtoTotal());

        
        System.out.printf("Entre com o numero de produtos para remover em estoque: ");
        var remover = sc.nextInt();
        p.removeQuantidade(remover); 

        System.out.printf("Atualizado data: %s, $%.2f, %d units, total: $%.2f%n",
                p.name, p.preco, p.quantidade, p.produtoTotal());

        sc.close();
    }
}
