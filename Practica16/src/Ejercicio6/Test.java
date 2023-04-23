package Ejercicio6;

public class Test {

	public static void main(String[] args) {
		
		VisitadoTM visitados = new VisitadoTM();
	    
	    visitados.addPais("España");
	    visitados.addCiudad("España", "Madrid");
	    visitados.addCiudad("España", "Barcelona");
	    
	    visitados.addPais("Francia");
	    visitados.addCiudad("Francia", "París");
	    visitados.addCiudad("Francia", "Perpignan");
	    
	    visitados.addPais("Italia");
	    visitados.addCiudad("Italia", "Roma");
	    visitados.addCiudad("Italia", "Florencia");
	    
	    System.out.println("Países visitados:");
	    visitados.mostrarVisitados();
	    
	    System.out.println("¿He visitado París en Francia?");
	    System.out.println(visitados.heVisitado("Francia", "París"));
	    
	    System.out.println("Primeros países hasta antes de Italia:");
	    System.out.println(visitados.primeros("Italia"));
	}

}