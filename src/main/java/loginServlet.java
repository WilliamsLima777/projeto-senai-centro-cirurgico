
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginservlet")
public class loginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) 
		
		throws ServletException, IOException {
		String loginV = "teste@gmail.com";
		String senhaV = "123";
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		
		
		
		
	}

}
