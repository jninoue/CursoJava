package br.com.geekuniversity.secao04;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int semana;
		
		System.out.println("Digite o dia da semana (1-7): ");
		semana = teclado.nextInt();
		
		switch (semana) {
			case 1:
				System.out.println("Segunda-feira");
			break;
			
			case 2:
				System.out.println("Terça-feira");
			break;
			
			case 3:
				System.out.println("Quarta-feira");
			break;
			
			case 4:
				System.out.println("Quinta-feira");
			break;
			
			case 5:
				System.out.println("Sexta-feira");
			break;
			
			case 6:
				System.out.println("Sábado");
			break;
			
			case 7:
				System.out.println("Domingo");
			break;
			
			default:
				System.out.println("Dia da semana inválido!");
			break;
			}
		
		teclado.close();

	}

}
