package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio47 {

	public static void main(String[] args) {
		
		for (char letra : pegarNumero().toCharArray()) {
			System.out.println(letra);
		}
	}
	
	public static String pegarNumero() {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		
		while (numero < 1000 || numero > 9999) {
			System.out.print("Digite um numero entre 1000 e 9999: ");
			numero = Integer.parseInt(teclado.nextLine());
			
			if (numero < 1000 || numero > 9999) {
				System.out.println("Valor inválido");
			}
		}
		teclado.close();
		return Integer.toString(numero);
		
	}

}
