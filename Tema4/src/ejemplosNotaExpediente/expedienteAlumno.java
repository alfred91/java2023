package ejemplosNotaExpediente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class expedienteAlumno {

	//TIPO ENUMERADEO, SOLO PUEDE TOMAR UNO DE ESTOS TRES VALORES
	
	enum Modalidad{FPB,GRADOMEDIO,GRADOSUPERIOR}
	enum Curso{PRIMERO,SEGUNDO}
	enum Sexo{MASCULINO,FEMENINO,NSNC}
	
	//Atributos o propiedades
	
	private Modalidad modalidad;
	private String nombre;
	private String apellidos;
	private LocalDate fechanacimiento;	
	private Curso curso;
	private int identificador; //Se genera en el constructor
	
	public expedienteAlumno(Modalidad modalidad, String nombre, String apellidos, LocalDate fechanacimiento,
			Curso curso) {
		super();
		this.modalidad = modalidad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechanacimiento = fechanacimiento;
		this.curso = curso;
		this.calificaciones=new ArrayList<>(); 	//ESTO SE AÑADE A MANO!!
		this.identificador=1000+expedienteAlumno.numAlumnos++;	//ESTO SE AÑADE A MANO!!
	}


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
	 * @return the fechanacimiento
	 */
	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}

	/**
	 * @param fechanacimiento the fechanacimiento to set
	 */
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
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

	private ArrayList<NotasCurso> calificaciones;
	
	//Atributos static
	
	private static int numAlumnos=0;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("expedienteAlumno [modalidad=");
		builder.append(modalidad);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechanacimiento=");
		builder.append(fechanacimiento);
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
		expedienteAlumno other = (expedienteAlumno) obj;
		return Objects.equals(apellidos, other.apellidos) && identificador == other.identificador
				&& Objects.equals(nombre, other.nombre);
	}
	/**
	 * @return the modalidad
	 */
	public int getEdad() {
		if (this.getEdad()>=18 && (LocalDate.now().getMonthValue()>this.getFechanacimiento().getMonthValue())) {
			
		return LocalDate.now().getYear() - this.fechanacimiento.getYear();
				} else {return LocalDate.now().getYear() - this.fechanacimiento.getYear()-1;
										
			}
		}
				
	public boolean mayorEdad() {
		if (this.getEdad()>=18 && (LocalDate.now().getMonthValue()>this.getFechanacimiento().getMonthValue()))
			return true;
				else return false;
	}
	
	// SI ESTA EN CFGM O CFGS TITULA SI TIENE TOSAS APROBADAS
	// SI ESTA EN FPB TITULA CON MAXIMO UNA SUSPENSA	
	
	public boolean titula() {
		
		if(this.modalidad ==modalidad.GRADOMEDIO || this.modalidad == modalidad.GRADOSUPERIOR) {
			if (numSuspensas==0)
				return true;
			else return false;}
		else { if numSuspens
		
			//RECORRER LAS CALIFICACIONES Y VER SI HAY ALGUNO SUSPENSO
			boolean titula=true;
			for (NotasCurso nc:this.calificaciones) {
				if (!nc.estaAprobado())
					titula=false;
			}
			return titula;
			
		} else {
			
			int contadorSuspensas=0;
				for(NotasCurso nc:this.calificaciones) {
					if (!nc.estaAprobado())
						contadorSuspensas++;
			}
				if(contadorSuspensas <=1)
					return true;
				else return false;
		}
	}
	
	public int getNumSuspensas() {
		
		int contadorSuspensas=0;
		for(NotasCurso nc:this.calificaciones) {
			if (!nc.estaAprobado())
				contadorSuspensas++;
	}
		return contadorSuspensas;
	}
	
	
	public double mediaExpediente() {
		double acumulador=0;
		for (NotasCurso nc: this.calificaciones) {
			acumulador = acumulador + nc.getNotafinal();
		}
		return acumulador/this.calificaciones.size();
	}
	//Añade nota de curso a las calificaciones
	public void addNota(NotasCurso nc) {
		this.calificaciones.add(nc);
	}
	
}