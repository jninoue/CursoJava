package br.com.geekuniversity.secao18.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome_entrada, nome_saida;
		
		System.out.println("Sistema que lista a cidade mais populosa do arquivo!");
		System.out.println("Nome do arquivo de entrada: ");
		nome_entrada = teclado.nextLine();
		
		System.out.println("Nome do arquivo de saida: ");
		nome_saida = teclado.nextLine();
		
		try {
			Scanner arq_entrada = new Scanner(new FileInputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\" + nome_entrada + ".txt"));
			PrintStream arq_saida = new PrintStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\" + nome_saida + ".txt"); 
			int habitante = 0;
			String texto = null, cidade_populosa = null;
			
			while (arq_entrada.hasNextLine()) {
				texto = arq_entrada.nextLine();

				if (Integer.parseInt(texto.substring(40, texto.length())) > habitante) {
					
					habitante = Integer.parseInt(texto.substring(40, texto.length()));
					cidade_populosa = texto;
				}
				
			}
			
			arq_saida.println(cidade_populosa);
			arq_entrada.close();
			arq_saida.close();
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
		teclado.close();

	}

}
