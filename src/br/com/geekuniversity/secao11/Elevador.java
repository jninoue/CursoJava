package br.com.geekuniversity.secao11;

public class Elevador {
	private int andar, tot_andar, capacidade, pessoa_presente;
	
	
	public Elevador(int tot_andar, int capacidade) {
		this.andar = 0;
		this.tot_andar = tot_andar;
		this.capacidade = capacidade;
		this.pessoa_presente = 0;
	}
	
	public void Entra() {
		if ((this.pessoa_presente + 1) <= this.capacidade) {
			this.pessoa_presente = this.pessoa_presente + 1;
		}else {
			System.out.println("Elevador cheio!");
		}
	}
	
	public void Sai() {
		if (this.pessoa_presente - 1 >= 0) {
			this.pessoa_presente = pessoa_presente - 1;
		}else {
			System.out.println("Elevador vazio!");
		}
	}
	
	public void Sobe( ) {
		if (this.andar + 1 <= this.tot_andar) {
			this.andar = this.andar + 1;
		}else {
			System.out.println("Elevador já está no ultimo andar!");
		}
	}
	
	public void Desce() {
		if (this.andar - 1 >= 0) {
			this.andar = this.andar - 1;
		}else {
			System.out.println("Elevador já está no térreo");
		}
	}
	
	public int getAndar() {
		return this.andar;
	}
	
	public int getTot_andar() {
		return this.tot_andar;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public int getPessoa_presente() {
		return this.pessoa_presente;
	}
	
	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public void setTot_andar(int tot_andar) {
		this.tot_andar = tot_andar;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setPessoa_presente(int pessoa_presente) {
		this.pessoa_presente = pessoa_presente;
	}
	
	
}
