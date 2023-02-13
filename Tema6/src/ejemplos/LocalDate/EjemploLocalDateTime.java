package ejemplos.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeParseException;

public class EjemploLocalDateTime {

	public static void main(String[] args) {
		
		//Crear una fecha-hora pasando todos los campos separados: año, mes, día, hora, minuto, segundo
		LocalDateTime fechaHora1 = LocalDateTime.of(2023, Month.DECEMBER, 9, 19, 30, 20);
		
		//Crear una fecha-hora de ahora mismo
		LocalDateTime fechaHora2 = LocalDateTime.now();
		
		//Crear una fecha-hora partiendo de un String con el formato YYYY-MM-DDTHH:MM:SS
		LocalDateTime fechaHora3 = LocalDateTime.parse("2024-06-11T23:55:59");
		
		//Igual pero pasando un formato incorrecto en el String
		try {
			fechaHora3 = LocalDateTime.parse("2024-06/05T22:55:59");
		} catch( DateTimeParseException ex) {
			System.out.println("Formato incorrecto");
		}
		
		//Crear un fecha-hora partiendo de un LocalDate y un LocalTime
		LocalDateTime fechaHora4 = LocalDate.now().atTime(LocalTime.now());
		
		LocalDate fecha = LocalDate.of(2022, 10, 10);
		LocalTime hora = LocalTime.of(22, 10);
		LocalDateTime fechaHora5 = fecha.atTime(hora);
		LocalDateTime fechaHora6 = hora.atDate(fecha);
		
		System.out.println(fechaHora1);
		System.out.println(fechaHora2);
		System.out.println(fechaHora3);
		System.out.println(fechaHora4);
		System.out.println(fechaHora5);
		System.out.println(fechaHora6);
		
		//Tendríamos como en las anteriores todos los métodos .get, .minus, .plus, .with
		System.out.println(fechaHora4.getDayOfMonth());
		System.out.println(fechaHora4.getYear());
		System.out.println(fechaHora4.minusHours(3));
		System.out.println(fechaHora4.plusMonths(4));
		System.out.println(fechaHora4.withSecond(44));
		
		//Si una fecha-hora es anterior o posterior a otra
		System.out.println(fechaHora4.isAfter(fechaHora6));
		System.out.println(fechaHora4.isBefore(fechaHora5));
		
		LocalDateTime fh1 = LocalDateTime.now();
		LocalDateTime fh2 = fh1.plusMinutes(1);
		System.out.println(fh1.isBefore(fh2));
		
	}

}
