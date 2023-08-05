package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Program {
	
	static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {
		Client client;
				
		designLine();
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		double funds = initialDeposit();
		
		if (funds == 0.00) {
			client = new Client(name, account);
		}
		else {
			client = new Client(name, account, funds);
		}
		
		designLine();
		System.out.println("Account data:");
		System.out.println(client);
		designLine();
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		client.addFunds(amount);
		System.out.println("Updated account data:");
		System.out.println(client);
		designLine();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		client.removeFunds(withdraw);
		System.out.println("Updated account data:");
		System.out.println(client);
		designLine();
				
		sc.close();
	}
	
	public static String designLine() {
		System.out.println("===================================");
		return null;
	}
	
	public static double initialDeposit() {
		Locale.setDefault(Locale.US);

		System.out.print("Is there an initial deposit (y/n)? ");
		char question = sc.next().charAt(0);
		double deposit = 0.00;
		
		if (question == 'y') {
			System.out.print("Enter initial deposit value: ");
			sc.nextLine();
			deposit = sc.nextDouble();
		}
		return deposit;
	}
}
