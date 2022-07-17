package br.com.geekuniversity.secao04;

public class Calculos {
	static void mediaPonderada (double[] nota) {
		double media_ponderada = 0;
		
		media_ponderada = media_ponderada + (nota[0] * 1);
		media_ponderada = media_ponderada + (nota[1] * 1);
		media_ponderada = media_ponderada + (nota[2] * 2);
		
		if ((media_ponderada/4) > 60) {
			System.out.println("Aluno APROVADO com média de: " + (media_ponderada/4));
		}else {
			System.out.println("Aluno REPROVADO com média de: " + (media_ponderada/4));
		}
	}
}
