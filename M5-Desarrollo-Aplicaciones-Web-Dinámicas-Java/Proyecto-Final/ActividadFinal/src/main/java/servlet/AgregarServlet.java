package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Orden;
import modelo.Producto;
import modelo.Region;
import service.OrdenService;

/**
 * Servlet implementation class AgregarServlet
 */
@WebServlet("/AgregarServlet")
public class AgregarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarServlet() {
        super();
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
		request.setCharacterEncoding("UTF-8");
		//Se extrae el permiso del usuario que ingresó (como String)
		String rolSesion = request.getSession().getAttribute("permiso").toString();
		String rut;
		if (rolSesion.equals("1")) {
			//Se extrae el rut desde el formulario (al tratarse de un tecnico)
			rut = request.getParameter("rut");
		}
		else {
			//Se extrae el rut desde la sesión (al tratarse de un cliente)
			rut = request.getSession().getAttribute("rutLogin").toString();
		}
		//Extraemos info desde el formulario
		String nombre1 = request.getParameter("nombre1");
		String nombre2 = request.getParameter("nombre2");
		String apellido1 = request.getParameter("apellido1").trim();
		String apellido2 = request.getParameter("apellido2").trim();
		String direccion = request.getParameter("direccion").trim();
		String comuna = request.getParameter("comuna");
		int regionId = Integer.parseInt(request.getParameter("region"));
		String telefono = request.getParameter("telefono");
		String fechaIng = request.getParameter("fecha");
		int productoId = Integer.parseInt(request.getParameter("producto"));
		String observaciones = request.getParameter("observaciones").trim();
		
		Region region = new Region(regionId);
		Producto producto = new Producto(productoId);
		
		Orden ord = new Orden(nombre1, nombre2, apellido1, apellido2, rut, direccion, comuna, region, telefono, producto, fechaIng, observaciones);
		OrdenService registro = new OrdenService();
		
		registro.agregar(ord);
		
		response.sendRedirect("/ActividadFinal/jsp/formulario.jsp");
		
	}

}
