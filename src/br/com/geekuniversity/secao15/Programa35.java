package br.com.geekuniversity.secao15;

public class Programa35 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Meu cliente");
		System.out.println("Numero da conta " + c1.getNumero());
		System.out.println("Cliente " + c1.getCliente());
		
		System.out.println("Aproxima conta será " + Conta.proximaConta());

	}

}
