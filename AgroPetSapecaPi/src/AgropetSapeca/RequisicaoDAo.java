package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

import AgropetSapeca.Cliente;
import AgropetSapeca.Requisicao;

public class RequisicaoDAo {
	private String sql, men;
	private Bd bd;
	public RequisicaoDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Requisicao p) {
		sql = "insert into requisicao values (?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getRequisicao());
			bd.st.setString(2, p.getId_produto());
			bd.st.setString(3,p.getNumero_do_pedido());
			bd.st.setDouble(4, p.getQuantidade());
			bd.st.setString(5, p.getId_lote());
		
			
			
			bd.st.executeUpdate();
			men = "requisicao inserida com sucesso";
		}
		catch(SQLException e) {
			men = "falha na inclusao da requisicao";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(Requisicao p) {

		sql = "update requisicao set id_produto=?,numero_do_pedido=?,quantidade=?,id-lote=? where requisicao=? ";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(5, p.getRequisicao());
			bd.st.setString(1, p.getId_produto());
			bd.st.setString(2,p.getNumero_do_pedido());
			bd.st.setDouble(3, p.getQuantidade());
			bd.st.setString(4, p.getId_lote());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "requisicao alterada com sucesso";
		}else {
			men ="requisicao nao encontrada";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao da requisicao";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from requisicao where requisicao=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "requisicao excluido com sucesso";
		}else {
			men ="requisicao nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao da requisicao";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}
	

}
