package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String data;
		
		System.out.println("Informe uma data: ");
		data = teclado.nextLine();
		
		DataExtenso.dtExtenso(data);
		
		teclado.close();
	}

}
