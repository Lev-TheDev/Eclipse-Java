package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// new FileWriter(path) = cria/recria o arquivo
		// new FileWriter(path, true) = acrescenta ao arquivo existente
		
		String[] lines = new String[] { "Good morning!", "Good afternoon!", "Good night!"};
		
		String path = "/home/rogerlevino/Documentos/a214_filestest/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				// por padrão o write não tem quebra de linha, pra isso usamos bw.newLine()
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
