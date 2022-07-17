package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz_a[][] = new int[3][3];
		int matriz_b[][] = new int[3][3];
		int matriz_c[][] = new int[3][3];
		
		for (int i = 0; i < matriz_a.length; i++) {
			for (int j = 0; j < matriz_a[i].length; j++) {
				System.out.print("Digite numero da Matriz A: ");
				matriz_a[i][j] = Integer.parseInt(teclado.nextLine());
			}
		}
		
		System.out.println("");
		for (int i = 0; i < matriz_b.length; i++) {
			for (int j = 0; j < matriz_b[i].length; j++) {
				System.out.print("Digite numero da Matriz B: ");
				matriz_b[i][j] = Integer.parseInt(teclado.nextLine());
			}
		}
		
		for (int i = 0; i < matriz_b.length; i++) {
			for (int j = 0; j < matriz_b[i].length; j++) {
				matriz_c[i][j] = matriz_a[i][j] * matriz_b[i][j];
				System.out.print(matriz_c[i][j] + " ");
			}
			System.out.println("");
			
		}
		
		teclado.close();
	}

}
