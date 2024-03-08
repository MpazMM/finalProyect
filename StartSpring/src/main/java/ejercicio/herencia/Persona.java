package ejercicio.herencia;

import org.springframework.beans.factory.annotation.Autowired;

import utilidades.Utilidades;

public class Persona {

	/*
	 * private ServicioPrensa Sólo se crea cuando se le necesita y tiene scope
	 * Singleton (lazy)
	 *
	 * Otra clase con: List<String> periodicos; Meter 5-6 periodicos List <String>
	 * mostrarPrensa(String tipoSuscripcion) Muestra los periódicos free (1
	 * periódicos) basic (3 periódicos) premium (6 periódicos) void leerPeriodico
	 * (String periodico) Sysout("leyendo el periodico elegido)
	 * ===================================================================== La
	 * persona método solicitarLectura() Este método va a llamar
	 * ServicioPrensa.mostrarPrensa con el tipo de suscripción de persona
	 * servicioPrensa.mostrarPrensa(String tipoSuscripcion)
	 *
	 * leer (String titulo) servicioPrensa.leerPeriodico(titulo)
	 */
	@Autowired
	private ServicioPrensa servP;

	private String nombre;
	private String apellidos;
	private String dni;
	private String genero;
	private String tipoSuscripcion; // free,basic,premium

	/**
	 * 
	 */
	public Persona() {
		super();
	}

	/**
	 * @param servP
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param genero
	 * @param tipoSuscripcion
	 */
	public Persona(ServicioPrensa servP, String nombre, String apellidos, String dni, String genero,
			String tipoSuscripcion) {
		super();
		this.servP = servP;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.genero = genero;
		this.tipoSuscripcion = tipoSuscripcion;
	}

	public ServicioPrensa getServP() {
		return servP;
	}

	public void setServP(ServicioPrensa servP) {
		this.servP = servP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipoSuscripcion() {
		return tipoSuscripcion;
	}

	public void setTipoSuscripcion(String tipoSuscripcion) {
		this.tipoSuscripcion = tipoSuscripcion;
	}

	@Override
	public String toString() {
		return "Persona [" + (servP != null ? "servP=" + servP + ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (dni != null ? "dni=" + dni + ", " : "")
				+ (genero != null ? "genero=" + genero + ", " : "")
				+ (tipoSuscripcion != null ? "tipoSuscripcion=" + tipoSuscripcion : "") + "]";
	}

	public void mostrarPrensa(String tipoSuscripcion) {
		for (String periodico : servP.getPeriodicos()) {
			System.out.println(periodico);
		}

		solicitarLectura();
	}

	public int solicitarLectura() {
		int periodicoElegido = Utilidades.pideDatoNumerico("Elige una opcion");

		return periodicoElegido;
	}

}
