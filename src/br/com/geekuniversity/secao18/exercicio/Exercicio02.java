package br.com.geekuniversity.secao18.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		try {
			Scanner ler = new Scanner(new FileInputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq.txt"));
			int linhas = 0;
			while (ler.hasNextLine()) {
				ler.nextLine();
				linhas++;
			}
			System.out.println("O arquivo tem " + linhas + " linhas");
			ler.close();
		}catch(FileNotFoundException e) {
			System.out.println("Arqvuio não encontrado!");
		}
		
		
		

	}

}
