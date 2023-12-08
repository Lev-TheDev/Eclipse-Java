package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file full path: ");
		// /home/rogerlevino/Documentos/a262/in.txt
		String path = sc.nextLine();
		
		System.out.print("Enter the salary to filter: ");
		Double salaryCap = sc.nextDouble();
		
		List<Employee> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			List<Employee> emails = list.stream()
					.filter(e -> e.getSalary() >= salaryCap)
					.sorted(Comparator.comparing(Employee::getEmail))
					.collect(Collectors.toList());

			System.out.println("E-mail of people whose salary is more than " + salaryCap + ":");
			emails.forEach(System.out::println);
			
			double mSalary = list.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.mapToDouble(e -> e.getSalary())
					.sum();
					
			System.out.print("Sum of salary of people whose name starts with 'M': " + mSalary);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
