import java.util.Locale;
import java.util.Scanner;

public class Treinamento {

	public static void main(String[] args) {
		// ctrl + shift + o = importações de bibliotecas .util no automático
		// ctrl + space = completar codigo
		// sysout + ctrl + space = atalho do System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("ÁREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
		
		sc.close();
	}

}
