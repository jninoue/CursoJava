package br.com.geekuniversity.secao16;

public class Programa36 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		
		for (int i = 0; i <= numeros.length; i++) {
			try {
				System.out.println(numeros[i]);	
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição " + i + " inválida! ");
			}finally {
				System.out.println("Continua o processo...");
			}
			
		}

	}

}