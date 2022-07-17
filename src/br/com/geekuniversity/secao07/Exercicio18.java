package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz[][] = new int[4][5];
		int vetor[] = new int[matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite numero da linha " + (i+1) + " com a coluna " + (j+1) + ": ");
				matriz[i][j] = Integer.parseInt(teclado.nextLine());
			}
			System.out.println("");
		}
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				vetor[i] = vetor[i] + matriz[j][i];
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		teclado.close();

	}

}
