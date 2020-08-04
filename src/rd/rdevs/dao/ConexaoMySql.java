package rd.rdevs.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoMySql {
	private String url = "jdbc:mysql://dev.crurmnllvgn6.us-east-2.rds.amazonaws.com/avaliacao";
	private String usuario = "java";
	private String senha = "1234";
	
	public Connection obterConexao() {	
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, usuario, senha);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return conn;
	}
}
