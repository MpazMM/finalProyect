package hibernate.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "TB_PERSONA_PR")
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String nombre;
	private String apellidos;
	private String dni;
	private String genero;
	private String tipoSuscripcion;

	
	public Persona(){
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
		return "Persona [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (dni != null ? "dni=" + dni + ", " : "")
				+ (genero != null ? "genero=" + genero + ", " : "")
				+ (tipoSuscripcion != null ? "tipoSuscripcion=" + tipoSuscripcion : "") + "]";
	}
	
	
}
