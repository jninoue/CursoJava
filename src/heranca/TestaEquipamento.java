package heranca;

public class TestaEquipamento {

	public static void main(String[] args) {
		Equipamento eq1 = new Equipamento("Dell", "Optplex");
		Computador pc1 = new Computador("HP", "Infinity", "8 GB", "2 TB");
		
		
		pc1.exibe();
		eq1.exibe();
		
		

	}

}
