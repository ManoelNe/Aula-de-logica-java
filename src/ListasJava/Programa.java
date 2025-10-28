package ListasJava;
//Importações necessárias para usar listas e streams
import java.util.ArrayList;         // Classe que implementa a interface List, permitindo criar listas dinâmicas
import java.util.List;              // Interface List (superclasse genérica de listas em Java)
import java.util.stream.Collectors; // Classe usada para coletar resultados de operações de stream

public class Programa {

	public static void main(String[] args) {
		 // Cria uma lista de Strings chamada "list"
        List<String> list = new ArrayList<>();

        // Adiciona elementos à lista
        list.add("Maria"); // posição 0
        list.add("Alex");  // posição 1
        list.add("Bob");   // posição 2 (por enquanto)
        list.add("Anna");  // posição 3
        list.add(2, "Marco"); 
        // adiciona "Marco" na posição 2 e desloca os demais (Bob vai para a posição 3 e Anna para a 4)

        // Mostra o tamanho da lista (quantos elementos possui)
        System.out.println(list.size());

        // For each → percorre todos os elementos da lista e imprime
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // removeIf → remove todos os elementos que satisfaçam a condição do lambda
        // Aqui: remove nomes que começam com 'M'
        list.removeIf(x -> x.charAt(0) == 'M');

        // Imprime a lista novamente após remover os elementos com 'M'
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // indexOf → retorna a posição de um elemento na lista
        // Se não encontrar, retorna -1
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // -1 porque já foi removido

        System.out.println("---------------------");

        // Cria uma nova lista chamada "result" contendo apenas elementos que começam com 'A'
        // 1) abre um stream da lista
        // 2) aplica um filtro (filter) para pegar apenas os nomes que começam com 'A'
        // 3) coleta o resultado em uma nova lista
        List<String> result = list.stream()
                                  .filter(x -> x.charAt(0) == 'A')
                                  .collect(Collectors.toList());

        // Percorre e imprime os nomes que começam com 'A'
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Busca o primeiro elemento que começa com 'J'
        // Se encontrar → retorna a String
        // Se não encontrar → retorna null
        String name = list.stream()
                          .filter(x -> x.charAt(0) == 'J')
                          .findFirst()
                          .orElse(null);

        // Imprime o resultado da busca
        System.out.println(name); // Aqui vai dar null, pois não existe ninguém com 'J' na lista
        
    
    }
}

/* 🔹 Resumo do que o código faz:

	Cria uma lista de nomes.
	
	Adiciona elementos (inclusive em posição específica).
	
	Mostra o tamanho e todos os elementos.
	
	Remove nomes que começam com "M".
	
	Mostra a posição de alguns elementos.
	
	Cria uma sublista só com nomes que começam com "A".
	
	Tenta buscar o primeiro nome que começa com "J" (não encontra e retorna null).

Demo
	• Tamanho da lista: size()
	• Obter o elemento de uma posição: get(position)
	• Inserir elemento na lista: add(obj), add(int, obj)
	• Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
	• Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
	• Filtrar lista com base em predicado:
		List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
	• Encontrar primeira ocorrência com base em predicado:
		Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);

*/ 



