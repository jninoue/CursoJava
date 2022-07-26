package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao09.exercicio.Cliente;
import br.com.geekuniversity.secao09.exercicio.Conta;

public class Programa53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1 );
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		System.out.println(c1);
	}

}
