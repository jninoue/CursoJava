package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.print("Digite a temperatura em ºC: ");
		celsius = teclado.nextDouble();
		
		fahrenheit = celsius*(9.0/5.0)+32.0;
		System.out.println("A conversão de " + celsius + "ºC em fahrenheit é: " + fahrenheit);		
		
		teclado.close();;
	}
}
