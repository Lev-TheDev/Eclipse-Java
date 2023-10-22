package application;

import java.io.File;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// /home/rogerlevino/Documentos/a214_filestest/in.txt
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getAP: " + path.getAbsolutePath());
		
		sc.close();
	}
}
