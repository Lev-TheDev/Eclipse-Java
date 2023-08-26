package application;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Quantas pessoas serao digitadas? ");
	    int n = sc.nextInt();

	    double[] alturas = new double[n];
	    char[] generos = new char[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Altura da %da pessoa: ", i + 1);
	        alturas[i] = sc.nextDouble();
	        System.out.printf("Genero da %da pessoa: ", i + 1);
	        generos[i] = sc.next().charAt(0);
	    }

	    double menorAltura = alturas[0];
	    double maiorAltura = alturas[0];

	    for (int i=1; i<n; i++) {
	        if (alturas[i] > maiorAltura) {
	        	maiorAltura = alturas[i];
	        }
	        if (alturas[i] < menorAltura) {
	        	menorAltura = alturas[i];
	        }
	    }

		int qtdhomens = 0;
		int qtdmulheres = 0;
		double alturaFemTotal = 0;
		
	    for (int i=0; i<n; i++) {
	        if (Character.toUpperCase(generos[i]) =='M') {
	            qtdhomens++;
	        }
	        else {
	            qtdmulheres++;
	            alturaFemTotal += alturas[i];
	        }
	    }

	    double alturaFemMedia = alturaFemTotal / qtdmulheres;

	    System.out.printf("Menor altura = %.2f%n", menorAltura);
	    System.out.printf("Maior altura = %.2f%n", maiorAltura);
	    System.out.printf("Media das alturas das mulheres = %.2f%n", alturaFemMedia);
	    System.out.printf("Numero de homens = %d%n", qtdhomens);

		sc.close();
	}
}