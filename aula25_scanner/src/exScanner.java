import java.util.Scanner;

public class exScanner {

	public static void main(String[] args) {
		// criar objeto scanner
		// Scanner sc = new Scanner(System.in);
		// chamar biblioteca = import java.util.Scanner;
		// fechar a função scanner com sc.close() ao final
		// sc.next() = usado para String
		// sc.nextInt() = usado para variável inteira
		// sc.nextDouble() = considera a localidade para vírgula ou ponto
		// sc.next().charAt(0) = para ler um char
		
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		System.out.printf("Você digitou: %.2f\n", z);
		//println considera localidade internacional
		// printf considera a localidade do meu PC

		char w;
		w = sc.next().charAt(0);
		System.out.println("Você digitou: " + w);
		
		
		//ler mais de uma variável em uma linha
		String i;
		int o;
		double p;
		i = sc.next();
		o = sc.nextInt();
		p = sc.nextDouble();
		System.out.printf("Você digitou: %s %d %.1f", i, o, p);
		
		sc.close();
	}
}
