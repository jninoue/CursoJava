package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int[3];
		int soma = 0;
		
		for(int i=0; i < numeros.length ; i++) {
			System.out.print("Informe numero: ");
			numeros[i] = Integer.parseInt(teclado.nextLine());
		}
		
		for(int i=0; i < numeros.length; i++) {
			soma = soma + numeros[i];
		}
				
		System.out.println("A soma dos numeros é: " + soma );
		teclado.close();
	}
}
