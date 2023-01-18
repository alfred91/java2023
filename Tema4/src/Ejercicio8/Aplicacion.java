package Ejercicio8;

public class Aplicacion {

	public static void main(String[] args) {
		
		Incidencia inc1 = new Incidencia("Roto el ascensor", "");
		Incidencia inc2 = new Incidencia("Fuga de agua en el quinto b", "");
		
		System.out.println(inc1);
		System.out.println(inc2);
		
		System.out.println(Incidencia.getPendiente());
		
		inc1.setEstado("En proceso");
		inc1.resuelve("Reiniciando");
		inc2.resuelve("Con masilla");
		
		System.out.println(Incidencia.getPendiente());
		
		System.out.println(inc1);
		System.out.println(inc2);

	}

}
