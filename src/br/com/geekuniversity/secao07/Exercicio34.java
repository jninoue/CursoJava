package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1[] = new int[10];
		boolean unico;
		
		for (int i = 0; i < num1.length; i++) {
			unico = true;
			while (unico) {
				System.out.print("Digite o " + (i+1) + " número: ");
				num1[i] = Integer.parseInt(teclado.nextLine());
				
				if (i == 0) {
					unico = false;	
				}else {
					for (int j = 0; j < i; j++ ) {
						if (num1[j] == num1[i]) {
							System.out.println("Número já digitado");
							j = i; 
							unico = true;
						}else {
							unico = false;
						}
					}
				}
				
			}
				
		}
		
		for (int  i = 0; i < num1.length; i++) {
			System.out.println("Numero digitados: " + num1[i]);
		}
		
		teclado.close();

	}

}
