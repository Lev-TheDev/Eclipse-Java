package application;

import entities.Client;

public class Program2 {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		// == compara referências de memória, posições de memória
		// equals compara com base no conteúdo do objeto

		System.out.println("----------");
		String s1 = "Test";
		String s2 = "Test";
		
		//tratamento diferenciado a ESCRITAS LITERAIS.
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
	}

}
