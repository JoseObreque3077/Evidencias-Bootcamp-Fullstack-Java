package modelo;

public class Orden {
	private int id;
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private String rut;
	private String direccion;
	private String comuna;
	private Region region;
	private String telefono;
	private Producto producto;
	private String fechaIng;
	private Estado estado;
	private String fechaMod;
	private String observaciones;
	
	public Orden(int id, String nombre1, String nombre2, String apellido1, String apellido2, String rut,
			String direccion, String comuna, Region region, String telefono, Producto producto, String fechaIng,
			Estado estado, String fechaMod, String observaciones) {
		this.id = id;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.rut = rut;
		this.direccion = direccion;
		this.comuna = comuna;
		this.region = region;
		this.telefono = telefono;
		this.producto = producto;
		this.fechaIng = fechaIng;
		this.estado = estado;
		this.fechaMod = fechaMod;
		this.observaciones = observaciones;
	}
	
	//Se eliminó el id
	public Orden(String nombre1, String nombre2, String apellido1, String apellido2, String rut,
			String direccion, String comuna, Region region, String telefono, Producto producto, String fechaIng,
			String observaciones) {
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.rut = rut;
		this.direccion = direccion;
		this.comuna = comuna;
		this.region = region;
		this.telefono = telefono;
		this.producto = producto;
		this.fechaIng = fechaIng;
		this.observaciones = observaciones;
		this.fechaMod = fechaIng;
		this.estado = new Estado(1, "Pendiente");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getFechaIng() {
		return fechaIng;
	}

	public void setFechaIng(String fechaIng) {
		this.fechaIng = fechaIng;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getFechaMod() {
		return fechaMod;
	}

	public void setFechaMod(String fechaMod) {
		this.fechaMod = fechaMod;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}