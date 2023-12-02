package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(p -> p.getPrice() >= 100.00);
		// remover todo produto p tal que o preço seja maior ou igual a 100.
		// alternativa:
		// implementar manualmente classe para explicar
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}