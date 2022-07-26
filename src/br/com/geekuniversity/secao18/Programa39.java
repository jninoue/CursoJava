package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao09.exercicio.Cliente;
import br.com.geekuniversity.secao09.exercicio.Conta;

public class Programa39 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(18, "Angelina Jolie", "Rua 1, 234");
		Cliente cli2 = new Cliente(20, "Felicity Jones", "Rua 2, 345");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(1, 200, 300, cli2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1);
		System.out.println(c2);
		
		if (c1.equals(c2)) {
			System.out.println("São a mesma conta!");
		}else {
			System.out.println("São contas diferentes!");
		}
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta = prateleira.pegar(0);
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo()); // cast
		
		prateleira.adicionar(cli1);
		//System.out.println(prateleira.pegar(2).getSaldo());
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());
		
		if((Object)cli1 instanceof Conta) {
			System.out.println("O Objeto é do tipo conta");
		}else {
			System.out.println("O Objeto nao é do tipo conta");
		}

	}

}
