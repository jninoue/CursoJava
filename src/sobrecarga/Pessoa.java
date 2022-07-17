package sobrecarga;

public class Pessoa {
	private int codigo, idade;
	private String nome;
	
	public Pessoa() {
		System.out.println("Construtor padrão");
	}
	
	public Pessoa(int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}
	
	public void exibir() {
		System.out.println("======= Dados Cadastrais =======");
		System.out.println("Codgo: " + this.codigo);
		System.out.println("Nome.: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
	
	public void exibir(int num) {
		if (num == 1) {
			System.out.println("Idade: " + this.idade);
		}else {
			System.out.println("Codgo: " + this.codigo);
			System.out.println("Nome.: " + this.nome);
		}
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
