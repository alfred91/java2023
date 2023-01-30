package ejemplosNotaExpediente;

import java.util.Objects;

public class NotasCurso {
	
	private String asignatura;
	private String curso;
	private double nota1ev;
	private double nota2ev;
	private double nota3ev;
	private double notafinal;
	
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
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/**
	 * @return the nota1ev
	 */
	public double getNota1ev() {
		return nota1ev;
	}
	/**
	 * @param nota1ev the nota1ev to set
	 */
	public void setNota1ev(double nota1ev) {
		this.nota1ev = nota1ev;
	}
	/**
	 * @return the nota2ev
	 */
	public double getNota2ev() {
		return nota2ev;
	}
	/**
	 * @param nota2ev the nota2ev to set
	 */
	public void setNota2ev(int nota2ev) {
		this.nota2ev = nota2ev;
	}
	/**
	 * @return the nota3ev
	 */
	public double getNota3ev() {
		return nota3ev;
	}
	/**
	 * @param nota3ev the nota3ev to set
	 */
	public void setNota3ev(double nota3ev) {
		this.nota3ev = nota3ev;
	}
	/**
	 * @return the notafinal
	 */
	public double getNotafinal() {
		return notafinal;
	}

	
	
	/**
	 * @param asignatura
	 * @param curso
	 * @param nota1ev
	 * @param nota2ev
	 * @param nota3ev
	 * @param notafinal
	 */
	public NotasCurso(String asignatura, String curso, int nota1ev, int nota2ev, int nota3ev, int notafinal) {
		super();
		this.asignatura = asignatura;
		this.curso = curso;
		this.nota1ev = nota1ev;
		this.nota2ev = nota2ev;
		this.nota3ev = nota3ev;
		this.notafinal = notafinal;
	}
	/**
	 * 
	 */
	public NotasCurso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private double calcularNotaFinal() {
		return (this.nota1ev+this.nota2ev+this.nota3ev)/3;
	}
	@Override
	public int hashCode() {
		return Objects.hash(asignatura, curso, nota1ev, nota2ev, nota3ev);
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
		
		return Objects.equals(asignatura, other.asignatura) && Objects.equals(curso, other.curso)
				&& Double.doubleToLongBits(nota1ev) == Double.doubleToLongBits(other.nota1ev)
				&& Double.doubleToLongBits(nota2ev) == Double.doubleToLongBits(other.nota2ev)
				&& Double.doubleToLongBits(nota3ev) == Double.doubleToLongBits(other.nota3ev);
	}
	
	public boolean estaAprobado() {
		if (this.notafinal>=5)
			return true;
			else return false;
	}
}
