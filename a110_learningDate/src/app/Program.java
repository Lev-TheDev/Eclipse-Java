package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		//DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		System.out.println("------------");
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		System.out.println("------------");

		Instant d03 = Instant.now();
		System.out.println(d03);
		System.out.println("------------");

		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04);		
		System.out.println("------------");

		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(d05);	
		System.out.println("------------");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println(d06);
		System.out.println("------------");

		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println(d07);
		System.out.println("------------");

		LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(d08);		
		System.out.println("------------");
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println(d09);		
		System.out.println("------------");
		
		LocalDate d10 = LocalDate.of(2022, 7, 25);
		System.out.println(d10);
		System.out.println("------------");

		LocalDateTime d11 = LocalDateTime.of(2023, 8, 16, 20, 27);
		System.out.println(d11);
		System.out.println("------------");



		
	}

}
