package br.com.geekuniversity.secao18.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			String letra = " ";
			
			PrintStream arquivo = new PrintStream(new FileOutputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq.txt", true));
			System.out.println("Digite qualquer texto, o programa ira parar ao digitar 0");
			while (!letra.matches("0")) {
				letra = teclado.nextLine();
				arquivo.println(letra);
			}
			arquivo.close();
		}catch (FileNotFoundException e) {
			System.out.println("Não foi possivel abrir ou criar o arquivo!");
		}
		teclado.close();
		
		try {
			Scanner ler = new Scanner(new FileInputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\arq.txt"));
			
			while (ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}
			
			ler.close();
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}

	}

}
