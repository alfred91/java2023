package ejemplos.expedienteNotas;

import java.util.ArrayList;

public class ExpedientesAcademicosJaroso {

	private ArrayList<ExpedienteAlumno> expedientes;

	public ExpedientesAcademicosJaroso() {
		super();
		this.expedientes = new ArrayList<>();
	}

	/**
	 * @return the expedientes
	 */
	public ArrayList<ExpedienteAlumno> getExpedientes() {
		return expedientes;
	}

	/**
	 * @param expedientes the expedientes to set
	 */
	public void setExpedientes(ArrayList<ExpedienteAlumno> expedientes) {
		this.expedientes = expedientes;
	}
	
	public void nuevoExpediente(ExpedienteAlumno ea) {
		if (this.expedientes.indexOf(ea) < 0) {
			this.expedientes.add(ea);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExpedientesAcademicosJaroso: \n");
		
		for(ExpedienteAlumno ea: this.expedientes) {
			builder.append(ea);
			builder.append("\n");
		}

		return builder.toString();
	}
	
	
	
	
	
	
}
