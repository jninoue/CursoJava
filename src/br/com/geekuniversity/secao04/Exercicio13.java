package br.com.geekuniversity.secao04;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota[] = new double[3];
		
		for (int i =0; i < nota.length; i++) {
			System.out.print("Digite a nota da " + (i+1) + "º prova: ");
			nota[i] = teclado.nextDouble();
		}
		
		Calculos.mediaPonderada(nota); 
		teclado.close();

	}
	

}
