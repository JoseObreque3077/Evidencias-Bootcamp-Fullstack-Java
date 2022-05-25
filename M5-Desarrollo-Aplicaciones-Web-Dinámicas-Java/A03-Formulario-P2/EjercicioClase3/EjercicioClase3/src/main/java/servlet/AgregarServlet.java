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
		//Se recupera la lista de la sesión
		List<Vehiculo> lista = (List<Vehiculo>) request.getSession().getAttribute("llave");
		//Si la lista existe (distinto de null) entonces se agrega la lista de vehículos al registro
		if (lista != null) {
			registro.setLista(lista);
		}
		//Se envía de vuelta la lista actualizada
		request.getSession().setAttribute("llave", registro.getLista());
		//Se muestra la página resumen
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
		//Recupera una lista de vehículos desde la sesión actual
		List<Vehiculo> lista = (List<Vehiculo>) request.getSession().getAttribute("llave");
		//Si la lista existe (distinto de null) entonces se agrega la lista de vehículos al registro
		if (lista != null) {
			registro.setLista(lista);
		}
		
		//Si es posible agregar el vehículo a la lista dentro del registro, entonces...
		if (registro.agregarVehiculo(v)) {
			//Se envía de vuelta la lista actualizada
			request.getSession().setAttribute("llave", registro.getLista());
			//Se muestra la página resumen
			response.sendRedirect("/EjercicioClase3/resumen.jsp");
		}
		else {
			/*
			 * Si no se puede añadir el vehículo a la lista (patente duplicada)
			 * se envía un mensaje de error y se muestra nuevamente el formulario
			 */
			request.getSession().setAttribute("error", "La patente ya se encuentra registrada.");
			response.sendRedirect("/EjercicioClase3/index.jsp");
		}
		
	}

}
