package rd.rdevs.main;

import java.sql.Date;

public class Instrutor {
 
	private String nomeModulo;
	private String instrutorTitular;
	private String instrutorAuxiliar;
	private Date dtInicio;
	
	// GET E SETTERS nomeModulo
	public String getNomeModulo() {
		return nomeModulo;
	}
	public void setNomeModulo(String nomeModulo) {
		this.nomeModulo = nomeModulo;
	}
	
	
	// GET E SETTERS INSTRUTOR_TITULAR
	public String getInstrutorTitular() {
		return instrutorTitular;
	}
	public void setInstrutorTitular(String instrutorTitular) {
		this.instrutorTitular = instrutorTitular;
	}
	
	
	// GET E SETTERS INSTRUTOR_AUXILIAR
	public String getInstrutorAuxiliar() {
		return instrutorAuxiliar;
	}
	
	public void setInstrutorAuxiliar(String instrutorAuxiliar) {
		this.instrutorAuxiliar = instrutorAuxiliar;
	}
	
	
	// GET E SETTERS DT_INICIO 
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	
}
