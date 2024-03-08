package hibernate.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import hibernate.dao.PersonaDAO;
import hibernate.dao.ServicioPrensaDAO;
import hibernate.entities.Persona;
import hibernate.entities.ServicioPrensa;

public class PersonaCommand implements PersonaDAO, ServicioPrensaDAO {

	//private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	@Autowired
	private ServicioPrensa servicioPrensa;
	
	
	public PersonaCommand(){
		
	}


	public void guardarPersona(Persona persona) {
		template.save(persona);
	}


	public Persona getPersona(String nombre) {
		String query = "from Persona where id = ?";
		return (Persona) template.find(query, nombre).get(0);
	}

	
	public List<String> mostrarPrensa(String tipoSuscripcion){
		List<String> listaEnvio=null;

		if (tipoSuscripcion.equals("Free")) {
			listaEnvio = servicioPrensa.getPeriodicos().subList(0, 1);
		}else if (tipoSuscripcion.equals("Basic")) {
			listaEnvio = servicioPrensa.getPeriodicos().subList(0, servicioPrensa.getPeriodicos().size()/2);
		}else if (tipoSuscripcion.equals("Premium")) {
			listaEnvio = servicioPrensa.getPeriodicos();
		}
		
		return listaEnvio;
	}
	
}
