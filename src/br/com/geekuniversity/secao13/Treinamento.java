package br.com.geekuniversity.secao13;
//template method

/*
 * E um modificador de acesso que faz com que o elemento
 * que esteja utilizando, não possa ser extendido/reescrito.
 */

public abstract class Treinamento {
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
		
	}	
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino Tático");
	}
		
	
}
