package br.com.geekuniversity.secao18.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		try {
			Scanner ler = new Scanner(new FileInputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq.txt"));
			
			String linha;
			int vogais = 0, consoantes = 0;
			
			while (ler.hasNextLine()) {
				linha = ler.nextLine();
				
				for (int i = 0; i < linha.length(); i++) {
					if (linha.charAt(i) == 'a' ||
						linha.charAt(i) == 'e' ||
						linha.charAt(i) == 'i' ||
						linha.charAt(i) == 'o' ||
						linha.charAt(i) == 'u' ) {
						
						vogais++;
					}else {
						consoantes++;
					}
				}
			}
			
			System.out.println("A quantidade de vogais no arquivo é de: " + vogais);
			System.out.println("A quantidade de consoantes no arquivo é de: " + consoantes);
			ler.close();	
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrador!");
		}
		

	}

}
