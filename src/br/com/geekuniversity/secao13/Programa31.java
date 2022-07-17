package br.com.geekuniversity.secao13;

import br.com.geekuniversity.secao12.Aluno;

public class Programa31 {

	public static void main(String[] args) {
		Aluno maria = new Aluno("Maria da Silva", 1999, "maria@gmail.com", "123456");
			
		System.out.println(maria);
		
		maria.outra_mensagem("Meu nome é " + maria.getNome());

	}

}
