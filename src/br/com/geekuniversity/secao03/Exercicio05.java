package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valor, quinta_parte;
		
		System.out.print("Digite um valor: ");
		valor = teclado.nextDouble();
		quinta_parte = valor/5;
		
		System.out.println("A quinta parte de " + valor + " é: " + quinta_parte);
		
		teclado.close();
	}

}
