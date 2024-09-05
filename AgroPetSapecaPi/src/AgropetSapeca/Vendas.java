package AgropetSapeca;

import java.sql.Date;

public class Vendas {
	
	private String id_vendas;
	private String forma_pagamento;
	private String tipo_entrega;
	private float preco;
	private float impostos;
	private float margem;
	private Date dataVenda;
	private String cpf;
	
	
	public String getId_vendas() {
		return id_vendas;
	}
	public void setId_vendas(String id_vendas) {
		this.id_vendas = id_vendas;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	public String getTipo_entrega() {
		return tipo_entrega;
	}
	public void setTipo_entrega(String tipo_entrega) {
		this.tipo_entrega = tipo_entrega;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getImpostos() {
		return impostos;
	}
	public void setImpostos(float impostos) {
		this.impostos = impostos;
	}
	public float getMargem() {
		return margem;
	}
	public void setMargem(float margem) {
		this.margem = margem;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
