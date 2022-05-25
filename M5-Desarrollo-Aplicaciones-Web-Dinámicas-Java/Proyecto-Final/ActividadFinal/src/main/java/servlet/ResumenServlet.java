package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OrdenService;

/**
 * Servlet implementation class ResumenServlet
 */
@WebServlet("/ResumenServlet")
public class ResumenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrdenService registro = new OrdenService();
		if (request.getSession().getAttribute("permiso").toString().equals("1")) {
			request.getSession().setAttribute("listado", registro.listar());
		}
		else {
			request.getSession().setAttribute("listado", registro.listar(request.getSession().getAttribute("rutLogin").toString()));
		}
		response.sendRedirect("/ActividadFinal/jsp/resumen.jsp");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
