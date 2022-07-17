package br.com.geekuniversity.secao07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numero = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++ ) {
			System.out.print("Digite o " + (i+1) + " número: ");
			numero.add(Integer.parseInt(teclado.nextLine()));
		}
		
		numero.sort(null);
		
		System.out.println("====== NUMEROS EM ORDEM CRESCENTE =====");
		for (int i = 0; i < numero.size(); i++) {
			System.out.println(numero.get(i));
		}
		teclado.close();

	}

}