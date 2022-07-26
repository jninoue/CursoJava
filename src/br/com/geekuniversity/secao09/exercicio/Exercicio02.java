package br.com.geekuniversity.secao09.exercicio;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		
		Agenda agenda = new Agenda(); 
		
		Pessoa p1 = new Pessoa("Jefferson", 43, 1.75f);
		Pessoa p2 = new Pessoa("Renata", 40, 1.70f);
		Pessoa p3 = new Pessoa("Heitor Duarte Inoue", 11, 1.50f);
		Pessoa p4 = new Pessoa("Hugo", 6, 1.20f);
		
		agenda.armazenaPessoa(p1);
		agenda.armazenaPessoa(p2);
		agenda.armazenaPessoa(p3);
		agenda.armazenaPessoa(p4);
		System.out.println(agenda);
		
		agenda.removePessoa("Jefferson");
		System.out.println(agenda);
		
		agenda.buscaPessoa("Heitor");
		
		agenda.imprimeAgenda();
		
		System.out.println("");
		
		agenda.imprimePessoa(0);
		
			
		
	}

}
