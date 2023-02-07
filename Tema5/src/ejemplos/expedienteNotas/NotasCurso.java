package ejemplos.expedienteNotas;

import java.util.Objects;

public class NotasCurso {

	private String asignatura;
	private int curso; //1 o 2
	private double nota1EV;
	private double nota2EV;
	private double nota3EV;
	private double notaFinal;
	
	
	public NotasCurso(String asignatura, int curso) {
		super();
		this.asignatura = asignatura;
		this.curso = curso;
		this.nota1EV = 0;
		this.nota2EV = 0;
		this.nota3EV = 0;
		this.notaFinal = 0;
	}


	public NotasCurso(String asignatura, int curso, double nota1ev, double nota2ev, double nota3ev) {
		super();
		this.asignatura = asignatura;
		this.curso = curso;
		this.nota1EV = nota1ev;
		this.nota2EV = nota2ev;
		this.nota3EV = nota3ev;
		this.notaFinal = (this.nota1EV + this.nota2EV + this.nota3EV) / 3;
	}


	/**
	 * @return the asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}


	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}


	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}


	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}


	/**
	 * @return the nota1EV
	 */
	public double getNota1EV() {
		return nota1EV;
	}


	/**
	 * @param nota1ev the nota1EV to set
	 */
	public void setNota1EV(double nota1ev) {
		nota1EV = nota1ev;
		this.calcularNotaFinal();
	}


	/**
	 * @return the nota2EV
	 */
	public double getNota2EV() {
		return nota2EV;
	}


	/**
	 * @param nota2ev the nota2EV to set
	 */
	public void setNota2EV(double nota2ev) {
		nota2EV = nota2ev;
		this.calcularNotaFinal();
	}


	/**
	 * @return the nota3EV
	 */
	public double getNota3EV() {
		return nota3EV;
	}


	/**
	 * @param nota3ev the nota3EV to set
	 */
	public void setNota3EV(double nota3ev) {
		nota3EV = nota3ev;
		this.calcularNotaFinal();
	}


	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		return notaFinal;
	}
	
	
	private void calcularNotaFinal() {
		this.notaFinal = (this.nota1EV + this.nota2EV + this.nota3EV) / 3;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotasCurso [curso=");
		builder.append(curso);
		builder.append(", asignatura=");
		builder.append(asignatura);
		builder.append(", nota1EV=");
		builder.append(nota1EV);
		builder.append(", nota2EV=");
		builder.append(nota2EV);
		builder.append(", nota3EV=");
		builder.append(nota3EV);
		builder.append(", notaFinal=");
		builder.append(notaFinal);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(asignatura, curso, nota1EV, nota2EV, nota3EV);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasCurso other = (NotasCurso) obj;
		return Objects.equals(asignatura, other.asignatura) && curso == other.curso;
	}
	
	
	public boolean estaAprobado() {
		if (this.notaFinal >= 5)
			return true;
		else
			return false;
	}
	
	
	
	
	
}
