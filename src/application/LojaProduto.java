package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Loja;

public class LojaProduto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcaoPrincipal = -1; // loop principal
        while (opcaoPrincipal != 0) {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcaoPrincipal = sc.nextInt();
            sc.nextLine(); // limpa buffer

            if (opcaoPrincipal == 1) {
                // Cadastrar produto
                System.out.print("Digite o nome do Produto: ");
                String nome = sc.nextLine();

                System.out.print("Digite o codigo do Produto: ");
                int codigo = sc.nextInt();
                sc.nextLine(); // limpa buffer

                System.out.print("Digite o preco do Produto: ");
                double preco = sc.nextDouble();
                sc.nextLine(); // limpa buffer

                System.out.print("Digite a quantidade do produto em estoque: ");
                int estoque = sc.nextInt();
                sc.nextLine(); // limpa buffer

                Loja produto = new Loja(nome,codigo, preco, estoque);

                // Loop secundário para gerenciar estoque
                int opcaoEstoque = -1;
                while (opcaoEstoque != 0) {
                    System.out.printf("\nProduto: %s, código: %d, valor: $ %.2f, em estoque: %d%n",
                            produto.getNome(), produto.getCodigo(), produto.getPreco(), produto.getEstoque());

                    System.out.println("Escolha uma opção:");
                    System.out.println("1 - Adicionar produto");
                    System.out.println("2 - Remover produto");
                    System.out.println("0 - Voltar ao menu principal");
                    System.out.print("Opção: ");
                    opcaoEstoque = sc.nextInt();
                    sc.nextLine(); // limpa buffer

                    if (opcaoEstoque == 1) {
                        System.out.print("Quantidade a adicionar: ");
                        int adicionar = sc.nextInt();
                        sc.nextLine();
                        produto.adicionarProdutoEstoque(adicionar);
                    } else if (opcaoEstoque == 2) {
                        System.out.print("Quantidade a remover: ");
                        int remover = sc.nextInt();
                        sc.nextLine();
                        if (remover <= produto.getEstoque()) {
                            produto.removeProduto(remover);
                        } else {
                            System.out.println("Não há estoque suficiente!");
                        }
                    } else if (opcaoEstoque == 0) {
                        System.out.println("Voltando ao menu principal...");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }

            } else if (opcaoPrincipal == 0) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
