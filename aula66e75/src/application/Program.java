package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================================================");
		System.out.println(" Hello, Sir! Please, enter product data below. ");
		System.out.println("================================================");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		// cria variável temporária para receber valor
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		// para evitar que seja criado um produto sem atributos, ou que
		// se esqueça de preencher algum atributo e fique nulo
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		// ou só product, que o programa já reconhece o toString lá na classe product
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	}

}
