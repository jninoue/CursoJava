package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa42 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			PrintStream escrever = new PrintStream("saida.txt");
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Escreva algo: ");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			
			escrever.close();
		}catch(FileNotFoundException e) {
			System.out.println("Não foi possível criar o arquivo!");
		}
						
		teclado.close();
	}

}
