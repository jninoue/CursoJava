package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero para divisão: ");
		int num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Informe o segundo numero para divisão: ");
		int num2 = Integer.parseInt(teclado.nextLine());
		
		try {
			System.out.println("A divisão de + " + num1 + " por " + num2 + " é: " + num1/num2);	
		}catch(ArithmeticException e) {
			System.out.println("Divisão por zero!");
		}
		
		
		teclado.close();
	}

}
