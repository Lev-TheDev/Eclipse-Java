package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------");
		// 1 tipo dos elementos do vetor
		// 2 apelido para cada elemento do vetor
		// 3 nome da coleção
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
