package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Registro;
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
        // TODO Vehiculo-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Se crea un objeto de tipo Registro
		Registro registro = new Registro();
		//Se recupera la lista de la sesi�n
		List<Vehiculo> lista = (List<Vehiculo>) request.getSession().getAttribute("llave");
		//Si la lista existe (distinto de null) entonces se agrega la lista de veh�culos al registro
		if (lista != null) {
			registro.setLista(lista);
		}
		//Se env�a de vuelta la lista actualizada
		request.getSession().setAttribute("llave", registro.getLista());
		//Se muestra la p�gina resumen
		response.sendRedirect("/EjercicioClase3/resumen.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Mediante la request, almacenamos todos los campos llenados en el formulario
		String patente = request.getParameter("patente").toUpperCase();
		String marca = request.getParameter("marca");
		String anioString = request.getParameter("fecha");
		int anio = Integer.parseInt(anioString);
		boolean estado = request.getParameter("estado")!=null?true:false;
		String tipo = request.getParameter("tipoVehiculo");
		
		//Se crea un objeto de clase Vehiculo, con los valores previamente almacenados
		Vehiculo v = new Vehiculo(patente, marca, anio, estado, tipo);
		//Se crea un objeto de clase Registro
		Registro registro = new Registro();
		//Recupera una lista de veh�culos desde la sesi�n actual
		List<Vehiculo> lista = (List<Vehiculo>) request.getSession().getAttribute("llave");
		//Si la lista existe (distinto de null) entonces se agrega la lista de veh�culos al registro
		if (lista != null) {
			registro.setLista(lista);
		}
		
		//Si es posible agregar el veh�culo a la lista dentro del registro, entonces...
		if (registro.agregarVehiculo(v)) {
			//Se env�a de vuelta la lista actualizada
			request.getSession().setAttribute("llave", registro.getLista());
			//Se muestra la p�gina resumen
			response.sendRedirect("/EjercicioClase3/resumen.jsp");
		}
		else {
			/*
			 * Si no se puede a�adir el veh�culo a la lista (patente duplicada)
			 * se env�a un mensaje de error y se muestra nuevamente el formulario
			 */
			request.getSession().setAttribute("error", "La patente ya se encuentra registrada.");
			response.sendRedirect("/EjercicioClase3/index.jsp");
		}
		
	}

}
