package AgropetSapeca;

import java.sql.SQLException;
import java.util.List;

import AgropetSapeca.Pet;
import AgropetSapeca.Produto;


public class PetDAo {
	private String sql, men;
	private Bd bd;
	public PetDAo() {
		// TODO Auto-generated constructor stub
		bd = new Bd();
	}
	
	public String inserir(Pet p) {
		sql = "insert into PET (ID_PET, NOME_PET, DATA_DE_NASCIMNTO, SEXO, TIPO, PORTE) values (?,?,?,?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getId_pet());
			bd.st.setString(2, p.getNomePet());
			bd.st.setString(3, p.getDataNascimentoPet());
			bd.st.setString(4, p.getSexo());
			bd.st.setString(5, p.getPorte());
			bd.st.setString(6, p.getTipo());
			
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
	public String alterar(Pet p) {

		sql = "update pet set nome_pet=?,data_de_nascimnto=?,sexo=?,porte=?,tipo=? where id_pet=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(6, p.getId_pet());
			bd.st.setString(1, p.getNomePet());
			bd.st.setString(2, p.getDataNascimentoPet());
			bd.st.setString(3, p.getSexo());
			bd.st.setString(4, p.getPorte());
			bd.st.setString(5, p.getTipo());
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "pet alterado com sucesso";
		}else {
			men ="pet nao encontrado";
			
		}
		}
		
		catch(SQLException e) {
			men = "falha na alteracao do pet";
			System.out.println(e);
			
		}
		finally {
			bd.close();
		}

		return men;
		
	}
	public String excluir(String codigo) {

		sql = "delete from pet where id_pet=?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codigo);
			
			int pop = bd.st.executeUpdate();
			if(pop>0) {
			men = "pet excluido com sucesso";
		}else {
			men ="pet nao encontrado";
			
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
	public Produto get(int codigo) {
		return null;
	}
	public List<Produto> get() {
		return null;
	}


}
