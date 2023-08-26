package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Person[] vect = new Person[n];
		
		double somaH = 0.00;
		int somaMenores = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Person(name, age, height);
			somaH += vect[i].getHeight();
			if (vect[i].getAge() < 16) {
				somaMenores += 1;
			}
		}
		
		double mediaH = somaH / vect.length;
		System.out.println("");
		System.out.printf("Altura média: %.2f", mediaH);
		double percent = (somaMenores * 100) / n;
		System.out.println("\nPessoas com menos de 16 anos: " + percent + "%");
		for (int i = 0; i < n; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
