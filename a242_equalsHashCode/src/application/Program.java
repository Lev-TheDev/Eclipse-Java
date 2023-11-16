package application;

public class Program {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		// se dois hashCodes diferentes = objetos diferentes
		// se iguais = muito provavelmente são iguais (pode haver colisão)
		// dois objetos iguais = sempre terão hashCodes iguais
	}
}
