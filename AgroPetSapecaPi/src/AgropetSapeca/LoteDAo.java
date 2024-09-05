package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

import AgropetSapeca.Lote;
import AgropetSapeca.Pet;
import AgropetSapeca.Produto;


public class LoteDAo {
	private String sql, men;
	private Bd bd;
	public LoteDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Lote l) {
		sql = "insert into lote values (?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, l.getLote());
			bd.st.setString(2, l.getDataAquisicao());
			bd.st.setString(3, l.getDataValidade());
			bd.st.setDouble(4, l.getQuantidade());
			
			
			bd.st.executeUpdate();
			men = "lote inserido com sucesso";
		}
		catch(SQLException e) {
			men = "lote na inclusao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(Lote l) {

		sql = "update lote set data_aquisicao=?,data_de_validade=?, QUANTIDADE=? where id_lote=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(4, l.getLote());
			bd.st.setString(1, l.getDataAquisicao());
			bd.st.setString(2, l.getDataValidade());
			bd.st.setDouble(3, l.getQuantidade());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "lote alterado com sucesso";
		}else {
			men ="lote nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do lote";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from lote where id_lote=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "lote excluido com sucesso";
		}else {
			men ="lote nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao do pet";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	
		


}
}
