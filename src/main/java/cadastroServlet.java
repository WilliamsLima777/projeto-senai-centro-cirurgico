
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.senai.db.*;
import org.senai.model.Paciente;
@WebServlet("/cadastroServlet")
public class cadastroServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException{
		
		Paciente ObjP = new Paciente();
		
		ObjP.setNome(req.getParameter("nome"));
		ObjP.setStatus(req.getParameter("status"));
		ObjP.setLocal(req.getParameter("local"));
		ObjP.setInicioPrevisto(req.getParameter("inicio-previsto"));
		ObjP.setInicioCirurgia(req.getParameter("inicio-cirurgia"));
		ObjP.setSaidaCirurgia(req.getParameter("fim-cirurgia"));
		ObjP.setSaidaPrevisto(req.getParameter("saida-prevista"));
		
	//	String nome = req.getParameter("nome");
	//	String status = req.getParameter("status");
	//	String local = req.getParameter("local");
	//	String inicioPrevisto = req.getParameter("inicio-previsto");
	//	String inicioCirurgia = req.getParameter("inicio-cirurgia");
	//	String saidaPrevisto = req.getParameter("saida-previsto");
		
		
		
		// PrintWriter saida = res.getWriter();
		
		
		
	//	saida.println(nome);
	//	saida.println(status);
	//	saida.println(local);
	//	saida.println(inicioPrevisto);
	//	saida.println(inicioCirurgia);
	//	saida.println(saidaPrevisto);
		
		
		
	try {
		
			Connection cont = conexao.conectar();
			
			if (cont != null) {
			
		
		
	
		//	saida.println("Conexão estabelecida");
			String sql = "insert into paciente (nome, status, sala, inicioprevisto, inicioCirurgia, saidaCirurgia, saidaPrevista)" 
				+ "values ('"+ObjP.getNome()+"','"+ObjP.getStatus()+"','"+ObjP.getLocal()+"','"+ObjP.getInicioPrevisto()+"','"+ObjP.getInicioCirurgia()+"','"+ObjP.getSaidaCirurgia()+"','"+ObjP.getSaidaPrevisto()+"')";
	
	PreparedStatement pst = cont.prepareStatement(sql);
	pst.execute();
	pst.close();
	cont.close();
	
	
	
	
		res.sendRedirect("listaPaciente.jsp");
			}else {	
				PrintWriter saida = res.getWriter();
				saida.println("<html>");
				saida.println("Erro de conexão");
				saida.println("</html>");
			}
 
	} catch (Exception e) {
			
		e.printStackTrace();
		}
			
	
		
		
	}

}
