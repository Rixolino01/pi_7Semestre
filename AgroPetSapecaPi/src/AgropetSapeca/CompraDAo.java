package AgropetSapeca;

import java.sql.SQLException;

public class CompraDAo {
	private String sql, men;
	private Bd bd;
	public CompraDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Compras co) {
		sql = "insert into COMPRA values (?,?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, co.getNumero_do_pedido());
			bd.st.setString(2, co.getNota_fiscal());
			bd.st.setString(3, co.getForma_pagamento());
			bd.st.setDouble(4, co.getFrete());
			bd.st.setDouble(5, co.getPreco());
			bd.st.setString(6, co.getDataCompra());			
			bd.st.executeUpdate();
			men = "compra inserido com sucesso";
		}
		catch(SQLException e) {
			men = "falha na inclusao da compra";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(Compras co) {

		sql = "update COMPRA set nota_fiscal=?,forma_pagamento=?,frete=?,preco=?,cnpj_fornecedor=?dataCompra=? where numero_do_pedido=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(7, co.getNumero_do_pedido());
			bd.st.setString(1, co.getNota_fiscal());
			bd.st.setString(2, co.getForma_pagamento());
			bd.st.setDouble(3, co.getFrete());
			bd.st.setDouble(4, co.getPreco());
			bd.st.setString(5, co.getCnpj_fornecdor());
			bd.st.setString(6, co.getDataCompra());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "compra alterada com sucesso";
		}else {
			men ="cmpra nao encontrada";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao da compra";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from compra where numero_do_pedido=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "compra excluida com sucesso";
		}else {
			men ="compra nao encontrada";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao da compra";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}



}
