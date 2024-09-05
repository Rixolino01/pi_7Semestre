package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

import AgropetSapeca.Forncedor;
import AgropetSapeca.Produto;

public class FornecedorDAo {
	private String sql, men;
	private Bd bd;
	public FornecedorDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Forncedor p) {
		sql = "insert into fornecedor values (?,?,?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getCnpj_fornecedor());
			bd.st.setString(2, p.getNome_fornecedor());
			bd.st.setString(3, p.getEndereco_fornecedor());
			bd.st.setString(4, p.getCidade_fornecedor());
			bd.st.setString(5, p.getEstado_fornecedor());
			bd.st.setString(6, p.getTelefone_fornecedor());
			bd.st.setString(7, p.getEmail_fornecedor());
			
			bd.st.executeUpdate();
			men = "fornecedor inserido com sucesso";
		}
		catch(SQLException e) {
			men = "fornecedor na inclusao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(Forncedor f) {

		sql = "update fornecedor set nome_fornecedor=?,endereco_fornecedor=?,cidade_fornecedor=?,estado_fornecedor=?,telefone_fornecedor=?,email_fornecedor=? where cnpj_fornecedor=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(7, f.getCnpj_fornecedor());
			bd.st.setString(1, f.getNome_fornecedor());
			bd.st.setString(2, f.getEndereco_fornecedor());
			bd.st.setString(3, f.getCidade_fornecedor());
			bd.st.setString(4, f.getEstado_fornecedor());
			bd.st.setString(5, f.getTelefone_fornecedor());
			bd.st.setString(6, f.getEmail_fornecedor());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "fornecedor alterado com sucesso";
		}else {
			men ="fornecedor nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do fornecedor";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from fornecedor where cnpj_fornecedor=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "fornecedor excluido com sucesso";
		}else {
			men ="fornecedor nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao do fornecedor";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}
	

}
