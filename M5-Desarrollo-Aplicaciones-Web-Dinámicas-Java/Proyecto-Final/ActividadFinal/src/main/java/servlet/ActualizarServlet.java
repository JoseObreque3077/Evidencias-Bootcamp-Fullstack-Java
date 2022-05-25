package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Estado;
import modelo.Orden;
import modelo.Producto;
import modelo.Region;
import service.EstadoService;
import service.OrdenService;

/**
 * Servlet implementation class ActualizarServlet
 */
@WebServlet("/ActualizarServlet")
public class ActualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarServlet() {
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
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String rut = request.getParameter("rut");
		String nombre1 = request.getParameter("nombre1");
		String nombre2 = request.getParameter("nombre2");
		String apellido1 = request.getParameter("apellido1");
		String apellido2 = request.getParameter("apellido2");
		String direccion = request.getParameter("direccion");
		String comuna = request.getParameter("comuna");
		int regionId = Integer.parseInt(request.getParameter("regionId"));
		String nombreRegion = request.getParameter("region");
		String telefono = request.getParameter("telefono");
		String fechaIng = request.getParameter("fecha");
		int productoId = Integer.parseInt(request.getParameter("productoId"));
		String nombreProducto = request.getParameter("producto");
		int estadoId = Integer.parseInt(request.getParameter("estado"));
		String fechaMod = request.getParameter("fechaMod");
		String observaciones = request.getParameter("observaciones").trim();
		
		EstadoService registroEstado = new EstadoService();
		Estado estado = registroEstado.buscar(estadoId);
		Region region = new Region(regionId, nombreRegion);
		Producto producto = new Producto(productoId, nombreProducto);
		
		Orden orden = new Orden(id, nombre1, nombre2, apellido1, apellido2, rut, direccion, comuna, region, telefono, producto, fechaIng, estado, fechaMod, observaciones);
		
		OrdenService registroOrden = new OrdenService();
		
		int r = registroOrden.modificar(orden);
		
		if (r != 0) {
			request.getSession().setAttribute("listado", registroOrden.listar());
			response.sendRedirect("/ActividadFinal/jsp/resumen.jsp");
		}
		else {
			response.sendRedirect("/ActividadFinal/jsp/formularioMod.jsp");
		}
	}

}
