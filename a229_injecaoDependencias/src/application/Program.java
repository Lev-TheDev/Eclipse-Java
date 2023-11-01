package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.Paypal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt1);
		System.out.print("Contract price: ");
		double price = sc.nextDouble();
		
		Contract contract = new Contract(number, date, price);
		
		System.out.print("Enter installments number: ");
		Integer installmentsN = sc.nextInt();
		
		ContractService service = new ContractService(installmentsN, new Paypal());
		System.out.println("Installments:");
		service.processContract(contract, installmentsN);
						
		sc.close();		
	}

}
