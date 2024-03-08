package hibernate.dao;

import java.util.List;

import hibernate.entities.Persona;

public interface ServicioPrensaDAO {
	
	public List<String> mostrarPrensa(String tipoSuscripcion);
		
}
