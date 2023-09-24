package model.entities;

//import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	private static DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	//public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
	//	this.roomNumber = roomNumber;
	//	this.checkIn = checkIn;
	//	this.checkOut = checkOut;
	//}
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
		if (!checkOut.isAfter(checkIn)) {
			//throw new IllegalArgumentException("Check-out date must be after check-in date.");
			throw new DomainException("Check-out date must be after check-in date.");
		}		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkIn.until(checkOut, ChronoUnit.DAYS);
		return diff;
		//Duration d1 = Duration.between(checkIn.atTime(0, 0), checkOut.atTime(0, 0));
		//Duration d = Duration.between(checkIn, checkOut); 
		//return d.toDays();
	}
	
	public void updateDates(LocalDate checkInA, LocalDate checkOutA) throws DomainException {
		if (checkInA.isBefore(checkIn)) {
			//throw new IllegalArgumentException("Reservation dates for update must be future dates.");
			throw new DomainException("Reservation dates for update must be future dates.");
		}
		if (!checkOutA.isAfter(checkInA)) {
			//throw new IllegalArgumentException("Check-out date must be after check-in date.");
			throw new DomainException("Check-out date must be after check-in date.");
		}
		this.checkIn = checkInA;
		this.checkOut = checkOutA;
	}

	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ frmt1.format(checkIn)
				+ ", check-out: "
				+ frmt1.format(checkOut)
				+ ", "
				+ duration()
				+ " nights.";
	}
	
}
