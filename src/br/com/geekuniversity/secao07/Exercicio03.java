package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		float num1[] = new float[10];
		float num2[] = new float[10];
		
		for (int i = 0; i < num1.length; i++) {
			System.out.print("Digite o " + (i+1) + "º valor: ");
			num1[i] = Integer.parseInt(teclado.nextLine());
			num2[i] = num1[i] * num1[i];
		}
		
		System.out.println("======= QUADRADO DOS VALORES DIGITADOS ==========");
		
		for (int i = 0; i < num1.length; i++) {
			System.out.println((i+1) + "º valor digitado é: " + num1[i] + ", seu quadrado é: " + num2[i]);
		}
			
		teclado.close();

	}

}
