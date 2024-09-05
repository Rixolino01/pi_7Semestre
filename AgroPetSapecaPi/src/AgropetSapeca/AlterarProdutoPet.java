package AgropetSapeca;

public class AlterarProdutoPet {
	
	/*
	 * essa classe altera os descrições do produto que constam no BD
	 */

	public static void main(String[] args) {
		ProdutoDAo dao = new ProdutoDAo();
		
		Produto p = new Produto();
		p.setId_produto("3");
		p.setNome("Gatos fofinhos");
		p.setFabricante("Whiskas");
		p.setCategoria("racao animal");
		p.setTipoPublico("gatos");		
		
		System.out.println(dao.alterarDescricao(p));
		
		
	}

}
