package ejemplosNotaExpediente;

import java.time.LocalDate;

import ejemplosNotaExpediente.expedienteAlumno.Curso;
import ejemplosNotaExpediente.expedienteAlumno.Modalidad;
import ejemplosNotaExpediente.expedienteAlumno.Sexo;

public class Aplicacion {

	public static void main(String[] args) {

		expedienteAlumno ea1 = new expedienteAlumno(Modalidad.GRADOSUPERIOR,"Ataulfo","Roman El_Habibi",Sexo.MASCULINO,LocalDate.of(1991, 12, 01),Curso.PRIMERO);
		
		
	}

}
