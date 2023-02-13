package ejemplos.LocalDate;

import java.time.LocalTime;

public class EjemploLocalTime {

	public static void main(String[] args) {// TODO Auto-generated method stub

		//Crear hora pasándole los datos por separado
		LocalTime hora1 = LocalTime.of(21, 30, 30);
		
		//Crear hora actual
		LocalTime hora2 = LocalTime.now();
		
		//Crear hora pasando un string HH:MM:SS
		LocalTime hora3 = LocalTime.parse("22:21:20");			
		
		System.out.println(hora1);
		System.out.println(hora2);
		System.out.println(hora3);
		
		//Mostrar información de una hora concreta
		System.out.println( hora2.getHour() );    	//Horas
		System.out.println( hora2.getMinute() );	//Minutos
		System.out.println( hora2.getSecond() );	//Segundos
		System.out.println( hora2.getNano() );		//Nanosegundos
		System.out.println( hora2.toSecondOfDay() );//Segundos transcurridos en el día de hoy hasta esa hora 

		//Si una hora es anterior a otra
		System.out.println( hora2.isAfter(hora3) );
		System.out.println( hora2.isBefore(hora1) );
		
		//Sumar o restar una parte a una hora - minusHours, minusMinutes, minusSeconds, plusHours, plusMinutes, plusSeconds
		System.out.println( hora2.minusHours(2) );
		System.out.println( hora2.minusMinutes(10) );
		System.out.println( hora2.minusSeconds(40) );
		System.out.println( hora2.plusHours(5) );
		
		//Cambiar una parte de la hora. withHour, withMinute, withSecond
		System.out.println( hora2.withMinute(33) );

		
	}

}
