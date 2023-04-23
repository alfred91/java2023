package Ejercicio8;

import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        // Creamos dos estudiantes
        Estudiante estudiante1 = new Estudiante("11111111A", "Juan", "García Pérez", LocalDate.of(2000, 5, 15), "Calle Mayor 1", "Madrid", "juangarcia@gmail.com", "123456789");
        Estudiante estudiante2 = new Estudiante("22222222B", "Ana", "López García", LocalDate.of(1999, 10, 25), "Calle Menor 2", "Barcelona", "analg@gmail.com", "987654321");

        // Creamos las notas de los cursos para los dos estudiantes
        NotasCurso notasCurso1 = new NotasCurso(EtapaEducativa.FP_SUPERIOR, "Desarrollo de Aplicaciones Web", 1, new HashMap<>(), 2022);
        notasCurso1.addNota("Programación", 7.5);
        notasCurso1.addNota("Bases de Datos", 9.0);
        notasCurso1.addNota("Entornos de Desarrollo", 8.0);
        notasCurso1.addNota("Lenguaje de Marcas", 6.5);

        NotasCurso notasCurso2 = new NotasCurso(EtapaEducativa.FP_SUPERIOR, "Desarrollo de Aplicaciones Web", 2, new HashMap<>(), 2023);
        notasCurso2.addNota("Programación", 8.0);
        notasCurso2.addNota("Bases de Datos", 8.5);
        notasCurso2.addNota("Entornos de Desarrollo", 7.0);
        notasCurso2.addNota("Lenguaje de Marcas", 7.5);

        // Creamos los expedientes de los dos estudiantes
        Expediente expediente1 = new Expediente(estudiante1, new HashSet<>(Arrays.asList(notasCurso1, notasCurso2)), true);
        Expediente expediente2 = new Expediente(estudiante2, new HashSet<>(), true);

        // Creamos el centro educativo y añadimos los expedientes
        CentroEducativo centroEducativo = new CentroEducativo(new TreeSet<>(Arrays.asList(expediente1, expediente2)), "IES Alameda", "Calle Alameda 3", "Madrid", "912345678", "iesalameda@gmail.com");

        // Buscamos el expediente del estudiante1 y lo mostramos
        Expediente expedienteBuscado = centroEducativo.buscarExpediente("11111111A");
        System.out.println(expedienteBuscado);
        expedienteBuscado.mostrarNotas(1, EtapaEducativa.FP_SUPERIOR.toString());
    }
}
