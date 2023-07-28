import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//chamaEx01();
		//chamaEx02();
		//chamaEx03();
		//chamaEx04();
		//chamaEx05();
		chamaEx06();
		
	}

	private static void chamaEx06() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A_tri, A_cir, pi = 3.14159, A_trap, A_quad, A_ret;
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		A_tri = A * C / 2;
		A_cir = pi * (Math.pow(C, 2));
		A_trap = (A + B) / 2 * C;
		A_quad = Math.pow(B, 2);
		A_ret = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f%n", A_tri);
		System.out.printf("CÍRCULO: %.3f%n", A_cir);
		System.out.printf("TRAPÉZIO: %.3f%n", A_trap);
		System.out.printf("QUADRADO: %.3f%n", A_quad);
		System.out.printf("RETÂNGULO: %.3f%n", A_ret);
		
		sc.close();		
	}

	private static void chamaEx05() {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod, quant, cod2, quant2;
		double v_uni1, v_uni2, total1, total2, totalf;
		
		cod = sc.nextInt();
		quant = sc.nextInt();
		v_uni1 = sc.nextDouble();
		
		total1 = v_uni1 * quant;
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		v_uni2 = sc.nextDouble();
		
		total2 = v_uni2 * quant2;
		
		totalf = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalf);
		
		sc.close();		
	}

	private static void chamaEx04() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hrT;
		num = sc.nextInt();
		hrT = sc.nextInt();
		
		double rsHr, sal;
		rsHr = sc.nextDouble();
		
		sal = hrT * rsHr;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", sal);
		
		sc.close();				
	}

	private static void chamaEx03() {
		int A, B, C, D, diferenca;
		
		Scanner sc = new Scanner (System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + diferenca);
		
		sc.close();		
	}

	private static void chamaEx02() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
				
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		double area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();		
	}

	private static void chamaEx01() {
		Scanner sc = new Scanner (System.in);
		
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		
		int soma = v1 + v2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();		
	}
	
	

}
