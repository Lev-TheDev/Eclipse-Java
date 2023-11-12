package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		// ou PrintService<Integer> ps = new PrintService<Integer>(); é opcional
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		String x = ps.first();
		// com type safety e sem necessidade de casting
		System.out.println("First: " + x);
		
		sc.close();
	}
}
