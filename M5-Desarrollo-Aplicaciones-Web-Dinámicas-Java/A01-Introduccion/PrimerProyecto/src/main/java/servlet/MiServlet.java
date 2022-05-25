package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/MiServlet")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String nombre = "Orlan";		
//		response.getWriter().append("Bienvenido: ").append(nombre);
		
		//recibe los parametros
		String mensaje = request.getParameter("mensaje");
		//response.getWriter().append("Su mensaje es: ").append(mensaje);
		
		//op 1 - sessions
//		HttpSession session = request.getSession();
//		session.setAttribute("msg", mensaje);
		
		//op 2 - sessions
		request.getSession().setAttribute("msg", mensaje);
		
		//OP1 - redirect
//		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/resumen.jsp");
//		dispatcher.forward(request, response);	
		
		//OP2 - redirect
		response.sendRedirect(request.getContextPath()+"/resumen.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
