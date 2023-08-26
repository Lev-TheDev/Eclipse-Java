package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		//arranjo bidimensional com dois colchetes
		// [n][n] por ser n linhas e n colunas no enunciado
		int[][] mat = new int[n][n];
		
		
		// mat.length é o tamanho das linhas
		// mat[i].length é o tamanho das colunas
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}
}
