package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		cookies.put("phone", "99711133");
		// vai sobrescrever o valor do phone, porque não admite chaves iguais
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		// quando o elemento que se tenta dar get não existe, o retorno é null
		System.out.println("Size: " + cookies.size());
		
		System.out.println();
		System.out.println("All cokies:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
				

	}
}
