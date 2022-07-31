package br.com.geekuniversity.secao18.exercicio;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private float nota, media;
	
		
	public Aluno() {
		
	}
	
	public Aluno(String nome, float nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
		
	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota + "]";
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		return this.nome.compareTo(outroAluno.nome);
	}


}
