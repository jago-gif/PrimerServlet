package cl.aiep.talentodigital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MiPrimerServlet
 */
@WebServlet("/MiPrimerServlet")
public class MiPrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiPrimerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException{
        System.out.println("Bienvenido inicializado");
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("usando get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String nombre = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		out.print("usando post recuperamos el nombre "+nombre+" y el correo "+ correo);
		System.out.println(nombre+correo);
        //String dire = "localhost:8081/MiPrimerFormServlet/index.html";
		//response.sendRedirect("http://"+dire);
		HttpSession session = request.getSession();
		String capturarUser = (String) session.getAttribute("Nombre de usuario");
		String capturePas = (String) session.getAttribute("Clave");
		out.print("el usuario es ="+capturarUser+" la contraseña es "+capturePas);
		
	}
	public void destroy() {
        System.out.println(".........Se a destruido el proyecto.......");
    }
	


}
