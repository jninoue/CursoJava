package br.com.geekuniversity.secao09;

public class Produto {
	String nome;
	float preco, desconto;
	
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}

}
