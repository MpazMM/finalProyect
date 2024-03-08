package hibernate.entities;

import java.util.List;

public class ServicioPrensa {

	private List<String> periodicos;

	
	
	/**
	 * 
	 */
	public ServicioPrensa() {
		super();
		System.out.println("Creando ServicioPrensa");
	}

	public ServicioPrensa(List<String> periodicos) {
		super();
		System.out.println("Creando ServicioPrensa con"+periodicos.size());
		this.periodicos = periodicos;
	}

	/**
	 * @return the periodicos
	 */
	public List<String> getPeriodicos() {
		return periodicos;
	}

	/**
	 * @param periodicos the periodicos to set
	 */
	public void setPeriodicos(List<String> periodicos) {
		this.periodicos = periodicos;
	}

	@Override
	public String toString() {
		return "ServicioPrensa [" + (periodicos != null ? "periodicos=" + periodicos : "") + "]";
	}
	
	
	
}








