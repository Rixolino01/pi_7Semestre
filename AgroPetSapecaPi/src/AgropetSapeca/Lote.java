package AgropetSapeca;

import java.sql.Date;

public class Lote {
	
	/*
	 * Determinando os atributos da classe Lote
	 */
	
	private String id_lote;
	private String dataAquisicao;
	private String dataValidade;
	private Double quantidade;
	
	public String getLote() {
		return id_lote;
	}
	public void setLote(String lote) {
		this.id_lote = lote;
	}
	public String getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(String dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
