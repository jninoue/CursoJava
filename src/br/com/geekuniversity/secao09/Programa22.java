package br.com.geekuniversity.secao09;

public class Programa22 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "NOTEBOOK";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("========= PRODUTOS ============");
		System.out.println(p1.nome);
		System.out.println("R$ " + p1.preco);
		System.out.println(p1.desconto + "%");
		
		Produto p0 = new Produto();
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f;
		p0.desconto = 5.0f;
		
		System.out.println("");
		System.out.println(p0.nome);
		System.out.println("R$ " + p0.preco);
		System.out.println(p0.desconto + "%");

	}

}
