package ejemplos.InstantPeriod;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class Duracion {

	public static void main(String[] args) {
		
		Instant inicio = Instant.now();
		
		for(int i=0; i<100000; i++) {
			System.out.println("hola");
		}
		
		Instant fin = Instant.now();
		
		Duration duracion = Duration.between(inicio, fin);
		System.out.println(duracion);
		
		//Duracion para calcular la diferencia entre horas
		LocalTime f1 = LocalTime.of(22,20,20);
		LocalTime f2 = LocalTime.of(23,33, 0);
		
		System.out.println(Duration.between(f1, f2).toMinutes());
		System.out.println(Duration.between(f1, f2).toSeconds());
	}

}