package br.com.geekuniversity.secao18.exercicio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Contatos {
	private static String nome, telefone, aniversário;
			
	
	public static void inserir_contato() {
		try {
			Scanner teclado = new Scanner(System.in);
			PrintStream contato = new PrintStream(new FileOutputStream("C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\contatos.txt", true));
			
			
			System.out.println("======= Cadastro de Contatos =======");
			System.out.print("Nome.......: ");
			nome = teclado.nextLine() + ";";
			
			System.out.print("Telefone...: ");
			telefone = teclado.nextLine() + ";";
			
			System.out.print("Aniversario: ");
			aniversário = teclado.nextLine() + ";";
			
			contato.println(nome + telefone + aniversário);
			contato.close();
			teclado.close();
		}catch(FileNotFoundException e) {
			System.out.println("Não foi possível criar o arquivo contatos.txt!");
		}
	}
}
