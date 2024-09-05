package AgropetSapeca;

public class Requisicao {
	private String requisicao;
	private String id_produto;
	private String numero_do_pedido;
	private double quantidade;
	private String id_lote;
	
	
	public String getRequisicao() {
		return requisicao;
	}
	public void setRequisicao(String requisicao) {
		this.requisicao = requisicao;
	}
	public String getId_produto() {
		return id_produto;
	}
	public void setId_produto(String id_produto) {
		this.id_produto = id_produto;
	}
	public String getNumero_do_pedido() {
		return numero_do_pedido;
	}
	public void setNumero_do_pedido(String numero_do_pedido) {
		this.numero_do_pedido = numero_do_pedido;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public String getId_lote() {
		return id_lote;
	}
	public void setId_lote(String id_lote) {
		this.id_lote = id_lote;
	}
	

}
