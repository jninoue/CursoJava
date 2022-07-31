package br.com.geekuniversity.secao18.exercicio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Notas {
	static String arquivo = "C:\\Users\\usuario\\git\\CursoJava\\src\\br\\com\\geekuniversity\\secao18\\exercicio\\aluno.csv"; 
	static List<Aluno> alunos = new ArrayList<Aluno>(); 
	static List<Aluno> media_aluno = new ArrayList<Aluno>();
	
	public void inserirNotas() {
		boolean inserir = true;
		Scanner input = new Scanner(System.in);
		String nome, nota;
		
		while (inserir) {
			System.out.println("****** INCLUIR ALUNO E NOTAS *********");
			System.out.print("Informe nome do aluno: "); nome = input.nextLine();
			System.out.print("Informe nota do aluno " + nome + ": "); nota = input.nextLine();
			
			alunos.add(new Aluno(nome, Float.parseFloat(nota)));
			System.out.println("Cadastro efetuado com sucesso!");
						
			System.out.print("Realizar outro cadastro (S)im (N)ão?: ");
			inserir = input.nextLine().toUpperCase().equals("S");
		}
		input.close();
		Collections.sort(alunos);
	}
	
	public void exibirMedias() {
		int qtd = 0;
		float notas = 0.0f;
		
		for (int i = 0; i < alunos.size(); i++) {
			for (int j = i; j < alunos.size(); j++) {
				
				if (alunos.get(i).getNome().equals(alunos.get(j).getNome())) {
					notas = notas + alunos.get(j).getNota();
					qtd++;
					
					//verifica se é o ultimo registro
					if (j == (alunos.size() - 1)) {
						media_aluno.add(new Aluno(alunos.get(i).getNome(), (notas/qtd)));
						notas = 0.0f;
						qtd = 0;
						i = j;
						break;
					}
					
				}else {
					media_aluno.add(new Aluno(alunos.get(i).getNome(), (notas/qtd)));
					notas = 0.0f;
					qtd = 0;
					i = j - 1;
					break;
				}
			}
			
		}
		System.out.println(media_aluno);
			
	}
	
	public void salvar() {
		try(PrintStream arq = new PrintStream(new FileOutputStream(arquivo, true))){
			for(Aluno a : alunos) {
				arq.println(a.getNome()+";"+a.getNota()+";");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
