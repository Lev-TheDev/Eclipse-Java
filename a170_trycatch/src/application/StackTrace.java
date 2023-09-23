package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {

	public static void main(String[] args) {
		method1();
		
		System.out.println("End of program!");

	}

	public static void method1() {
		System.out.println("------------- method1 starts -------------");
		method2();
		System.out.println("------------- method1 ends -------------");
		
	}

	
	public static void method2() {
		System.out.println("------------- method2 starts -------------");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			// mostra toda a chamada de métodos que acarretou na exceção
			sc.next();
		}
		// no catch vai o erro que quero identificar e um apelido ("e")
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		sc.close();
		System.out.println("------------- method2 ends -------------");
	}

}
// shift + tab (selecionando as linhas) = identação
