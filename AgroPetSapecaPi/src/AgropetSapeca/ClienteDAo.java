package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

import AgropetSapeca.Cliente;
import AgropetSapeca.Produto;


public class ClienteDAo {
	private String sql, men;
	private Bd bd;
	public ClienteDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Cliente c) {
		sql = "insert into cliente values (?,?,?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, c.getCpf());
			bd.st.setString(2, c.getNome());
			bd.st.setString(3, c.getEndereco());
			bd.st.setString(4, c.getEstado());
			bd.st.setString(5, c.getCidade());
			bd.st.setString(6, c.getTelefone());
            bd.st.setString(7, c.getEmail());
			
			bd.st.executeUpdate();
			men = "produto inserido com sucesso";
		}
		catch(SQLException e) {
			men = "falha na inclusao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(Cliente c) {

		sql = "update cliente set cpf=?,nome=?,endereco=?,estado=?,cidade=?,telefone=?,email=? where cpf=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(7, c.getCpf());
			bd.st.setString(1, c.getNome());
			bd.st.setString(2, c.getEndereco());
			bd.st.setString(3, c.getEstado());
			bd.st.setString(4, c.getCidade());
			bd.st.setString(5, c.getTelefone());
            bd.st.setString(5, c.getEmail());
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "cliente alterado com sucesso";
		}else {
			men ="cliente nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do cliente";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from cliente where cpf=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "cliente excluido com sucesso";
		}else {
			men ="cliente nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao do cliente";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}
	public Produto get(int codigo) {
		return null;
	}
	public List<Produto> get() {
		return null;
	}


}
