package br.com.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[] = new Aluno[100]; 
	private int total = 0;
	
	public void adiciona(Aluno aluno) {
		this.garantirEspaco();
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				alunos[i] = aluno;
				total++;
				break;
			}
		}
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garantirEspaco();
		for (int i = total -1; i >= posicao; i -=1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	}
	
	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao inválida!");
		}
		return this.alunos[posicao];
		

	}
	
	public void remove(int posicao) {
		this.alunos[posicao] = null;
		for (int i = posicao; i < this.total;  i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		total--;
	}
	
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < alunos.length; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.total;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.alunos); // facilita a visualizacao do array.
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}
	
	private void garantirEspaco() {
		if(total == alunos.length){
			Aluno novoArray[] = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
}

