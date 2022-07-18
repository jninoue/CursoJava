package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe o n1 " );
		int n1 = teclado.nextInt();
		
		System.out.println("informe o n2 " );
		int n2 = teclado.nextInt();
		
		try {
			System.out.println(divisao(n1,n2));	
		}catch(ArithmeticException e) {
			System.out.println("Não foi possivel executar a divisão!");			
		}catch(Exception e) {
			System.out.println("ocorreu outra exceção!");
		}
		
		teclado.close();

	}
	
	public static int divisao(int n1, int n2) throws Exception{
		return n1/n2;
	}

}
