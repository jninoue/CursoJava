package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1 );
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join(); // avisando que a thread t1 deve 'se juntar' a um sincronizador
		t2.join(); // avisando que a thread t2 deve 'se juntar' a um sincronizador
		
		System.out.println(c1);

	}

}
