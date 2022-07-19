package br.com.geekuniversity.secao11;

public class Conta {
	int numero;
	private float saldo, limite;
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public void sacar(float valor) {
		
		if(valor <= (this.saldo + this.limite)) {
			this.saldo = (this.saldo + this.limite) - valor;	
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo Insuficiente!");
		}
		
	}
	
	
	/**
	 * Método para realizar depósito	
	 * @param valor a ser depositado
	 */
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
	@Override
	public String toString() {
		return "O saldo da conta é " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if( !(obj instanceof Conta)) {
			return false;
		}else {
			Conta verificar = (Conta) obj;
			return verificar.getSaldo() == this.getSaldo();
		}
		
	}
}
