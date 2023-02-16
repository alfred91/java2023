package ejemplos.InstantPeriod;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Periodo {

	public static void main(String[] args) {
		
		//Periodo para calcular la diferencia entre fechas
		LocalDate fecha1 = LocalDate.of(2022, 1, 1);
		LocalDate fecha2 = LocalDate.now();
		
		Period periodo = Period.between(fecha1, fecha2);
		System.out.println( "Dias "+periodo.getDays() );
		System.out.println( "Meses "+periodo.toTotalMonths() );
		
		//Usando ChronoUnit
		System.out.println("Dias entre fecha 1 y 2 "+ChronoUnit.DAYS.between(fecha1,fecha2) );
		System.out.println("Anios entre fecha 1 y 2 "+ChronoUnit.YEARS.between(fecha1,fecha2) );
		System.out.println("Meses entre fecha 1 y 2 "+ChronoUnit.MONTHS.between(fecha1,fecha2) );
		
		//Usando el método until en LocalDate
		System.out.println(fecha1.until(fecha2, ChronoUnit.DAYS));
		System.out.println(fecha1.until(fecha2, ChronoUnit.YEARS));
	}

}
