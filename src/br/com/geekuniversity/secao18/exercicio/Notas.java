package br.com.geekuniversity.secao18.exercicio;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
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
	static Scanner teclado = new Scanner(System.in);
	static String fmt = "%-30.30s %10s%n";
	
	public void inserirNotas() {
		boolean inserir = true;
		
		String nome; 
		float nota;
		
		while (inserir) {
			System.out.println("****** INCLUIR ALUNO E NOTAS *********");
			System.out.print("Informe nome do aluno: "); nome = teclado.nextLine();
			System.out.print("Informe nota do aluno " + nome + ": "); nota = Float.parseFloat(teclado.nextLine());
			
			alunos.add(new Aluno(nome, nota));
			System.out.println("Cadastro efetuado com sucesso!");
						
			System.out.print("Realizar outro cadastro (S)im (N)ão?: ");
			inserir = teclado.nextLine().toUpperCase().equals("S");
		}
		Collections.sort(alunos);
	}
	
	private void calcularMedia() {
		int qtd = 0;
		float notas = 0.0f;
		
		media_aluno.clear();
		for (int i = 0; i < alunos.size(); i++) {
			for (int j = i; j < alunos.size(); j++) {
				
				if (alunos.get(i).getNome().equals(alunos.get(j).getNome())) {
					notas = notas + alunos.get(j).getNota();
					qtd++;
					
					//verifica se é o ultimo registro
					if (j == (alunos.size() - 1)) {
						media_aluno.add(new Aluno((notas/qtd), alunos.get(i).getNome()));
						notas = 0.0f;
						qtd = 0;
						i = j;
						break;
					}
					
				}else {
					media_aluno.add(new Aluno((notas/qtd), alunos.get(i).getNome()));
					notas = 0.0f;
					qtd = 0;
					i = j - 1;
					break;
				}
			}
			
		}
	}
	public void exibirMedias() {
		
		calcularMedia();
		
		Collections.sort(media_aluno);
		
		System.out.println("+========== MÉDIA DOS ALUNOS ===========+");
		System.out.printf(fmt, "Nome", "Média");
		System.out.printf(fmt, "------------------", "-----");
		
		for (Aluno a : media_aluno) {
			System.out.printf(fmt, a.getNome(), a.getMedia());
		}
		System.out.println("+=======================================+\n");
		
			
	}
	
	public void alunoAprovado(float nota_corte) {
		
		calcularMedia();
		System.out.println("+========== ALUNOS APROVADOS ===========+");
		System.out.printf(fmt, "Nome", "Média");
		System.out.printf(fmt, "------------------", "-----");

		for (Aluno a : media_aluno) {
			if (a.getMedia() > nota_corte) {
				System.out.printf(fmt, a.getNome(), a.getMedia());
			}
		}
		System.out.println("+=======================================+\n");
		
	}
	
	public void alunoReprovado(float nota_corte) {
		calcularMedia();
		System.err.println("+========= ALUNOS REPROVADOS ===========+");
		System.err.printf(fmt, "Nome", "Média");
		System.err.printf(fmt, "------------------", "-----");

		for (Aluno a : media_aluno) {
			if (a.getMedia() <= nota_corte) {
				System.err.printf(fmt, a.getNome(), a.getMedia());
			}
		}
		System.err.println("+=======================================+\n");
		
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
	
	public void ler() {
		try (BufferedReader arq = new BufferedReader(new FileReader(arquivo))) {
			String linha = arq.readLine();
			
			while (linha != null) {
				String[] coluna = linha.split(";");
				alunos.add(new Aluno(coluna[0], Float.parseFloat(coluna[1])));
				linha = arq.readLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
