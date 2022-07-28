package br.com.geekuniversity.secao18.exercicio;

import java.util.Scanner;

public class Exercicio29 {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao = 0;
		String arquivo;
		Arquivo arq = new Arquivo();
		
		System.out.print("Informe base dados vendedor: ");
		arquivo = teclado.nextLine();
		
		do {
			System.out.println("+---------- Sistema Vendedor ----------+");
			System.out.println("| 1 - Criar arquivo de dados           |");
			System.out.println("| 2 - Incluir registro no arquivo      |");
			System.out.println("| 3 - Excluir registro no arquivo      |");
			System.out.println("| 4 - Altera valor de venda            |");
			System.out.println("| 5 - Imprime registro                 |");
			System.out.println("| 6 - Excluir arquivo                  |");
			System.out.println("| 0 - Sair do sistema                  |");
			System.out.println("+--------------------------------------+");
			System.out.print("Opção: ");
			opcao = Integer.parseInt(teclado.nextLine());
			
			switch (opcao) {
			case 1:
				arq.criar_arquivo(arquivo);
				break;
			case 2:
				arq.incluir_registro(arquivo);
				break;
			case 3:
				arq.excluir_registro(arquivo);
				break;
			case 4:
				arq.alterar_venda(arquivo);
				break;
			case 5:
				arq.imprime_registro(arquivo);
				break;
			case 6:
				arq.excluir_arquivo(arquivo);
				break;
			default:
				break;
			}
			
			
		}while (opcao > 0);
		teclado.close();

	}

}
