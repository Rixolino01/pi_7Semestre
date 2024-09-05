package AgropetSapeca;

public class AlterarQuantProduto {

	public static void main(String[] args) {
		/*
		 * essa classe altera as quantidades de produtos dentro do BD
		 */
		
		ProdutoDAo dao = new ProdutoDAo();
		
		Produto p = new Produto();
		p.setId_produto("3");
		p.setCusto(22.67);
		p.setQtdMinima(8.5);
		p.setEstoqueSeguranca(11);
				
		System.out.println(dao.alterarEstoque(p));
		
	}

}