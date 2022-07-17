package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0, numero = 0, divisor = 1;
		
		System.out.print("Digite um numero posiivo: ");
		numero = teclado.nextInt();
		
		if ( numero > 0 ) {
			while ( divisor < numero) {
								
				if ( numero%divisor == 0) {
					System.out.println("Divisor de " + numero + ": " + divisor);
					soma = soma + divisor;
				}
				divisor = divisor + 1;
			}
			System.out.println("A soma dos divisores é: " + soma);
		}
		
		teclado.close();

	}

}
