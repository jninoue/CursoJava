package br.com.geekuniversity.secao09;

public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Felicity Jone";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		pessoa1.imprime_informacoes();		
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1976);
		pessoa2.imprime_informacoes();
		
	}

}
