package AgropetSapeca;

public class ExcluirLote {

	public static void main(String[] args) {
		LoteDAo dao = new LoteDAo();
		
		Lote l = new Lote();
		System.out.println(dao.excluir("a10"));

	}

}
