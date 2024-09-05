package AgropetSapeca;

public class InserirRequisição {

	public static void main(String[] args) {
		RequisicaoDAo dao = new RequisicaoDAo();
		
		Requisicao r = new Requisicao();
		r.setRequisicao("R0001");
		r.setQuantidade(52.5);
		
		
		System.out.println(dao.inserir(r));

	}

}
