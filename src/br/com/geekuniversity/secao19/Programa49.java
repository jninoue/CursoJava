package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.geekuniversity.secao09.exercicio.Cliente;
import br.com.geekuniversity.secao09.exercicio.Conta;

public class Programa49 {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cl1 = new Cliente(18, "Angelina Jolie", "Rua 1");
		Cliente cl2 = new Cliente(45, "Felicity Jones", "Rua 2");
		
		Conta c1 = new Conta(1, 200, 300, cl1);
		Conta c2 = new Conta(1, 400, 700, cl2);
		
		contas.put("Pessoa Física", c1);
		contas.put("Pessoa Jurídica", c2);
		 
		
		System.out.println(contas);

		System.out.println(contas.get("Pessoa Física"));
	}

}
