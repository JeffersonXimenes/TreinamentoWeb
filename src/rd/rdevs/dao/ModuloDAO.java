package rd.rdevs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.Response;

import rd.rdevs.main.Instrutor;

public class ModuloDAO {
	Connection conn;
	
	
	public ModuloDAO(Connection conn) {
		this.conn = conn;
	}
	
	public List<Instrutor> consultarModulos() {
		
		List<Instrutor> listarInstrutor = new ArrayList();
		
		try( Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT * FROM tb_modulo");) {
				
			while (rs.next()) {
				Instrutor i1 = new Instrutor();
				 
				i1.setNomeModulo(rs.getString("ds_nome"));
				i1.setInstrutorTitular(rs.getString("ds_instrutor_titular"));
				i1.setInstrutorAuxiliar(rs.getString("ds_instrutor_auxiliar"));
				i1.setDtInicio(rs.getDate("dt_inicio"));
				
				listarInstrutor.add(i1);	
			}	
		conn.close();
		} catch (Exception e) {
			System.out.println("ERRO" + e);
		}
		return listarInstrutor;	 	
		
	}
	
}
