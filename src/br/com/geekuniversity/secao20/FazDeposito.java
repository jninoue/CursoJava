package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao09.exercicio.Conta;

public class FazDeposito implements Runnable{
	private Conta conta;
	
	public FazDeposito(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void run() {
		this.conta.depositar(100.0f);
		
	}

}
