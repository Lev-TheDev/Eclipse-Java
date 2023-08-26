package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		
		double maiorV = 0.00;
		int position = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			if (vect[i] > maiorV) {
				maiorV = vect[i];
				position = i;
			}
		}
		
		System.out.println("");
		System.out.printf("MAIOR VALOR = %.1f%n", maiorV);
		System.out.println("POSICAO DO MAIOR VALOR = " + position);
		
		sc.close();
	}

}
