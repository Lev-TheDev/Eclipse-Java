package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "/home/rogerlevino/Documentos/a234/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list);
			// forma padrão de ordenar uma coleção
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
