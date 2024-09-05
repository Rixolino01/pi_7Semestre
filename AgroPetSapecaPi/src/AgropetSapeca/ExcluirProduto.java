package AgropetSapeca;


public class ExcluirProduto {

	public static void main(String[] args) {
		ProdutoDAo dao = new ProdutoDAo();
		
		Produto p = new Produto();
		System.out.println(dao.excluir(1));

	}

}
