package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("d04 string = " + d04);
		System.out.println("d04 formated = " + d04.format(fmt1));
		System.out.println("d04 formated 2 = " + fmt1.format(d04));
		System.out.println("------------");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("d05 formated = " + d05.format(fmt1));
		System.out.println("d05 formated = " + d05.format(fmt2));
		System.out.println("------------");

		// instant não tem .format, porque ele precisa considerar fuso
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("d06 formated = " + fmt3.format(d06));
		// com uma hora Instant, só dá para formatar com esse modelo "fmt3.format(d06)"
		// se tentar formatar com um DateTimeFormatter que não tem fuso dá erro (p.ex. fmt2)
		System.out.println("------------");
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("d05 formated = " + d05.format(fmt4));
		System.out.println("------------");
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("d06 formated = " + fmt5.format(d06));


		
	}

}
