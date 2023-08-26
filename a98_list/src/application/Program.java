package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// List<Integer> list;
		// declaração da lista, falta instanciar utilizando classe
		// que implementa a interface List
		// lista não aceita tipos primitivos, somente wrapper classes
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco");
		// informar o index e o elemento
		
		System.out.println(list.size());
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		System.out.println("---------");
		
		//list.remove("Anna");
		//list.remove(1);
		list.removeIf(name -> name.charAt(0) == 'M');
		// operação lambda que...
		// remove todo name se o name charAt(0) for igual a M
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("---------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		// quando não encontra, index retorna -1
		System.out.println("---------");
		
		// filtrar a lista e deixar nela todos que começam com A
		List<String> result = list.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());
		
		// chamar list, converter ela para tipo stream que aceita
		// operações lambda do Java8 pra cima, chamar função filter
		// que recebe o predicado (lambda). Stream não é compatível com
		// list, então precisa converter para list com collect
		
		for (String name : result) {
			System.out.println(name);
		}
		
		System.out.println("---------");
		
		String nome = list.stream().filter(name -> name.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);

	}
}
