package br.com.geekuniversity.secao21;


public class Programa64 {

	public static void main(String[] args) {
//		LinkedList<String> conjunto = new LinkedList<String>();
//		
//		conjunto.add("Angelina");
//		conjunto.add("Felicity");
//		System.out.println(conjunto);

//		for (int i = 97; i < 123; i++) {
//			System.out.println((char)i); // cast, para imprimir a tabela ASCII.
//		}
		
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Angelina");
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Fabiana");
		System.out.println(conjunto);
		
		conjunto.remove("Fabiana");
		System.out.println(conjunto);
	}

}
