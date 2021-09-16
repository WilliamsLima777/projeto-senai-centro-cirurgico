
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

import org.senai.dao.PacienteDao;
import org.senai.db.*;
import org.senai.model.Paciente;

@WebServlet("/cadastroServlet")
public class cadastroServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Paciente ObjP = new Paciente();
		
		
		
		

		String acao = req.getParameter("acao");

		if (acao != null && acao.equals("apagar")) {

			ObjP.setId(Integer.parseInt(req.getParameter("id")));

		} else {

			ObjP.setNome(req.getParameter("nome"));
			ObjP.setStatus(req.getParameter("status"));
			ObjP.setLocal(req.getParameter("local"));
			ObjP.setInicioPrevisto(req.getParameter("inicio-previsto"));
			ObjP.setInicioCirurgia(req.getParameter("inicio-cirurgia"));
			ObjP.setSaidaCirurgia(req.getParameter("fim-cirurgia"));
			ObjP.setSaidaPrevisto(req.getParameter("saida-prevista"));
			ObjP.setId(Integer.parseInt(req.getParameter("id")));
		}

		// String nome = req.getParameter("nome");
		// String status = req.getParameter("status");
		// String local = req.getParameter("local");
		// String inicioPrevisto = req.getParameter("inicio-previsto");
		// String inicioCirurgia = req.getParameter("inicio-cirurgia");
		// String saidaPrevisto = req.getParameter("saida-previsto");

		// PrintWriter saida = res.getWriter();

		// saida.println(nome);
		// saida.println(status);
		// saida.println(local);
		// saida.println(inicioPrevisto);
		// saida.println(inicioCirurgia);
		// saida.println(saidaPrevisto);

		PacienteDao objDao = new PacienteDao();

		boolean validar = false;

		if (ObjP.getId() > 0) {

			if (acao != null && acao.equals("apagar")) {
				validar = objDao.apagar(ObjP.getId());

			} else {

				validar = objDao.alterar(ObjP);
			}
		}

		if (validar) {
			res.sendRedirect("listaPaciente.jsp");

		} else {

			PrintWriter saida = res.getWriter();
			saida.println("<html>");
			saida.println("Erro de conexão");
			saida.println("</html>");

		}

	}
}
