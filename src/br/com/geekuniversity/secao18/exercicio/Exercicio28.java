package br.com.geekuniversity.secao18.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio28 {
	static String path = "C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\";
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe nome arquivo de entrada: ");
		String arq_entrada = teclado.nextLine();
		
		System.out.print("Informe nome arquivo de saida: ");
		String arq_saida = teclado.nextLine();
		List<String> linhas = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path + arq_entrada))) {
			String linha = br.readLine();
			while ( linha != null) {
				linhas.add(linha);
				linha = br.readLine();
			}
			
			try (PrintStream arq = new PrintStream(path + arq_saida)) {
				
				for (int i = linhas.size(); i > 0; i--) {
					linha = linhas.get(i-1); 
					for (int j = linha.length(); j > 0; j--) {
						arq.print(linha.charAt(j - 1));
					}
					arq.print("\n");
				}
			
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		teclado.close();

	}

}
