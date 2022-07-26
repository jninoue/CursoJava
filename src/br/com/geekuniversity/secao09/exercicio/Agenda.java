package br.com.geekuniversity.secao09.exercicio;

import java.util.Arrays;

public class Agenda {
	
	Pessoa pessoas[] = new Pessoa[10];
	static int total_pessoa = 0;
	
	public void armazenaPessoa(Pessoa pessoa) {
		this.pessoas[total_pessoa] = pessoa;
		total_pessoa++;
	}
	
	public void removePessoa(String nome) {
		for (int i = 0; i < total_pessoa; i++ ) {
			if (this.pessoas[i] != null ) { 
				if (this.pessoas[i].getNome() == nome) {
					for (int j = i; j < total_pessoa; j ++) {
						this.pessoas[j] = this.pessoas[j+1];
					}
				}	
			}
			
		}
		total_pessoa--;
	}
	
	public int buscaPessoa(String nome) {
		for (int i = 0; i < total_pessoa; i++) {
			if (this.pessoas[i].getNome() == nome) {
				System.out.println(nome + " está na posição: " + i);
				return i;
			}
		}
		System.out.println("Nome não encontrado!");
		return -1;
	}
	
	public void imprimeAgenda() {
		
		String fmt = "%4s %30s %9s%n";
		System.out.printf(fmt, "Nome", "Idade", "Altura");
		System.out.printf(fmt, "----", "-----", "------");
				
		
		for (int i = 0; i < total_pessoa; i++) {
			System.out.printf(fmt, this.pessoas[i].getNome(), String.valueOf(this.pessoas[i].getIdade()), this.pessoas[i].getAltura());
			
		}
	}
	
	public void imprimePessoa(int posicao) {
		String fmt = "%4s %30s %9s%n";
		System.out.printf(fmt, "Nome", "Idade", "Altura");
		System.out.printf(fmt, "----", "-----", "------");
		System.out.printf(fmt, this.pessoas[posicao].getNome(), this.pessoas[posicao].getIdade(), this.pessoas[posicao].getAltura());
	}
	
	
	@Override
	public String toString() {
		
		return Arrays.toString(this.pessoas);
	}

}
