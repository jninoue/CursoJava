package br.com.geekuniversity.secao09.exercicio;

public class Exercicio03 {

	public static void main(String[] args) {
		Elevador elev1 = new Elevador(3,4);
		
		elev1.Sobe();
		System.out.println("Andar: " + elev1.getAndar());
		elev1.Sobe();
		System.out.println("Andar: " + elev1.getAndar());
		elev1.Sobe();
		System.out.println("Andar: " + elev1.getAndar());
		elev1.Sobe();
		System.out.println("Andar: " + elev1.getAndar());
		elev1.Desce();
		System.out.println("Andar: " + elev1.getAndar());
		elev1.Desce();
		System.out.println("Andar: " + elev1.getAndar());
		elev1.Desce();
		System.out.println("Andar: " + elev1.getAndar());
		elev1.Desce();
		System.out.println("Andar: " + elev1.getAndar());
		elev1.Sai();
		System.out.println("Andar: " + elev1.getPessoa_presente());

	}

}
