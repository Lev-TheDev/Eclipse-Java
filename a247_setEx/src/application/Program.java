package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogUser;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int nA = sc.nextInt();
		sc.nextLine();
		
		Set<LogUser> set = new HashSet<>();
		
		for (int i = 0; i < nA; i++) {
			int userCode = sc.nextInt();
			set.add(new LogUser(userCode));
		}
		
		System.out.print("How many students for course B? ");
		int nB = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < nB; i++) {
			int userCode = sc.nextInt();
			set.add(new LogUser(userCode));
		}
		
		System.out.print("How many students for course C? ");
		int nC = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < nC; i++) {
			int userCode = sc.nextInt();
			set.add(new LogUser(userCode));
		}
		
		System.out.println("Total students: " + set.size());
		/*
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());
		*/
		
		sc.close();
	}
}
