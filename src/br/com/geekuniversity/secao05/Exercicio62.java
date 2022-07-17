package br.com.geekuniversity.secao05;

public class Exercicio62 {

	
	public static void main(String[] args) {
		int soma = 0;
		for (int i = 1 ; i <= 1000;  i++ ) {
			soma = soma + new Extenso(i).toString().length();
			System.out.println("Extenso de " + i + " é: " + new Extenso(i).toString());
						
		}
		System.out.println("Total de letras utilizadas: " + soma);

	}

}
