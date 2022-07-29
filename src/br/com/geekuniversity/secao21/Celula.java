package br.com.geekuniversity.secao21;

/**
 * Classe que representa uma célula (container) onde
 * teremos o objeto (valor) e uma celula que será a 
 * ligação para o próximo.
 * @author usuario
 *
 */
public class Celula {
	private Object elemento;
	private Celula proximo;
	private Celula anterior;
	
	
	public Celula(Object elemento, Celula proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Celula(Object elemento) {
		this(elemento, null);
	}
	
	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	
	

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	 
	
}
