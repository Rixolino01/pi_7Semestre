package AgropetSapeca;

public class listarProdutopet {

	public static void main(String[] args) {
		ProdutoDAo dao = new ProdutoDAo();
		Produto p = dao.buscarProduto(1);		
		System.out.println(p);	
		
	}

}

