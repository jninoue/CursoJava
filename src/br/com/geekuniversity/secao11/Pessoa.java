package br.com.geekuniversity.secao11;

public class Pessoa {
	private String nome;
	private int idade;
	private float altura;
	
	public void imprime_dados() {
		System.out.println("======== Dados Cadastrais ========");
		System.out.println("Nome..: " + this.nome);
		System.out.println("Idade.: " + this.idade);
		System.out.println("Altura: " + this.altura);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
