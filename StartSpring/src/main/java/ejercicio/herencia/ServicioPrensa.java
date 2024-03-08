package ejercicio.herencia;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("servicioPrensa")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServicioPrensa {
	
	private List<String> periodicos;

	/**
	 * 
	 */
	public ServicioPrensa() {
		super();
	}

	/**
	 * @param periodicos
	 */
	public ServicioPrensa(List<String> periodicos) {
		super();
		this.periodicos = periodicos;
	}

	public List<String> getPeriodicos() {
		return periodicos;
	}

	public void setPeriodicos(List<String> periodicos) {
		this.periodicos = periodicos;
	}
	
	
	@Override
	public String toString() {
		return "ServicioPrensa [" + (periodicos != null ? "periodicos=" + periodicos : "") + "]";
	}

	
	
//	public void leerPeriodico(int periodicoElegido) {
//		periodicoElegido = solicitarLectura();
//		System.out.println("Leyendo " + periodicos.get(periodicoElegido));
//	}
}
