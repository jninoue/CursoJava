package br.com.geekuniversity.secao04;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		int opcao = 0, num1, num2;
		
		System.out.println("====== ESCOLHA UMA OPÇÃO =========");
		System.out.println("| 1 - SOMA DE 2 NÚMEROS          |");
		System.out.println("| 2 - DIFERENÇA ENTRE 2 NÚMEROS  |");
		System.out.println("| 3 - PRODUTO ENTRE 2 NÚMEROS    |");
		System.out.println("| 4 - DIVISÃO ENTRE 2 NÚMEROS    |");
		System.out.println("==================================");
		opcao = menu.nextInt();
		
		System.out.print("Digite Primeiro numero: ");
		num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Digite Segundo numero: ");
		num2 = Integer.parseInt(teclado.nextLine());
		
		switch (opcao) {
			case 1:
				System.out.println("A soma de " + num1 + " e " + num2 + " é igual a: " + (num1 + num2));
			break;

			case 2:
				if (num1 > num2) {
					System.out.println("A diferença de " + num1 + " e " + num2 + " é igual a: " + (num1 - num2));
				}else {
					System.out.println("A diferença de " + num2 + " e " + num1 + " é igual a: " + (num2 - num1));
				}
			break;
		
			case 3:
				System.out.println("O produto de " + num1 + " e " + num2 + " é igual a: " + (num1 * num2));
			break;
			
			case 4:
				if(num2 <= 0) {
					System.out.println("O denominador não pode ser zero");
				}else {
					System.out.println("A divisão de " + num1 + " e " + num2 + " é igual a: " + (num1 / num2));
				}
			break;

			default:
			break;
		}
		
		menu.close();
		teclado.close();

	}

}
