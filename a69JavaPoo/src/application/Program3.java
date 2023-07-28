package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		stu.name = sc.nextLine();
		stu.n1 = sc.nextDouble();
		stu.n2 = sc.nextDouble();
		stu.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", stu.fgrade());
		System.out.println(stu.finalSituation());
		
		if (stu.finalSituation() == "FAILED") {
			System.out.printf("MISSING %.2f POINTS", stu.missingPoints());
		}
		
		sc.close();
	}
}
