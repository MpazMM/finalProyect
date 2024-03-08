package hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hibernate.entities.Persona;
import hibernate.entities.ServicioPrensa;
import hibernate.impl.PersonaCommand;


public class MainApp {

	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("ejercicioDDBB.xml");
		PersonaCommand command=context.getBean("command", PersonaCommand.class);
		Persona persona=new Persona();
		persona.setNombre("Juan");
		persona.setApellidos("Apellidos1");
		persona.setDni("0234456W");
		persona.setGenero("Masculino");
		persona.setTipoSuscripcion("Free");
		command.guardarPersona(persona);
		
//		ServicioPrensa servicioPrensa = (ServicioPrensa)context.getBean("servicioPrensa");
//		System.out.println(servicioPrensa);
		
//		usuario=new Usuario();
//		usuario.setUsuario("Alicia");
//		usuario.setContrasena("root");
//		command.guardarUsuario(usuario);
//		
		Persona usuario2=command.getPersona("Juan");
		command.mostrarPrensa(usuario2.getTipoSuscripcion());
		System.out.println(usuario2);		
		System.out.println(command.mostrarPrensa(usuario2.getTipoSuscripcion()));
//		ServicioPrensa sp=(ServicioPrensa)context.getBean("servicioPrensa");
//	
//		
//		for (String periodico : sp.getPeriodicos()) {
//			System.out.println(periodico);
//		}

//		System.out.println("Contrase�a de "+usuario.getUsuario()+" -> "+usuario.getContrasena());
//		System.out.println("Done.");
	}
}
