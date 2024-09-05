package AgropetSapeca;

public class InserirLote {

	public static void main(String[] args) {
		LoteDAo dao = new LoteDAo();
		
		Lote l = new Lote();
		l.setLote("A10");
		l.setDataAquisicao("29/11/2022");
		l.setDataValidade("29/02/2023");
		l.setQuantidade(80);
		
		System.out.println(dao.inserir(l));

	}

}
