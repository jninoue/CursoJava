package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa66 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("Unisersity");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Outlast 2");
		
		//Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		
//		for(int i = 0; i < palavras.size(); i++) {
//			System.out.println("A palavra " + palavras.get(i) + " tem tamanho " + palavras.get(i).length());
//		}
		
		System.out.println(palavras);
		

	}

}
