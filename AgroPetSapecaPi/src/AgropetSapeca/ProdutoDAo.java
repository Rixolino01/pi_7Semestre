package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

public class ProdutoDAo {
	private String sql, men;
	private Bd bd;
	public ProdutoDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	/*
	 * determinando os campos que serão alterados para inserir novo produto
	 */
	
	public String inserir(Produto p) {
		sql = "insert into PRODUTO (ID_PRODUTO, NOME, FABRICANTE, CUSTO, LOTES, CATEGORIA, TIPO_DE_PUBLICO) values (?,?,?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getId_produto());
			bd.st.setString(2, p.getNome());
			bd.st.setString(3, p.getFabricante());
			bd.st.setDouble(4, p.getCusto());
			bd.st.setString(5, p.getLotes());
			bd.st.setString(6, p.getCategoria());
			bd.st.setString(7, p.getTipoPublico());
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
	/*
	 * alterando o produto dentro do BD
	 */
	
	public String alterarDescricao(Produto p) {

		sql = "update PRODUTO set NOME=?,FABRICANTE=?,CATEGORIA=?,TIPO_DE_PUBLICO=?, where ID_PRODUTO=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(5, p.getId_produto());
			bd.st.setString(1, p.getNome());
			bd.st.setString(2, p.getFabricante());
			bd.st.setString(3, p.getCategoria());
			bd.st.setString(4,p.getTipoPublico());
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "produto alterado com sucesso";
		}else {
			men ="produto nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	
	/*
	 * exclusão de linha do BD
	 */
	public String excluir(int codigo) {

		sql = "delete from PRODUTO where codigo=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "produto excluido com sucesso";
		}else {
			men ="produto nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na exclusao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}
	
	
	
	/*
	 * alterando os valores de quantidades relacionado ao produto dentro do BD
	 */
	
	public String alterarEstoque(Produto p) {

		sql = "update PRODUTO set CUSTO=?,QUANTIDADE_MIN=?,ESTOQUE_SEGURANCA=? where ID_PRODUTO=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(4, p.getId_produto());
			bd.st.setDouble(1, p.getCusto());
			bd.st.setDouble(2, p.getQtdMinima());
			bd.st.setDouble(3, p.getEstoqueSeguranca());
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "produto alterado com sucesso";
		}else {
			men ="produto nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do produto";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
	}
	public Produto buscarProduto(int codigo) {
		sql = "select * from PRODUTO where ID_PRODUTO=?";
		bd.getConnection();
		Produto p = null;
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codigo);
			bd.rs = bd.st.executeQuery();
			bd.rs.next();
			p = new Produto();
			p.setId_produto(bd.rs.getString(codigo));
			p.setNome(bd.rs.getString("nome"));
			p.setFabricante(bd.rs.getString("fabricante"));
			p.setCusto(bd.rs.getDouble("custo"));
			p.setLotes(bd.rs.getString("lotes"));
			p.setCategoria(bd.rs.getString("categoria"));
			p.setTipoPublico(bd.rs.getString("tipo_de_publico"));
			p.setQuantidade_total(bd.rs.getDouble("quantidade_total"));
			p.setQtdMinima(bd.rs.getDouble("quantidade_min"));
			p.setEstoqueSeguranca(bd.rs.getDouble("estoque_seguranca"));	
			
						
		}
		catch(SQLException e) {
			System.out.println(e);			
			
		}
		finally {
			bd.close();
		}
		return p;
	
	}
	public List<Produto> get() {
		return null;
	}
		

}
