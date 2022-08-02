package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa71 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		Comparator<String> comparador = new ComparadorPorTamanho();

		palavras.add("Geek");
		palavras.add("Unisersity");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Outlast 2");

		palavras.sort(comparador);

		// Expressao lambda - forma 1
//		palavras.forEach((String s) ->{
//			System.out.println(s);
//		});

		// Expressao lambda - forma 2
		// somente podera ser feito dessa forma caso tenha apenas 1 parametro e uma
		// linha de execucao.
		palavras.forEach(s -> System.out.println(s));

	}

}
