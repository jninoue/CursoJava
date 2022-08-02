package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa74 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Geek");
		palavras.add("Unisersity");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Outlast 2");
		
//		Function<String, Integer> tamanho = new Function<String, Integer>(){
//
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//		};
//		
//		Comparator<String> comparador = Comparator.comparing(tamanho);

		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//methid reference
		palavras.sort(Comparator.comparing(String::length));
		//System.out.println(palavras);
		palavras.forEach(System.out::println); // method references
	}

}
