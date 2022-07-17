package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota = 10.0, soma = 0;
		int contador = 0;
		
		while (nota >= 10.0 && nota <= 20.9) {
			System.out.println("Digite uma nota entre 10.0 e 20.9: ");
			nota = teclado.nextDouble();
			if (nota >= 10.0 && nota <= 20.9) {
				soma = soma + nota;
				contador = contador + 1;	
			}
			
		}
		
		System.out.println("A média aritmética da nota é: " + (soma/contador));
			
		teclado.close();

	}

}
