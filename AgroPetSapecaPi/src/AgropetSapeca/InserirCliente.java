package AgropetSapeca;

public class InserirCliente {

	public static void main(String[] args) {
		ClienteDAo dao = new ClienteDAo();
			
		Cliente c = new Cliente();
		c.setCpf("123.789.456-5");
		c.setNome("José Almeida");
		c.setEndereco("Rua Ouro Fino, 57");
		c.setEstado("São Paulo");
		c.setCidade("Indaiatuba");
		c.setTelefone("011999503578");
		c.setEmail("josealmeida@gmail.com");
		
		System.out.println(dao.inserir(c));
		
			
		

	}

}
