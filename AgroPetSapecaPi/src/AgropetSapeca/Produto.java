
package AgropetSapeca;

public class Produto {
	
	/*
	 * determinando os atributos da classe produto
	 */
	
	private String id_produto;
	private String nome;
	private String fabricante;
	private double custo;//calculado
	private String lotes;
	private String categoria;
	private String tipoPublico;// cachorro, gato, coelho
	private double quantidade_total;
	private double qtdMinima;
	private double estoqueSeguranca;
	
	
	public String getId_produto() {
		return id_produto;
	}
	public void setId_produto(String id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public String getLotes() {
		return lotes;
	}
	public void setLotes(String lotes) {
		this.lotes = lotes;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTipoPublico() {
		return tipoPublico;
	}
	public void setTipoPublico(String tipoPublico) {
		this.tipoPublico = tipoPublico;
	}
	public double getQuantidade_total() {
		return quantidade_total;
	}
	public void setQuantidade_total(double quantidade_total) {
		this.quantidade_total = quantidade_total;
	}
	public double getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(double qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public double getEstoqueSeguranca() {
		return estoqueSeguranca;
	}
	public void setEstoqueSeguranca(double estoqueSeguranca) {
		this.estoqueSeguranca = estoqueSeguranca;
	}
	
	
	//atribuição de Get and Setters
	
}
