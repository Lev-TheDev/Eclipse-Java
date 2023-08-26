package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		People[] vect = new People[n];
		int maisVelho = 0;
		String nomeVelho = null;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();

			vect[i] = new People(name, age);
			
			if (vect[i].getAge() > maisVelho) {
				maisVelho = vect[i].getAge();
				nomeVelho = vect[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomeVelho);
		
		sc.close();
		}
}
