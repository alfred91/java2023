package ejemplos.LocalDate;

import java.time.LocalDate;

public class EjemploLocalDate {

	
	public static void main(String[] args) {
		
		//Crear fecha pasándole año, mes, día
		LocalDate fecha1 = LocalDate.of(2000, 10, 10);
		
		//Crear fecha con el día de hoy
		LocalDate fecha2 = LocalDate.now();
		
		//Crear fecha como un String
		LocalDate fecha3 = LocalDate.parse("2023-03-01"); //El formato se debe dar en inglés YYYY-MM-DD
		
		System.out.println(fecha1);
		System.out.println(fecha2);
		System.out.println(fecha3);
		
		//Mostrar la información separada para una fecha
		System.out.println( fecha2.getYear() ); //Año
		System.out.println( fecha2.getMonth() ); //Mes devuelto como String en inglés
		System.out.println( fecha2.getMonthValue() ); //Mes devuelto como número (1 - Enero, 2 - Febrero, ...)
		System.out.println( fecha2.getDayOfMonth() ); //Día del mes
		System.out.println( fecha2.lengthOfMonth() ); //Días que tiene el mes de esa fecha
		System.out.println( fecha2.getDayOfWeek() );  //Día de la semana en inglés
		System.out.println( fecha2.isLeapYear() ); //Si esa fecha corresponde a un año bisiesto
		System.out.println( fecha2.isAfter(fecha1) ); //Si una fecha es posterior a otra. "isBefore" para anterior
		System.out.println( fecha3.isBefore(fecha2) );
		
		//Sumarle o restarle días o meses a una fecha
		System.out.println( fecha2.minusDays(2) );
		System.out.println( fecha2.minusMonths(3) );
		System.out.println( fecha2.minusYears(2) );
		System.out.println( fecha2.minusYears(2).getDayOfWeek() );
		
		LocalDate cumpleM = LocalDate.of(1999, 7, 10);
		System.out.println( cumpleM.plusYears(6).getDayOfWeek() );
		/*
		System.out.println( fecha2.plusDays(2) );
		System.out.println( fecha2.plusMonths(3) );
		System.out.println( fecha2.plusYears(2) );
		System.out.println( fecha2.plusYears(2).getDayOfWeek() );
		*/
		
		//Cambiar una parte de la fecha, el día, el mes o el año
		System.out.println( fecha2.withYear(2035)); //withDayOfMonth, withYear

		
		
		
		
		
	}

}
