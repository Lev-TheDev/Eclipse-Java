import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá, mundo!");
		System.out.println("Bom dia!");
		
		int y = 32;
		double x = 10.35784;
		String nome = "Caio";
		int idade = 33;
		double salario = 25000.35;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		// padrão de formatação para delimitar casas decimais em 2 casas
		Locale.setDefault(Locale.US);
		// printf usa formatação da região que está meu PC, português Brasil
		// se eu der o comando Locale, ele transforma a vírgula em ponto
		System.out.printf("%.4f%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario);
		// %f = ponto flutuante / %d = inteiro / %s = string / %n = quebra de linha
		// usado como alternativa à concatenação de elementos substituindo +
		
	}

}
