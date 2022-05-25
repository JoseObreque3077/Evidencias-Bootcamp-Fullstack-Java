package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.RegistroVehiculo;
import modelo.Vehiculo;

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegistroVehiculo registro = new RegistroVehiculo();
		request.getSession().setAttribute("llave", registro.listar());
		response.sendRedirect("/EjemploBD/resumen.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String patente = request.getParameter("patente");
		String marca = request.getParameter("marca");
		int anio = Integer.parseInt(request.getParameter("fecha"));
		boolean estado = request.getParameter("estado")!=null?true:false;
		String tipo = request.getParameter("tipo");
		
		Vehiculo v = new Vehiculo(patente, marca, anio, estado, tipo);
		
		RegistroVehiculo registro = new RegistroVehiculo();
		int r = registro.agregar(v);
		if (r != 0) {
			request.getSession().setAttribute("llave", registro.listar());
			response.sendRedirect("/EjemploBD/resumen.jsp");
		}
		else {
			request.getSession().setAttribute("error", "Patente ya registrada");
			response.sendRedirect("/EjemploBD/index.jsp");
		}
	}

}
