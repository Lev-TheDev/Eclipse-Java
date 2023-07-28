import java.util.Locale;
import java.util.Scanner;
//ctrl + shift + f = endentação automática

public class NumNeg {

	public static void main(String[] args) {
		//confereNegativo();
		//conferePar();
		//confereMultiplos();
		//confereDuracao();
		//codPedido();
		//confereInt();
		//confereCoord();
		confereLisarb();
		
	}
	
	private static void confereLisarb() {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		double imposto;
		
		if (salario > 4500.00) {
			imposto = (0.08 * 1000.00) + (0.18 * 1500.00) + (0.28 * (salario - 4500.00));
		}
		else if (salario >= 3000.01) {
			imposto = (0.08 * 1000.00) + (0.18 * (salario - 3000.00));
		}
		else if (salario >= 2000.01) {
			imposto = (0.08 * (salario - 2000.00));
		}
		else {
			imposto = 0.00;
		}
		
		if (imposto == 0.00) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

	private static void confereCoord() {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0 && x != 0) {
			System.out.println("Eixo X");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else {
			System.out.println("Q3");
		}
		
		sc.close();
		
	}

	private static void confereInt() {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		String int1 = "Intervalo [0,25]";
		String int2 = "Intervalo [25,50]";
		String int3 = "Intervalo [50,75]";
		String int4 = "Intervalo [75,100]";
		String int5 = "Fora de intervalo";
		
		if (valor < 0 || valor > 100) {
			System.out.println(int5);
		}
		else if (valor <= 25) {
			System.out.println(int1);
		}
		else if (valor <= 50) {
			System.out.println(int2);
		}
		else if (valor <= 75) {
			System.out.println(int3);
		}
		else {
			System.out.println(int4);
		}
		sc.close();
		
	}

	private static void codPedido() {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		
		double valorF;
		
		if (cod == 1) {
			valorF = 4.00 * quant;			
		}
		else if (cod == 2) {
			valorF = 4.50 * quant;
		}
		else if (cod == 3) {
			valorF = 5.00 * quant;
		}
		else if (cod == 4) {
			valorF = 2.00 * quant;
		}
		else {
			valorF = 1.50 * quant;
		}
		
		System.out.printf("Total: R$ %.2f%n", valorF);
		sc.close();
	}

	private static void confereDuracao() {
		Scanner sc = new Scanner(System.in);
		
		int hInicial = sc.nextInt();
		int hFinal = sc.nextInt();
		
		int duracao;
		
		if (hInicial < hFinal) {
			duracao = hFinal - hInicial;
		}
		else {
			duracao = 24 - hInicial + hFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();		
	}

	private static void confereMultiplos() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
		
		sc.close();
	}

	private static void conferePar() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
				
		if (a % 2 == 0) {	
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
		
	}

	private static void confereNegativo() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
				
		if (a < 0) {	
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
		
	}

}
