package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota[] = new double[4], soma = 0;

		
		for(int i=0; i<nota.length; i++) {
			System.out.print("Digite a nota: ");
			nota[i] = teclado.nextDouble();
			soma = soma + nota[i];
		}
		
		System.out.println("A média é: " + soma/4);
		teclado.close();
	}

}
