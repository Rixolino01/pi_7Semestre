package AgropetSapeca;

public class AlterarLote {

	public static void main(String[] args) {
		LoteDAo dao = new LoteDAo();
		
		Lote l = new Lote();
		l.setLote("A10");
		l.setDataAquisicao("29/11/2022");
		l.setDataValidade("29/03/2023");
		l.setQuantidade(72);
		
		System.out.println(dao.alterar(l));

	}

}
