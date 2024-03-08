package hibernate.dao;

import java.util.List;

import hibernate.entities.Persona;

public interface PersonaDAO {

	public void guardarPersona(Persona persona);
	
	public Persona getPersona(String nombre);
	
	public List<String> mostrarPrensa(String tipoSuscripcion);
		
}
