package AgropetSapeca;

public class ExcluirFornecedor {

	public static void main(String[] args) {
		FornecedorDAo dao = new FornecedorDAo();
		
		Forncedor f = new Forncedor();
		System.out.println(dao.excluir("45.598.0001-00"));

	}

}
