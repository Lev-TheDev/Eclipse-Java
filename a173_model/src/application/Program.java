package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), frmt1);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), frmt1);
			
			Reservation reservation = new Reservation (number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkInA = LocalDate.parse(sc.next(), frmt1);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate checkOutA = LocalDate.parse(sc.next(), frmt1);
			
			reservation.updateDates(checkInA, checkOutA);
			System.out.println("Reservation: " + reservation);
		}
		//catch (IllegalArgumentException e) {
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		
		sc.close();
	}
}
