package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		double soma = 0.00;
		double media = 0.00;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("");
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.print(vect[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		media = soma / vect.length;
		
		System.out.println("\nSOMA = " + soma);
		System.out.println("MEDIA = " + media);
				
		sc.close();
	}

}
