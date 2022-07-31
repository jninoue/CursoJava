package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Angelina");
		fila.add("Felicity");
		fila.add("Maria");
		
		System.out.println(fila);
		
		System.out.println(fila.poll());

		System.out.println(fila);
	}

}
