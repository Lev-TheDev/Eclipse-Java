package application;

import devices.ComboDevice;
import devices.Printer;
import devices.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		Scanner s = new Scanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2099");
		c.processDoc("My dissertation.");
		c.print("My dissertation.");
		System.out.println("Scan result: " + c.scan());
	}

}
