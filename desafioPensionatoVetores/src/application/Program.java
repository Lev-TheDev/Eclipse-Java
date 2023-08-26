package application;

import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int nRented = sc.nextInt();
		sc.nextLine();
		
		Rooms[] vect = new Rooms[10];
		
		for (int i = 0; i < nRented; i++) {
			System.out.printf("\nRent #%d:", i+1);
			System.out.print("\nName: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[room] = new Rooms(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
