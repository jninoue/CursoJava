package br.com.geekuniversity.secao14;

public class Ventilador implements IEletronico {
	private boolean ligado = false;

	@Override
	public void ligar() {
		if (!this.ligado) {
			this.ligado = true;
			System.out.println("Liguei o aparelho...");
		}else {
			System.out.println("O aparelho não está desligado!");
		}
		
	}

	@Override
	public void desligar() {
		if (this.ligado) {
			this.ligado = false;
			System.out.println("Desliguei o aparelho...");
		}else {
			System.out.println("Aparelho não está ligado!");
		}
		
	}
	
	public void outra_mensagem() {
		System.out.println("Podemos criar novos metodos");
	}

}
