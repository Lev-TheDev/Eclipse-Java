package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

	public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amountBought());

		// caso a operação a ser realizada na programação seja static (estática)
		// eu posso chamar a função a ser usada direto da classe
		// e quando não for static eu tenho que instanciar
	}

}
