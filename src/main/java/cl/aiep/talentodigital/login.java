package cl.aiep.talentodigital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String userDone	= "usuario";
		String pasDone	= "1234";
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("usuario").trim();
		String password = request.getParameter("contraseña").trim();
		if(userName ==null || userName.equals("")||password ==null || password.equals("")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
			requestDispatcher.include(request,response);
		}else if(userName.equals(userDone)&&password.equals(pasDone)) {
			HttpSession session = request.getSession();
			session.setAttribute("Nombre de usuario", userName);
			session.setAttribute("Clave", pasDone);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/MiPrimerServlet");
			requestDispatcher.include(request,response);
			
			
		}
	}

}
