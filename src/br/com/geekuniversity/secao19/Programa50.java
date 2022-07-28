package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(51, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
				
		//COLEÇÃO DE CHAVES
		System.out.println("Chaves....: " + pessoas.keySet());
		
		//COLEÇÃO DE VALORES
		System.out.println("Valores...: " + pessoas.values());
		
		//COLEÇÃO DE ASSOCIAÇÕES
		System.out.println("Associação: " + pessoas.entrySet());
		
		System.out.println("");
		
		
		//Iterar na coleção de chaves
		
		//Forma 1
		// for each a partir do java 8
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		
		//Forma 2
		System.out.println("");
		Set<Integer> chaves = pessoas.keySet();
		for (Integer idade: chaves) {
			System.out.println(pessoas.get(idade));
		}
		
		//Iterar na coleção de Valores
		//Forma 1
		System.out.println("");
		Collection<String> valores = pessoas.values();
		for (String nome: valores) {
			System.out.println(nome);
			
		}
		
		//Forma 2
		System.out.println("");
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
				
		//Iterar a coleção de associações
		//Forma 1
		System.out.println("");
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		//Forma 2
		System.out.println("");
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
				
;	}

}
