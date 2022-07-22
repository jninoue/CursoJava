package br.com.geekuniversity.secao19;

//import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa48 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + "/5 nome: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			
			if (!res) {
				System.out.println("O nome não pode ser repetido!");
				i--;
			}
		}
		System.out.println(nomes);
		teclado.close();
		
//		nomes.add("Maria");
//		nomes.add("Felicity");
//		nomes.add("Angelina");
//		nomes.add("Geek");
//		nomes.add("Felicity"); // conjunto não aceitam repetição de valores.
//		
//		System.out.println(nomes);
//		
//		for (String nome : nomes) {
//			System.out.println(nome);
//		}
	}

}
