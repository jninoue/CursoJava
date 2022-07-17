package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio73 {
	static String habitante[][] = new String[5][4];
	
	public static void main(String[] args) {
				
		cadastrar_habitante();
		idade_media();
		
		System.out.println("Maior idade entre os habitantes é: " + maior_idade());
		
		if (feminino() > 0) {
			System.out.println("Quantidade de pessoas feminina entre 18 e 35 anos com olhos azuis e cabelos louros: " + feminino());
		}else {
			System.out.println("Não existe habitante feminino entre 18 e 35 anos de olhos azuis com cabelos louros!");
		}
	}
	
	static void cadastrar_habitante() {
		Scanner teclado = new Scanner(System.in);
		//String habitante[][] = new String[5][4];
		boolean verdadeiro = true;
		
		for (int i = 0; i < habitante.length; i++) {
			
			// Cadastro do sexo
			System.out.print("Digite Sexo do " + (i+1) + "º habitante: ");
			habitante[i][0] = teclado.nextLine().toUpperCase();
				
			// Cadastro de cor dos olhos
			verdadeiro = true;
			while (verdadeiro) {
				System.out.print("Digite a cor dos olhos (A-Azul ou C-Castanho do " + (i+1) + "º habitante: ");
				habitante[i][1] = teclado.nextLine().toUpperCase();
					
				if (habitante[i][1].equals("A") || habitante[i][1].equals("C")) {
					verdadeiro = false;
				}else {
					System.out.println("Opções válidas A-Azul ou C-Castanho");
					verdadeiro = true;
				}
			
			}
			
			
			// Cadastro de cor dos cabelos
			verdadeiro = true;
			while (verdadeiro) {
				System.out.print("Digite a cor dos cabelos (L-Louros ou P-Pretos ou C-Castanho do " 
									+ (i+1) + "º habitante: ");
				habitante[i][2] = teclado.nextLine().toUpperCase();
					
				if (habitante[i][2].equals("L") || habitante[i][2].equals("P") || habitante[i][2].equals("C")) {
					verdadeiro = false;
				}else{
					System.out.println("Opções válidas L-Louros ou P-Pretos ou C-Castanho");
					verdadeiro = true;
				}
			}
			
			//Cadastro da idade
			System.out.print("Digite Idade do " + (i+1) + "º habitante: ");
			habitante[i][3] = teclado.nextLine();

		}
		teclado.close();
	}

	static void idade_media () {
		int soma = 0, contador = 0;
		
		for (int i = 0; i < habitante.length; i++) {
			if (habitante[i][1].equals("C") && habitante[i][2].equals("P")) {
				contador = contador + 1;
				soma = soma + Integer.parseInt(habitante[i][3]);
			}
		}
		
		if (contador > 0) {
			System.out.println("Média de idade de olhos castanhos e cabelos pretos é: " + (soma/contador));	
		}else {
			System.out.println("Não tem habitante com olhos castanhos e cabelos pretos!");
		}
		
	}
	
	static int maior_idade () {
		int maior = 0;
		for (int i = 0; i < habitante.length; i++) {
			if (Integer.parseInt(habitante[i][3]) > maior) {
				maior = Integer.parseInt(habitante[i][3]);
			}
		}
		return maior;
	}
	
	static int feminino () {
		int contador = 0;
		
		for (int i = 0; i < habitante.length; i++) {
			if (habitante[i][0].equals("FEMININO") && 
			   (Integer.parseInt(habitante[i][3]) >= 18 && Integer.parseInt(habitante[i][3]) <= 35) &&
			    habitante[i][1].equals("A") && habitante[i][2].equals("L")) {
				contador  = contador + 1;
			}
		}
		
		return contador;
	}
}
