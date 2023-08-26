package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.Employee2;

public class Program2 {

	public static void main(String[] args) {
		//Program2 = utilizando list - referência Employee2
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee2> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			// -----validação de Id-----
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee2 emp = new Employee2(id, name, salary);
			list.add(emp);
			//lista.add(new Employee2(id, name, salary)); versão resumida!
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int findId = sc.nextInt();
		sc.nextLine();
		
		/*
		-----proposta com função lambda-----
		Employee2 emp = list.stream().filter(x -> x.getId() == findId).findFirst().orElse(null);
		if (emp == null) {
		
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}*/
		
		// -----proposta sem lambda-----
		Integer pos = position(list, findId);
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee2 element : list) {
			System.out.println(element);
		}
		
		sc.close();
		
	}
	//-----validação de Id-----
	public static boolean hasId(List<Employee2> list, int id) {
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	public static Integer position(List<Employee2> listaNesseEscopo, int findId) {
		for (int i = 0; i < listaNesseEscopo.size(); i++) {
			if (listaNesseEscopo.get(i).getId() == findId) {
				return i;
			}
		}
		return null;
	}
}
