package br.com.geekuniversity.secao21;

public class Programa55 {

	public static void main(String[] args) {
//		int numeros[] = new int[5];
//		
//		for( int i: numeros) {
//			System.out.println(numeros[i]);
//		}

		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		
		try {
			System.out.println(lista.pega(0));
			System.out.println(lista.pega(101));
		}catch(IllegalArgumentException e) {
			System.out.println("O aluno na posição 101 nao existe");
			System.out.println(e.getMessage());
		}
		
		Aluno a3 = new Aluno("Maria");
		lista.adiciona(1, a3);
		System.out.println(lista);
		
		Aluno a4 = new Aluno("Jefferson");
		lista.adiciona(0, a4);
		System.out.println(lista);
		
		lista.remove(0);
		System.out.println(lista);
	}
		

}
