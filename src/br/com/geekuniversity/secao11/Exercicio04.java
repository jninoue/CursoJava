package br.com.geekuniversity.secao11;

public class Exercicio04 {
	public static void main(String[] args) {
		Televisao tv1 = new Televisao();
		ControleRemoto cr1 = new ControleRemoto(tv1);
		
		cr1.aumenta_volume();
		System.out.println("Volume televisao é: " + tv1.getVolume());
	}
	
	
	
}
