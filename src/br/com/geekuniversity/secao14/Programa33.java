package br.com.geekuniversity.secao14;

public class Programa33 {

	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		
		System.out.println("A marca do ventilador é " + IEletronico.MARCA);
		
		vent.desligar();
		
		vent.ligar();
		
		vent.desligar();

	}

}
