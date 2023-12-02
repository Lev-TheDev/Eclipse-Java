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
		
		// list.removeIf(p -> p.getPrice() >= 100.00);
		// remover todo produto p tal que o preço seja maior ou igual a 100.

		// alternativa1:
		// implementar manualmente classe para explicar
		// list.removeIf(new ProductPredicate());

		// alternativa2:
		// reference method com método estático		
		list.removeIf(Product::staticProductPredicate);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
