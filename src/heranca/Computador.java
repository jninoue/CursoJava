package heranca;

public class Computador extends Equipamento{
	private String memoria, hd;
	
	public Computador (String marca, String modelo, String memoria, String hd) {
		super(marca, modelo);
		this.memoria = memoria;
		this.hd = hd;
	}
	
	public void exibe() {
		super.exibe();
		System.out.println("===== Computador =====");
		System.out.println("Memória: " + this.memoria);
		System.out.println("HD.....: " + this.hd);
	}
	
	public String getMemoria() {
		return memoria;
	}
	
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	
	public String getHd() {
		return hd;
	}
	
	public void setHd(String hd) {
		this.hd = hd;
	}

}
