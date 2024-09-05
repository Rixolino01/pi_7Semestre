package AgropetSapeca;

public class Compras {
	
	/*
	 * determinando os atributos da classe Compras
	 */

	private String numero_do_pedido;
	private String nota_fiscal;
	private String forma_pagamento;
	private double frete;
	private double preco;
	private String cnpj_fornecdor;
	private String dataCompra;
	
	public String getNumero_do_pedido() {
		return numero_do_pedido;
	}
	public void setNumero_do_pedido(String numero_do_pedido) {
		this.numero_do_pedido = numero_do_pedido;
	}
	public String getNota_fiscal() {
		return nota_fiscal;
	}
	public void setNota_fiscal(String nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCnpj_fornecdor() {
		return cnpj_fornecdor;
	}
	public void setCnpj_fornecdor(String cnpj_fornecdor) {
		this.cnpj_fornecdor = cnpj_fornecdor;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	
}
	
	