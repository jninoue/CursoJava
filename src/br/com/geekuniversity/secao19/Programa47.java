package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

import br.com.geekuniversity.secao09.exercicio.Cliente;

public class Programa47 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(45, "Maria da Silva", "Rua 1");
		Cliente cli2 = new Cliente(18, "Felicity Jones", "Rua 2");
		Cliente cli3 = new Cliente(56, "Angelina Jolie", "Rua 3");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		

	}

}
