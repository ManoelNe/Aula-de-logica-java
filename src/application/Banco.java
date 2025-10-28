package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class Banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Insira o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha
        
        System.out.print("Insira o titular da conta: ");
        String nome = sc.nextLine();
        
        System.out.print("Ha um deposito inicial (s/n)? ");
        char depositar = sc.next().charAt(0);
        
        double depositoInicial = 0.0;
        if (depositar == 's') {
            System.out.print("Insira o valor do deposito inicial: ");
            depositoInicial = sc.nextDouble();
        }
        
        // cria apenas UMA conta
        Conta conta = new Conta(numero, nome, depositoInicial); 
        
        System.out.printf("Dados da conta: %d, Titular: %s, Saldo: $ %.2f%n", 
                          conta.getNumero(), conta.getNome(), conta.getDepositoInicial());
        
        System.out.print("Insira o valor do deposito: ");
        double valor = sc.nextDouble();
        conta.deposito(valor);
        
        System.out.printf("Dados atualizados da conta: %d, Titular: %s, Saldo: $ %.2f%n", 
                          conta.getNumero(), conta.getNome(), conta.getDepositoInicial());
        
        System.out.print("Insira o valor do saque: ");
        double dinheiro = sc.nextDouble();
        conta.saque(dinheiro);
        
        System.out.printf("Dados atualizados da conta: %d, Titular: %s, Saldo: $ %.2f%n", 
                          conta.getNumero(), conta.getNome(), conta.getDepositoInicial());
        
        sc.close();
    }
}
