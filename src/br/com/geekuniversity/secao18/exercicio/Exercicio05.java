package br.com.geekuniversity.secao18.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		try {
			Scanner ler = new Scanner(new FileInputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq.txt"));
			Scanner teclado	= new Scanner(System.in);
			System.out.println("Pesquise quantas vezes uma letra aparece no arquivo: ");
			String letra = teclado.nextLine();
			int qtde = 0;
			
			while (ler.hasNextLine()) {
				String linha = ler.nextLine();
				for (int i = 0; i < linha.length(); i++) {
					if (linha.charAt(i) == letra.charAt(0)) {
						qtde++;
					}
				}
			}
			System.out.println("A letra " + letra + " aparece " + qtde + " vezes");
			ler.close();
			teclado.close();
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
		

	}

}
