package rd.rdevs.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rd.rdevs.dao.ConexaoMySql;
import rd.rdevs.dao.ModuloDAO;
import rd.rdevs.main.Instrutor;

@WebServlet("/modulos")
public class ModulosTreinamentoServlet  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ConexaoMySql conexaoMySql = new ConexaoMySql();
		Connection conn = conexaoMySql.obterConexao();
		
		ModuloDAO instrutor = new ModuloDAO(conn);
		List <Instrutor> listaInstrutor = instrutor.consultarModulos();
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("instrutores", listaInstrutor);
		  
		RequestDispatcher rd = req.getRequestDispatcher("/consultar-modulos.jsp");
		rd.forward(req, resp);
	}
	
//  DEIXEI AQUI FORA 	
//	public void service(HttpServletRequest request, HttpServletResponse response){ 
//		RequestDispatcher rd = request.getRequestDispatcher("/consultar-moduloStatico");
//		  try {
//				rd.forward(request,response);
//			} catch (ServletException | IOException e) {
//				e.printStackTrace();
//		}
//	}
	
	
}
