package br.com.geekuniversity.secao21;

import java.util.Stack;

public class Programa61 {

	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
		
		nomes.push("Angelina"); // insere na pilha
		nomes.push("Felicity");
		System.out.println(nomes);
		
		String ret = nomes.peek(); // retorna o elemento do topo
		System.out.println(ret);
		
		nomes.pop(); // remove
		System.out.println(nomes);
		
		
	}

}
