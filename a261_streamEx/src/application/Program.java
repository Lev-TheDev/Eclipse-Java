package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// /home/rogerlevino/Documentos/a261/in.txt
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> list = new ArrayList<>();
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg = list.stream()
					// uma forma de realizar o fluxo da stream com outros métodos, sem reduce.
					.mapToDouble(p -> p.getPrice())
					.average()
					.getAsDouble();
					//.map(p -> p.getPrice())
					//.reduce(0.0, (x,y) -> x + y) / list.size();
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			//Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					//.map(p -> p.getName())
					//.sorted(comp.reversed())
					.sorted(Comparator.comparingDouble(Product::getPrice).reversed())
					.map(p -> p.getName())
					// inverter a ordem, pois o map antes produzia uma Stream<String> e o sorted
					// estava manipulando um argumento Product
					.collect(Collectors.toList());
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
