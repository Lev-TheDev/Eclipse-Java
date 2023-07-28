import java.util.Scanner;

public class ex05a53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = 1;
		
		for (int i=1; i<=n; i++) {
			fatorial = fatorial * i;
			// não importa a ordem; dessa forma fica crescente, mas multiplicação alternando
			//a ordem dos fatores não altera o produto
			
//		for (int i = n-1; i >= 1; i--) {
//			fatorial = (n * i);
//		}
//		if (fatorial == 0) {
//			fatorial = 1;
//			System.out.println(fatorial);
//		}
//		else {
//			System.out.println(fatorial);
		}
		System.out.println(fatorial);
		sc.close();
	}
}
