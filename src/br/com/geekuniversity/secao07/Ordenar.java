package br.com.geekuniversity.secao07;

import java.util.ArrayList;

public class Ordenar {
	
	static public void ordenar( int[] num) {
		ArrayList<Integer> numero = new ArrayList<Integer>();

		
		for (int i = 0; i < num.length; i++) {
			numero.add(num[i]);
		}
		
		numero.sort(null);
		
		System.out.println("====== NUMEROS EM ORDEM CRESCENTE =====");
		for (int i = 0; i < numero.size(); i++) {
			System.out.println(numero.get(i));
		}
	}
}
