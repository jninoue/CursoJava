package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa45 {

	public static void main(String[] args) {
		
		//ArryList nomes = new ArrayList(); // sem definir o tipo de dado, podemos colocar qualquer tipo.
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Maria");
		
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(14.6);
//		nomes.add('e');

//		System.out.println(nomes.get(0));
//		System.out.println(nomes.get(3));
		
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		for (Object nome : nomes){
			System.out.println(nome);
		}
	}

}
