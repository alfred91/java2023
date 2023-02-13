package ejemplos.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class EjemploDateTimeFormatter {

	public static void main(String[] args) {
		
		//DateTimeFormatter sirve para indicar qué formato tendrá una LocalDate, LocalTime o LocalDateTime
		
		//El método "format" de LocalDate,LocalTime y LocalDateTime devuelve un String con la fecha en el formato indicado
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/y");
		LocalDate fecha1 = LocalDate.now();
		System.out.println(  fecha1.format(dtf));
		
		//El método parse crea un LocalDate, LocalTime, LocalDateTime pasando un String y un formato
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
		LocalDateTime fechaHora1 = LocalDateTime.parse("20:52:33 09-02-2023", dtf2);
		System.out.println(fechaHora1);
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d - M - y");
		LocalDate fechaPrueba = LocalDate.parse("9 - 2 - 2023", dtf3);
		System.out.println(fechaPrueba);
		
		
		
		//---------------------------------------------------------------------------------------------------
		
		//Zonas horarias - Esto no entra es solo por curiosidad
		ZonedDateTime zonedDateTime = fechaHora1.atZone(ZoneId.of("Europe/Madrid"));
		System.out.println(zonedDateTime);
		System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("America/Argentina/Buenos_Aires")));		
		System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")));

		//Localizar las fechas (meses) - no entra
		Locale loc = Locale.of("ja", "JP");
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL )
                								.withLocale( loc ) ;
		System.out.println( fechaHora1.format(f) );
		
		/**
		 * 
u 	year 	year 	2004; 04
y 	year-of-era 	year 	2004; 04
D 	day-of-year 	number 	189
M/L 	month-of-year 	number/text 	7; 07; Jul; July; J
d 	day-of-month 	number 	10
Y 	week-based-year 	year 	1996; 96
w 	week-of-week-based-year 	number 	27
W 	week-of-month 	number 	4
E 	day-of-week 	text 	Tue; Tuesday; T
e/c 	localized day-of-week 	number/text 	2; 02; Tue; Tuesday; T
a 	am-pm-of-day 	text 	PM
B 	period-of-day 	text 	in the morning
h 	clock-hour-of-am-pm (1-12) 	number 	12
K 	hour-of-am-pm (0-11) 	number 	0
k 	clock-hour-of-day (1-24) 	number 	24
H 	hour-of-day (0-23) 	number 	0
m 	minute-of-hour 	number 	30
s 	second-of-minute 	number 	55
A 	milli-of-day 	number 	1234

		 * 
		 */

	}

}
