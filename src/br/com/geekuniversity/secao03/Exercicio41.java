package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valor_hora, horas_trabalhadas, salario;
		
		System.out.print("Informe valor hora trabalhada: ");
		valor_hora = teclado.nextDouble();
		
		System.out.print("Informe numero horas trabalhadas: ");
		horas_trabalhadas = teclado.nextDouble();
		
		salario = (valor_hora * horas_trabalhadas) * 1.10;
		System.out.println("O Salario com 10% é " + Math.round(salario*100.0)/100.0);
		teclado.close();
	}
}
