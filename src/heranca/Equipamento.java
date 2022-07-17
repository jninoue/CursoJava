package heranca;

public class Equipamento {
	private String marca, modelo;
	
	public Equipamento(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void exibe() {
		System.out.println("===== Equipamento =====");
		System.out.println("Marca.: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
