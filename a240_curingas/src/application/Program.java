package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	private static void printList(List<?> list) {
		//list.add(3);   erro de compilação
		// não se pode adicionar, pois compilador não sabe o tipo específico
		// da lista instanciada.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
