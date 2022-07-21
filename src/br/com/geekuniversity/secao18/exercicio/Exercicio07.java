package br.com.geekuniversity.secao18.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		try {
			Scanner arq_entrada = new Scanner(new FileInputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq.txt"));
			PrintStream arq_saida = new PrintStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq_saida.txt");
			String texto;
			
			while (arq_entrada.hasNextLine()) {
				texto = arq_entrada.nextLine();
				arq_saida.println(texto.replaceAll("[AEIOUaeiou]", "*"));
			}
			arq_entrada.close();
			arq_saida.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
		

	}

}
