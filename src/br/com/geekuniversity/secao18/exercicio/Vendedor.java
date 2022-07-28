package br.com.geekuniversity.secao18.exercicio;

public class Vendedor implements Comparable<Vendedor> {
	private int codigo_vendedor, mes;
	private String nome_vendedor;
	private float valor_venda;
	
	public Vendedor(int codigo_vendedor, String nome_vendedor, float valor_venda, int mes) {
		this.codigo_vendedor = codigo_vendedor;
		this.nome_vendedor = nome_vendedor;
		this.valor_venda = valor_venda;
		this.mes = mes;
	}
	
	public int getCodigo_vendedor() {
		return codigo_vendedor;
	}
	
	public void setCodigo_vendedor(int codigo_vendedor) {
		this.codigo_vendedor = codigo_vendedor;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public String getNome_vendedor() {
		return nome_vendedor;
	}
	
	public void setNome_vendedor(String nome_vendedor) {
		this.nome_vendedor = nome_vendedor;
	}
	
	public float getValor_venda() {
		return valor_venda;
	}
	
	public void setValor_venda(float valor_venda) {
		this.valor_venda = valor_venda;
	}

	@Override
	public String toString() {
		return "Vendedor [codigo_vendedor=" + codigo_vendedor + ", mes=" + mes + ", nome_vendedor=" + nome_vendedor
				+ ", valor_venda=" + valor_venda + "]";
	}

	@Override
	public int compareTo(Vendedor outroVendedor) {
		
		if (this.codigo_vendedor == outroVendedor.codigo_vendedor) {
			if (this.mes > outroVendedor.mes) {
				return 1;
			}else if (this.mes < outroVendedor.mes) {
				return -1;
			}else {
				return 0;
			}
		
		}else if (this.codigo_vendedor < outroVendedor.codigo_vendedor) {
			return -1;
		}else {
			return 1;
		}

	}

}
