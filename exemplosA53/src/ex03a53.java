import java.util.Locale;
import java.util.Scanner;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

public class ex03a53 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double vetor[] = new double[3];
		double media[] = new double[n];

		//double media = 0;
		
		for (int i=0; i<n; i++) {
			for (int j = 0; j < 3; j++) {
				vetor[j] = sc.nextDouble();
			}
			media[i] = (vetor[0] * 2.0 + vetor[1] * 3.0 + vetor[2] * 5.0) / 10.0;
		}
		for (int k=0; k<n; k++) {
			System.out.printf("%.1f%n", media[k]);
		}
		sc.close();
	}
}