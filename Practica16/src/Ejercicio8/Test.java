package Ejercicio8;

public class Test {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("11111111A", "Juan", "García Pérez","Calle Mayor 1", "Madrid", "juangarcia@gmail.com", "123456789", null);
        Estudiante estudiante2 = new Estudiante("22222222B", "Ana", "López García", "Calle Menor 2", "Barcelona", "analg@gmail.com", "987654321", null);


        NotasCurso notasCurso1 = new NotasCurso("Fp Superior", "IES Cura Valera", 2, 2023);
        notasCurso1.addNota("Programación", 7.5);
        notasCurso1.addNota("Bases de Datos", 9.0);
        notasCurso1.addNota("Entornos de Desarrollo", 8.0);
        notasCurso1.addNota("Lenguaje de Marcas", 6.5);

        NotasCurso notasCurso2 = new NotasCurso("Fp Medio", "IES Jaroso", 1, 2022);
        notasCurso2.addNota("Programación", 8.0);
        notasCurso2.addNota("Bases de Datos", 8.5);
        notasCurso2.addNota("Entornos de Desarrollo", 7.0);
        notasCurso2.addNota("Lenguaje de Marcas", 7.5);

        Expediente expediente1 = new Expediente(estudiante1);
        Expediente expediente2 = new Expediente(estudiante2);

        Expediente expedienteBuscado = CentroEducativo.buscarExpediente("11111111A");
        System.out.println(expedienteBuscado);
        expedienteBuscado.mostrarNotas(1, "FP_SUPERIOR");
    }
}