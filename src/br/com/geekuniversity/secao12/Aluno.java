package br.com.geekuniversity.secao12;

public class Aluno extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email);
		this.ra = ra;
	}
	
	public String toString() {
		return super.toString() + "\nR.A: " + this.ra;
	}
	
	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}

}
