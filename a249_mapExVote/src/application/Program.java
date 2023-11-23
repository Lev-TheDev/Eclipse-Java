package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		// /home/rogerlevino/Documentos/a249/input.txt
		String path = sc.nextLine();
		
		try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
			Map<String, Integer> map = new HashMap<>();
			String line = buff.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String candidate = fields[0];
				Integer votes = Integer.parseInt(fields[1]);

				if (map.containsKey(candidate)) {
					map.put(candidate, map.get(candidate) + votes);
				} else {
					map.put(candidate, votes);
				}
				
				line = buff.readLine();
			}
			for (String candidate : map.keySet()) {
				System.out.println(candidate + ": " + map.get(candidate));
			}
		}
		catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
		sc.close();
	}
}
