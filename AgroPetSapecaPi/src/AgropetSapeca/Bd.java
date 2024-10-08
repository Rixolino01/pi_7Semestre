
package AgropetSapeca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bd {
	public Connection con = null;
	public PreparedStatement st = null;
	public ResultSet rs = null;
	
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String BANCO = "JAVA";
	private final String URL = "jdbc:sqlserver://localhost:1433;databasename= "+BANCO;
	private final String LOGIN = "sa";
	private final String SENHA = "123456";
	
	public boolean getConnection() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,LOGIN,SENHA);
			System.out.println("carregou o driver");
			return true;
		}
		catch(ClassNotFoundException erro){
		System.out.println("driver nao encontrado");
			return false;
			
		}
		catch(SQLException erro) {
			System.out.println("erro de coneccao"+erro);
			return false;
		}
		
	}
	public void close() {
		try {
			if(rs!=null)rs.close();
			
			
		}
		catch(SQLException erro) {
			
		}
		try {
			if(st!=null)st.close();
			
		}
		catch(SQLException erro) {
			
		}
		try {
			if(con!=null)con.close();
			System.out.println("desconectado com sucesso");
			
		}
		catch(SQLException erro) {
			
		}
	}
	public static void main(String[] args) {
		Bd bd = new Bd();
		bd.getConnection();
		bd.close();
		
	}

}
