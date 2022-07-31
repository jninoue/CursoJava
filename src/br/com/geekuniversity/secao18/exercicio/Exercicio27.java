package br.com.geekuniversity.secao18.exercicio;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		//System.out.println("Informe a nota de corte da turma: ");
		//float nota_corte = Float.parseFloat(teclado.nextLine());
		Notas notas = new Notas();
		
		do {
			System.out.println("+------- SISTEMA NOTAS ALUNOS ----------+");
			System.out.println("| 1 - Inserir Aluno e notas             |");
			System.out.println("| 2 - Exibir Aluno e médias             |");
			System.out.println("| 3 - Exibir Aluno Aprovados            |");
			System.out.println("| 4 - Exibir Aluno Reprovados           |");
			System.out.println("| 5 - Salvar dados em disco             |");
			System.out.println("| 0 - Sair do sistema                   |");
			System.out.println("+---------------------------------------+");
			System.out.print("Opção-> ");
			opcao = Integer.parseInt(teclado.nextLine());
			
			switch (opcao) {
			case 1 :
				notas.inserirNotas();
				break;
			case 2 :
				
				break;
			case 3 :
				
				break;
			case 4 :
				
				break;
			case 5 :
				notas.salvar();
				break;
			case 0 :
				System.out.println("Sistema finalizado!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
				
		}while (opcao > 0);
		
		teclado.close();

	}

}
