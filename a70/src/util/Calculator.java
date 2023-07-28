package util;

public class Calculator {
	
	public final double PI = 3.14159;
	// colocar final para virar uma CONSTANTE, não variável
	// a constante deve ser colocada em MAIÚSCULA, se duas palavras com _ (underline)

	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
