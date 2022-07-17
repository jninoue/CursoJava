package br.com.geekuniversity.secao04;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, soma = 0;
		
		System.out.print("Digite um numero positivo: ");
		num = Integer.parseInt(teclado.nextLine());
		
		if (num > 0 ) {
			for (char letra : Integer.toString(num).toCharArray() ) {
				soma = soma + Character.getNumericValue(letra);
			}
			System.out.println("A soma dos algarismo de " + num + " é: " + soma);
		}else {
			System.out.print("O número digitado não é positivo!");
		}
		
		teclado.close();
		

	}

}
