package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor[] = new int[3];
		int soma = 0;
		
		
		for(int i=0; i < valor.length; i++) {
			System.out.print("Digite um valor: ");
			valor[i] = Integer.parseInt(teclado.nextLine());
			valor[i] = valor[i] * valor[i];
			soma = soma + valor[i];
		}
		
		System.out.println("A soma dps quadrados dos valore lidos é: " + soma);
		teclado.close();
	}
}
