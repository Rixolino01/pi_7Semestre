package AgropetSapeca;
/*
 * carregando o BD para inserir produto novo
 */

public class InserirProduto {

	public static void main(String[] args) {
		ProdutoDAo dao = new ProdutoDAo();
		
		Produto p = new Produto();
		p.setId_produto("3");
		p.setNome("Pedigre filhote");
		p.setFabricante("Pedigree");
		p.setCusto(11);
		p.setLotes("A3");
		p.setCategoria("Ração animal");
		p.setTipoPublico("Gato");		
				
		System.out.println(dao.inserir(p));

	}

}
