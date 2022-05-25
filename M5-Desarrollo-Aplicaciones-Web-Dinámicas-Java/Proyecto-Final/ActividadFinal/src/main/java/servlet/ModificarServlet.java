package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EstadoService;
import service.OrdenService;

/**
 * Servlet implementation class ModificarServlet
 */
@WebServlet("/ModificarServlet")
public class ModificarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idOrdenMod"));
		OrdenService registroOrden = new OrdenService();
		EstadoService registroEstado = new EstadoService();
		request.getSession().setAttribute("estados", registroEstado.listar());
		request.getSession().setAttribute("editar", registroOrden.buscar(id));
		response.sendRedirect("/ActividadFinal/jsp/formularioMod.jsp");
	}

}
