package application; // Define o pacote onde essa classe está localizada

import java.time.LocalDate;
// Importações necessárias para usar listas, entrada de dados e configuração de locale
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.RegistroFuncionario; // Importa a classe que representa um funcionário

public class ProgramaRegistro {

	public static void main(String[] args) {
		// Configura a localização do programa para EUA (isso afeta o separador decimal: ponto ao invés de vírgula)
		Locale.setDefault(Locale.US);
		
		LocalDate d01 = LocalDate.now();

		// Scanner para ler dados do teclado
		Scanner sc = new Scanner(System.in);
		
		// Criação de uma lista de funcionários.
		// List é a interface, e ArrayList é a implementação.
		// Essa lista vai armazenar vários objetos do tipo RegistroFuncionario.
		List<RegistroFuncionario> list = new ArrayList<>();
		
		// Pergunta quantos funcionários o usuário vai cadastrar
		System.out.println(d01 + " Quantos Funcionarios: ");
		int N = sc.nextInt(); 
		
		// Estrutura de repetição para cadastrar N funcionários
		for (int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i+1) + ":");
			
			// Lê o ID do funcionário
			System.out.print("id: ");
			Integer id = sc.nextInt();

			// Lê o nome do funcionário
			System.out.print("Nome: ");
			sc.nextLine(); // Consome a quebra de linha que ficou no buffer
			String nome = sc.nextLine();

			// Lê o salário do funcionário
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			// Cria um objeto RegistroFuncionario com os dados lidos
			RegistroFuncionario func = new RegistroFuncionario(id, nome, salario);
			
			// Adiciona o objeto criado na lista
			list.add(func);
		}
		
		// Pergunta qual funcionário (pelo ID) terá aumento salarial
		System.out.print("Digite o ID do funcionário que tera aumento salarial: ");
		int idSalario = sc.nextInt();
		
		// Procura o funcionário dentro da lista usando Stream API
		// "x" representa cada funcionário da lista enquanto o filtro roda
		// Se encontrar o id, devolve o funcionário. Se não, devolve null.
		RegistroFuncionario func = list.stream()
				.filter(x -> x.getId() == idSalario)
				.findFirst()
				.orElse(null);
		
		// Se não encontrou o funcionário com aquele ID
		if (func == null) {
			System.out.println(" Id nao existe");
		} else {
			// Se encontrou, pede a porcentagem de aumento
			System.out.println("Entre com a porcentagem");
			double porcentagem = sc.nextDouble();

			// Aplica o aumento chamando o método da classe RegistroFuncionario
			func.acrescentarSalario(porcentagem);
		}
		System.out.println();
		System.out.print("Digite o ID do funcionário que será removido: ");
		int removeFuncionario = sc.nextInt();

		// removeIf percorre a lista e remove todos os elementos que satisfazem a condição
		boolean removed = list.removeIf(f -> f.getId() == removeFuncionario);

		if (removed) {
		    System.out.println("Funcionário removido com sucesso!");
		} else {
		    System.out.println("Id não existe na lista.");
		}
		
		// Mostra a lista de todos os funcionários cadastrados
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		// Aqui, "func1" é a variável de laço que percorre cada funcionário da lista
		for (RegistroFuncionario func1 : list) {
			System.out.println(func1); 
			// Esse println vai chamar automaticamente o toString() da classe RegistroFuncionario
		}
		
		
		
		
		
		// Fecha o scanner
		sc.close();

	}

}

/* Pontos principais para estudar 🚀

		Lista:
		
		List<RegistroFuncionario> list = new ArrayList<>();
		
		
		→ Cria uma lista vazia que vai guardar objetos RegistroFuncionario.
		
		Adicionar elementos:
		
		list.add(func);
		
		
		→ Cada funcionário criado é colocado dentro da lista.
		
		Percorrer a lista:
		
		for (RegistroFuncionario func1 : list) {
		    System.out.println(func1);
		}
		
		
		→ O for each passa por todos os funcionários da lista.
		
		Procurar elemento na lista com Stream:
		
		list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		
		
		→ Filtra os funcionários pelo id, pega o primeiro encontrado ou retorna null se não encontrar.
		
		👉 Dica: sempre que ficar confuso, pense que a lista é como uma caixa onde você vai guardando objetos.
		Depois você pode abrir a caixa e procurar pelo que quiser (usando for ou stream).
		
		👉 Que expressão é essa?

		list.stream() → transforma a lista em um fluxo de dados (um stream).
		
		.filter(...) → serve para filtrar elementos desse fluxo conforme uma condição.
		
		(x -> x.getId() == idSalario) → aqui está a lambda expression.
		
		
		*/
