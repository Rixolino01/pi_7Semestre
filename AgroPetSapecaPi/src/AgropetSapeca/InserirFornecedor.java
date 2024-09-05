package AgropetSapeca;

public class InserirFornecedor {

	public static void main(String[] args) {
		FornecedorDAo dao = new FornecedorDAo();
		
		Forncedor f = new Forncedor();
		f.setCnpj_fornecedor("45.598.0001-00");
		f.setNome_fornecedor("Rações Magnus");
		f.setEndereco_fornecedor("Rodovia Santana, 1435, Vila Maria");
		f.setCidade_fornecedor("Barueri");
		f.setEstado_fornecedor("São Paulo");
		f.setTelefone_fornecedor("11 40258-9865");
		f.setEmail_fornecedor("racoes.magnus@magnusind.com");
		
		System.out.println(dao.inserir(f));

	}

}
