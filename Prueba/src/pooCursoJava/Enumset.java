package pooCursoJava;
import java.util.EnumSet;

public class Enumset {
	
	enum Colores {
	    ROJO, VERDE, AZUL, AMARILLO, MORADO
	}

	public class EjemploEnumSetContains {
	    public static void main(String[] args) {
	        // Crea un EnumSet con algunos colores
	        EnumSet<Colores> coloresSet = EnumSet.of(Colores.ROJO, Colores.VERDE, Colores.AZUL);

	        // Verifica si el color AMARILLO está presente en el conjunto
	        boolean estaPresente = coloresSet.contains(Colores.AMARILLO);

	        // Imprime el resultado de la verificación
	        System.out.println("¿El color AMARILLO está presente en el conjunto? " + estaPresente);
	    }
	}
}