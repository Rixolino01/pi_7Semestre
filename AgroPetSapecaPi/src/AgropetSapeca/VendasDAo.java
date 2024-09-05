package AgropetSapeca;

import java.sql.SQLException;


import AgropetSapeca.Vendas;

public class VendasDAo {
	private String sql, men;
	private Bd bd;
	public VendasDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Vendas p) {
		sql = "insert into vendas values (?,?,?,?,?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getId_vendas());
			
			bd.st.setString(2, p.getForma_pagamento());
			bd.st.setString(3, p.getTipo_entrega());
			bd.st.setFloat(4, p.getPreco());
			bd.st.setFloat(5, p.getImpostos());
			bd.st.setFloat(6, p.getMargem());
			bd.st.setDate(7, p.getDataVenda());
			bd.st.setString(8, p.getCpf());
			
			
			bd.st.executeUpdate();
			men = "venda inserido com sucesso";
		}
		catch(SQLException e) {
			men = "falha na inclusao da venda";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}
;
		return men;
	}
	public String alterar(Vendas p) {

		sql = "update vendas set forma_pagamento=?,tipo_entrega=?,preco=?,impostos=?,margem=?, data_venda=?,cpf=? where id_vendas=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(8, p.getId_vendas());
			
			bd.st.setString(1, p.getForma_pagamento());
			bd.st.setString(2, p.getTipo_entrega());
			bd.st.setFloat(3, p.getPreco());
			bd.st.setFloat(4, p.getImpostos());
			bd.st.setFloat(5, p.getMargem());
			bd.st.setDate(6, p.getDataVenda());
			bd.st.setString(7, p.getCpf());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "venda alterada com sucesso";
		}else {
			men ="venda nao encontrada";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao da venda";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from vendas where id_vendas=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "venda excluida com sucesso";
		}else {
			men ="venda nao encontrada";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao da venda";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}



}
