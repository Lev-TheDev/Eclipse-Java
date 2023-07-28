import java.util.Scanner;

public class ex03a48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		int cont_a = 0, cont_g = 0, cont_d = 0;
		
		while (combustivel != 4) {
			if (combustivel == 1) {
				cont_a += 1;
				combustivel = sc.nextInt();
			}
			else if (combustivel == 2) {
				cont_g += 1;
				combustivel = sc.nextInt();
			}
			else if (combustivel == 3) {
				cont_d += 1;
				combustivel = sc.nextInt();
			}
			else {
				combustivel = sc.nextInt();
			}			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + cont_a);				
		System.out.println("Gasolina: " + cont_g);				
		System.out.println("Diesel: " + cont_d);				
		sc.close();
	}
}
