package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's the file path?");
		String stPath = sc.nextLine();
		// "/home/rogerlevino/Documentos/a220_ex/arquivo.csv"
		File stPathO = new File(stPath);
		String parentPath = stPathO.getParent();
		
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(stPath))) {
			String line = br.readLine();
			while (line != null) {
				String[] products = new String[3];
				products = line.split(",");
				String name = products[0];
				double price = Double.parseDouble(products[1]);
				int quantity = Integer.parseInt(products[2]);
				Product product = new Product(name, price, quantity);
				list.add(product);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		boolean dir = new File(parentPath + File.separator + "out").mkdir();
		File file = new File(parentPath + File.separator + "out" + File.separator + "summary.csv");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			for (Product product : list) {
				bw.write(product.toString());
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
