import java.util.Scanner;

public class exScanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("-------------------------");
		
		String a1, a2, a3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine();
		// na sc.nextLine() vai ser armazenado o enter (quebra de linha pendente ou buffer de leitura) após o número digitado no console
		a1 = sc.nextLine();
		a2 = sc.nextLine();
		a3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		sc.close();

	}

}
