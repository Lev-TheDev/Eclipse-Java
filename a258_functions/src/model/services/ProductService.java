package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
			// if (p.getName().charAt(0) == 'T') {
				// isto entre parênteses é um predicado, uma condição que retorna V ou F
				// então posso jogar ele lá no parâmetro do método
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
