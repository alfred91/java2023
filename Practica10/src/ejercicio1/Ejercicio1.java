package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/**
		 * public abstract class Vehiculo {
			private int peso;
			public final void setPeso(int p) { peso = p; }
			public abstract int getVelocidadActual();
			}
			
			 ¿Podrá tener descendencia esta clase?
			 ¿Se pueden sobreescribir todos sus métodos?
			Razona tus respuestas.
			
			
			
			 La clase Vehiculo es abstracta por lo que si puede tener descendencia.
			 
			 setPeso es un metodo del tipo final, por lo que no se puede modificar
			 
			 getVelocidadActual si se puede sobreescribir, Se ha declarado como abstracto  en la clase abstracta
			 Esto significa que no hay implementación concreta proporcionada para este método en la clase Vehiculo. En cambio,
			 cada subclase que extienda la clase Vehiculo debe proporcionar su propia implementación concreta para este método.
			 
			
			**/
	}

}
