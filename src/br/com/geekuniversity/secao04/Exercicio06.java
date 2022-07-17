package br.com.geekuniversity.secao04;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite primeiro numero: ");
		num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Digite segundo numero: ");
		num2 = Integer.parseInt(teclado.nextLine());
		
		if (num1 >= num2) {
			System.out.println("Os números são iguais");
		}else if (num1 > num2) {
			System.out.println("O maior número é :" + num1 + " e sua difereça é: " + 
								(num1 - num2));
		}else {
			System.out.println("O maior número é " + num2 + " e sua diferença é: " + 
								(num2 - num1));
		}
		
		teclado.close();

	}

}
