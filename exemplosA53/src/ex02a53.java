import java.util.Scanner;

public class ex02a53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = 0, inn = 0, out = 0;
		
		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				inn += 1;
			}
			else {
				out += 1;
			}
		}
		System.out.println(inn + " in");
		System.out.println(out + " out");
		sc.close();
	}
}
