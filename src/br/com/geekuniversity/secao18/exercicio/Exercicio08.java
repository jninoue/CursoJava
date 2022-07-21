package br.com.geekuniversity.secao18.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Sistema que le o arquivo arq.txt e transforma o texto em MAIUSCULO!");
		System.out.println("Informe o nome do arquivo a ser criado: ");
		String nome_arq = teclado.nextLine();
		
		try {
			Scanner arq_entrada = new Scanner(new FileInputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq.txt"));
			PrintStream arq_saida = new PrintStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\" + nome_arq + ".txt"); 
			while (arq_entrada.hasNextLine()) {
				arq_saida.println(arq_entrada.nextLine().toUpperCase());
			}
			arq_entrada.close();
			arq_saida.close();
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
		
		
		teclado.close();

	}

}
