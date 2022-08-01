package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		
		System.out.println(palavras);
		
		palavras.add("Geek");
		palavras.add("Unisersity");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Outlast 2");
		
		System.out.println(palavras);
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

	}

}
