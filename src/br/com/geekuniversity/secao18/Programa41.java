package br.com.geekuniversity.secao18;

public class Programa41 {

	public static void main(String[] args) {
		String curso = "Programação em Java: Essencial";
		
		String nova = curso.replace("Java", "Python"); //substitui a palavra
		curso.toLowerCase();
		curso.toUpperCase();
		
		System.out.println(curso);
		
		System.out.println(nova);
		
		System.out.println(curso.toLowerCase());
		
		System.out.println(curso.toUpperCase());
		
		System.out.println(curso.charAt(12));
		
		for (int i = 0; i < curso.length(); i++) {
			System.out.println(curso.charAt(i));
		}
		
		for (int i = (curso.length() - 1); i >= 0; i--) {
			System.out.print(curso.charAt(i));
		}

	}

}
