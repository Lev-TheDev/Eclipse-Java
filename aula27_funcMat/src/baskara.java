
public class baskara {

	public static void main(String[] args) {
		// raíz quadrada, potência e número absoluto (sem sinal)
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C, deltA, xUm, xDois;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raíz quadrada de " + x + " = " + A);
		System.out.println("Raíz quadrada de " + y + " = " + B);
		System.out.println("Raíz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
	
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		A = Math.abs(y);
		B = Math.abs(z);

		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		// fórmula de báskara em código java
		deltA = Math.pow(B,  2.0) - 4*A*C;
		
		xUm = (-B + Math.sqrt(deltA)) / (2.0 * A);
		xDois = (-B - Math.sqrt(deltA)) / (2.0 * A);		
		
	}
}
