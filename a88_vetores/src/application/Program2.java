package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] vet = new Product[n];
		
		double soma = 0.00;
		
		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vet[i] = new Product(name, price);
			soma += vet[i].getPrice(); 
		}
		
		double media = soma / vet.length;
		System.out.printf("A média dos preços dos produtos é: %.2f", media);
		
		
		sc.close();
	}

}
