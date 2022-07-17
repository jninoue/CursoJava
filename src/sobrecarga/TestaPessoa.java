package sobrecarga;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setCodigo(1);
		p1.setNome("Jefferson Nasu Inoue");
		p1.setIdade(42);
		
		p1.exibir();
		
		System.out.println("");
		p1.exibir(1);
		
		System.out.println("");
		p1.exibir(2);
		
		System.out.println("");
		Pessoa p2 = new Pessoa(2, "Renata de Andrade Duarte Inoue", 39);
		p2.exibir();

	}

}
