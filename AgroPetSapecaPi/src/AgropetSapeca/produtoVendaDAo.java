package AgropetSapeca;

import java.sql.SQLException;


import AgropetSapeca.produtoVenda;



public class produtoVendaDAo {
	private String sql, men;
	private Bd bd;
	public produtoVendaDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(produtoVenda p) {
		sql = "insert into produto_venda values (?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getId_solicitacao());
			bd.st.setString(2,p.getId_produto());
			bd.st.setString(3, p.getId_venda());
			bd.st.setInt(4, p.getQuantidade());
			
			
			bd.st.executeUpdate();
			men = "produto_venda inserido com sucesso";
		}
		catch(SQLException e) {
			men = "falha na inclusao de produto_venda";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(produtoVenda p) {

		sql = "update produto_venda set id_produto=?,id_venda=?,quantidade=? where id_solicitacao=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st = bd.con.prepareStatement(sql);
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(4, p.getId_solicitacao());
			bd.st.setString(1,p.getId_produto());
			bd.st.setString(2, p.getId_venda());
			bd.st.setInt(3, p.getQuantidade());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "produto_venda alterada com sucesso";
		}else {
			men ="produto_venda nao encontrada";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao de produto_venda";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from produto_venda where id_solicitacao=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "produto_venda excluida com sucesso";
		}else {
			men ="produto_venda nao encontrada";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao da produto_venda";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}



}
