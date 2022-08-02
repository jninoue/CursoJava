package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa79 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para leigos", 170));
		cursos.add(new Curso("Algoritimos e lógica de programação", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de dados: essencial", 0));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny() // pega qualquer um de acordo com o filtro
			.ifPresent(System.out::println);

	}

}
