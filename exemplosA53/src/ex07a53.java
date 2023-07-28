import java.util.Scanner;

public class ex07a53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int j = 1; j <= n; j++) {
			System.out.print(j + " ");
			System.out.print(j*j + " ");
			System.out.println(j*j*j);				
		}
		sc.close();
	}
}
