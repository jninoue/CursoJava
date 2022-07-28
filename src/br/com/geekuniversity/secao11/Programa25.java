package br.com.geekuniversity.secao11;

public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente(45, "João da Silva", "Rua da paz, 45");
		Cliente maria = new Cliente(47, "Maria da Silva", "Rua da paz, 45");
		
		Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);
		
		System.out.println("Saldo do joão: " + conta_joao.getSaldo());
		System.out.println("Saldo do Maria: " + conta_maria.getSaldo());
		
		conta_joao.sacar(300);
		System.out.println("Saldo do joão: " + conta_joao.getSaldo());

	}

}
