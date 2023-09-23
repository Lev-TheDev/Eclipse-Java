package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.LegalEntity;
import entities.Taxpayers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayers> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			Character ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			Double annualIncome = sc.nextDouble();
			if (Character.toUpperCase(ch) == 'I') {
				System.out.print("Health expenditures: ");
				Double healthExpenses = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenses));
			}
			else {
				System.out.print("Number of employees: ");
				Integer employeesNumber = sc.nextInt();
				list.add(new LegalEntity(name, annualIncome, employeesNumber));
			}
		}

		System.out.println("\nTAXES PAID:");
		double sum = 0.00;
		for (Taxpayers tx : list) {
			System.out.println(tx.getName() + ": $ " + String.format("%.2f", tx.totalTaxes()));
			sum += tx.totalTaxes();
		}
		System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
