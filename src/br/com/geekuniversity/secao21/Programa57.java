package br.com.geekuniversity.secao21;

import br.com.geekuniversity.secao11.Cliente;

public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Maria");
		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Felicity");
		System.out.println(lista);
		
		lista.adicionaNoComeco(42);
		System.out.println(lista);
		
		Cliente cli1 = new Cliente(34, "Juliana Paes", "Rua 3");
		lista.adiciona(cli1);
		System.out.println(lista);
		
		lista.adiciona(1, "Xuxa");
		System.out.println(lista);
		
		System.out.println(lista.pega(3));
		
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		System.out.println(lista);
	}

}
