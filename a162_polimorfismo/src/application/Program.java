package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			Character ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (Character.toUpperCase(ch) == 'U') {
				System.out.print("Manufacture date (DD/MM/YYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), frmt1);
				Product used = new UsedProduct(name, price, manufactureDate);
				list.add(used);
			}
			else if (Character.toUpperCase(ch) == 'I') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product imported = new ImportedProduct(name, price, customsFee);
				list.add(imported);
			}
			else {
				Product common = new Product(name, price);
				list.add(common);
			}
		}
		
		System.out.println("\nPRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}
}
