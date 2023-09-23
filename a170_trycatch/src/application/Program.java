package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		// se colocar letra em position ou número a mais do que tamanho do vetor, dá uma exception.
		System.out.println("End of program!");
		
		// para o programa não encerrar no erro (exception), utilizamos o try-catch
		*/
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		// no catch vai o erro que quero identificar e um apelido ("e")
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("End of program!");

		sc.close();
	}
}
