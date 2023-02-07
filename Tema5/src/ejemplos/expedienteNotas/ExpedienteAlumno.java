package ejemplos.expedienteNotas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class ExpedienteAlumno {

	//Tipo enumerado: solo puede tomar alguno de esos tres valores
	enum Modalidad {FPB, GRADOMEDIO, GRADOSUPERIOR}
	enum Curso {PRIMERO, SEGUNDO}
	enum Sexo {MASCULINO, FEMENINO, OTRO}
	
	//Atributos o propiedades
	private Modalidad modalidad;
	private String nombre;
	private String apellidos;
	private Sexo sexo;
	private LocalDate fechaNacimiento;
	private Curso curso;
	private int identificador; //Se genera en el constructor
	private ArrayList<NotasCurso> calificaciones;
	
	//Atributos static
	private static int numAlumnos = 1;

	public ExpedienteAlumno(Modalidad modalidad, String nombre, String apellidos, Sexo sexo, LocalDate fechaNacimiento,
			Curso curso) {
		super();
		this.modalidad = modalidad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.curso = curso;
		this.calificaciones = new ArrayList<>();
		this.identificador = 10000 + ExpedienteAlumno.numAlumnos++;
	}

	/**
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}

	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @return the calificaciones
	 */
	public ArrayList<NotasCurso> getCalificaciones() {
		return calificaciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExpedienteAlumno [modalidad=");
		builder.append(modalidad);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", identificador=");
		builder.append(identificador);
		builder.append(", calificaciones=");
		builder.append(calificaciones);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, identificador, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExpedienteAlumno other = (ExpedienteAlumno) obj;
		return Objects.equals(apellidos, other.apellidos) && identificador == other.identificador
				&& Objects.equals(nombre, other.nombre);
	}
	
	
	public int getEdad() {
		if ((LocalDate.now().getMonthValue() > this.getFechaNacimiento().getMonthValue())) {
			return  LocalDate.now().getYear() - this.fechaNacimiento.getYear();
		} else {
			return  LocalDate.now().getYear() - this.fechaNacimiento.getYear() - 1;	
		}
		
	}
	
	public boolean mayorEdad() {
		if (this.getEdad() > 18)
			return true;
		
		if ((this.getEdad() == 18) && (LocalDate.now().getMonthValue() >= this.getFechaNacimiento().getMonthValue()))
			return true;
		else
			return false;
	}
	
	
	/**
	 * Si está en GRADOMEDIO o SUPERIOR titula si tiene todas sus calificaciones aprobadas.
	 * Si está en FPB titula aunque tenga una suspensa
	 * @return
	 */
	public boolean titula() {
		
		int numSuspensas = this.getNumSuspensas();
		
		if (this.modalidad == Modalidad.GRADOMEDIO || this.modalidad == Modalidad.GRADOSUPERIOR) {
			if (numSuspensas == 0)
				return true;
			else
				return false;
			
		} else {
			//FPB
			if (numSuspensas <= 1)
				return true;
			else
				return false;
				
		}
		
		
	}
	
	/**
	 * Devuelve el número de asignaturas suspensas
	 * @return
	 */
	public int getNumSuspensas() {
		int contadorSuspensas=0;
		for(NotasCurso nc: this.calificaciones) {
			if (!nc.estaAprobado())
				contadorSuspensas++;
		}
		return contadorSuspensas;
	}
	
	
	/**
	 * Sumar todas las notas finales de tus calificaciones y dividirla entre el número de asignaturas
	 * @return
	 */
	public double mediaExpediente() {
		double acumulador = 0;
		for(NotasCurso nc: this.calificaciones) {
			acumulador = acumulador + nc.getNotaFinal();
		}
		
		return acumulador / this.calificaciones.size();
	}
	
	
	/**
	 * Añade una nueva NotasCurso a las calificaciones
	 * Comprobar que la asignatura y el curso no estén ya en el expediente
	 * @param nc
	 */
	public void addNota(NotasCurso nc) {
		
		//Buscar el objeto NotasCurso con la misma asignatura y curso (equals de NotasCurso)
		int posicion = this.calificaciones.indexOf(nc);
		
		//Encontrado si posicion >= 0
		if (posicion >= 0) {
			System.out.println("Ya está " + nc.getAsignatura());
			
			//1. Eliminar la que hay en el ArrayList y añadir la nueva
			/*
			this.calificaciones.remove(posicion);
			this.calificaciones.add(nc);
			*/

			//2. Modificar el elemento que está en la posicion encontrada
			this.calificaciones.set(posicion, nc);
			
			//3. Sacar el objeto NotasCurso, y modificar nota1Ev, nota2Ev, nota3Ev
			/*
			NotasCurso encontrada = this.calificaciones.get(posicion);
			encontrada.setNota1EV(nc.getNota1EV());
			encontrada.setNota2EV(nc.getNota2EV());
			encontrada.setNota3EV(nc.getNota3EV());
			*/
			
		} else {
			this.calificaciones.add(nc);
		}
		
		
	}
	
	
	
	
	
}
