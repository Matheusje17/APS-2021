package dados;
import java.sql.*;
public class ConexaoBanco {
	
	
	
	public ConexaoBanco(){
		try {
			Conecta();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	public void Conecta() throws ClassNotFoundException {
		String connectionUrl = "jdbc:sqlserver://localhost:1432;databaseName=CasosDengue;user=sa;password=123456";

		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(connectionUrl);
			System.out.println("Foi");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}
		
	}
	
	
	
}
