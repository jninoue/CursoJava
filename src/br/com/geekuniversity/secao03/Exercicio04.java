package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		double valor = 0.0, valor_quadrado;
		
		
		System.out.println("Digite valor: ");
		valor = teclado.nextDouble();
		
		valor_quadrado = valor * valor;
		System.out.println("O quadrado de " + valor + " é: " + valor_quadrado);
		
		teclado.close();

	}

}
