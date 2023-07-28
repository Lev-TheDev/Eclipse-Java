import java.util.Locale;
import java.util.Scanner;

public class ex04a53 {

	//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
	//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double vetor[] = new double[2];
		double div[] = new double[n];

		//double media = 0;
		
		for (int i=0; i<n; i++) {
			for (int j = 0; j < 2; j++) {
				vetor[j] = sc.nextDouble();
			}
				div[i] = vetor[0] / vetor[1];
		}
		for (int k=0; k<n; k++) {
			if (div[k] == -1/0.0) {
				System.out.println("Divisão impossível!");
			}
			else {
				System.out.printf("%.1f%n", div[k]);
			}
		}
		sc.close();
	}
}
