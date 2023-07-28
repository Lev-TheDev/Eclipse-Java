import java.util.Scanner;

public class ex01a48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		
		int tentativa = sc.nextInt();
		
		while (tentativa != senha) {
			System.out.println("Senha inválida.");
			tentativa = sc.nextInt();
		}
		System.out.println("Acesso permitido.");
		sc.close();
	}
}