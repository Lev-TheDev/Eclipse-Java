
public class SeqFibonacci {

	public static void main(String[] args) {
		int C, T1, T2, T3;
		
		T1 = 0;
		System.out.println(T1);
		T2 = 1;
		System.out.println(T2);
		
		for (C = 1; C <= 13; C++) {
			T3 = T1 + T2;
			System.out.println(T3);
			T1 = T2;
			T2 = T3;
		}
	}
}