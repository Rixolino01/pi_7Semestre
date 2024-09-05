package AgropetSapeca;

public class ExcluirCliente {

	public static void main(String[] args) {
		ClienteDAo dao = new ClienteDAo();
		
		Cliente c = new Cliente();
		System.out.println(dao.excluir("123.789.456-5"));

	}

}
