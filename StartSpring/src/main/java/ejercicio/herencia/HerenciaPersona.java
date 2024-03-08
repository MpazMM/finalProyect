package ejercicio.herencia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HerenciaPersona {

	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansHerencia.xml");
		
	
		Persona persA=(Persona)context.getBean("p1");
		System.out.println(persA.toString());
		
		Persona persB=(Persona)context.getBean("p2");
		persB.solicitarLectura();
	
		
//		Persona persC=(Persona)context.getBean("generoMasculino");
//		System.out.println(persC);

	}
	
	
}
