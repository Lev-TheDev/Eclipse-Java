package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
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
		// list.removeIf(Product::staticProductPredicate);
		
		// alternativa2:
		// reference method com método não-estático		
		// list.removeIf(Product::nonStaticProductPredicate);
		
		// alternativa3:
		// expressão lambda declarada
		// Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		// list.removeIf(pred);
		// ou posso usar variável antes
		// double min = 100.00;
		// Predicate<Product> pred = p -> p.getPrice() >= min;
		// ou variável digitada pelo usuário.
		
		// alternativa4:
		// expressão lambda inline
		// list.removeIf(p -> p.getPrice() >= 100.00);
		// for (Product p : list) {
		// 	System.out.println(p);
		// }
		
		// list.forEach(new PriceUpdate());
		
		// list.forEach(Product::staticPriceUpdate);
		
		// list.forEach(Product::nonStaticPriceUpdate);
		
		/*double factor = 1.1;
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		// como tem só uma linha a função pode-se apagar as chaves e colocar tudo após a seta
		list.forEach(cons);
		*/
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
		// reference method para println
		
		
		
	}

}
