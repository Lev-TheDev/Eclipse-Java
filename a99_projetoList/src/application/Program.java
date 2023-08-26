package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Employee[] vect = new Employee[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			vect[i] = new Employee(id, name, salary);
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int findId = sc.nextInt();
		sc.nextLine();
		
		boolean isRegistered = false;
		for (int i = 0; i < n; i++) {
			if (vect[i].getId() == findId) {
				isRegistered = true;
				System.out.print("Enter the percentage: ");
				double x = sc.nextDouble();
				vect[i].increaseSalary(x);
				System.out.println();
				System.out.println("List of employees:");
				for (int j = 0; j < vect.length; j++) {
					System.out.println(vect[j]);
				}
				break;
			}
			else {
				isRegistered = false;
			}
		}
		
		if (isRegistered == false) {
			System.out.println("This id does not exist!");
			System.out.println();
			System.out.println("List of employees:");
			for (int i = 0; i < vect.length; i++) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
