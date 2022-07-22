package br.com.geekuniversity.secao11;

@SuppressWarnings("rawtypes")
public class Cliente implements Comparable{
	String nome, endereco;
	int idade;
	
	public Cliente(int idade, String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String toString() {
		return this.nome;
	}

	@Override
	public int compareTo(Object outro) {
		Cliente aux = (Cliente)outro;
		if (this.idade < aux.idade) {
			return -1;
		}else if(this.idade > aux.idade) {
			return 1;
		}else {
			return 0;	
		}
		
	}
}
