package AgropetSapeca;

public class AlterarCliente {

	public static void main(String[] args) {
		ClienteDAo dao = new ClienteDAo();
		
		Cliente c = new Cliente();
		c.setCpf(null);
		c.setNome(null);
		c.setEndereco(null);
		c.setCidade(null);
		c.setEstado(null);
		c.setTelefone(null);
		c.setEmail(null);
		
		System.out.println(dao.alterar(c));

	}

}
