package br.com.geekuniversity.secao21;

public class Programa62 {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		System.out.println(fila);
		
		fila.adiciona("Angelina");
		fila.adiciona("Felicity");
		
		System.out.println(fila);
		
		System.out.println(fila.remove());
		System.out.println(fila);
		
		System.out.println(fila.remove());
		System.out.println(fila.vazia());
	}

}
