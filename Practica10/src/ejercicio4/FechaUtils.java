package ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class FechaUtils {
	
	 enum SignosZodiaco { ARIES, TAURO, GEMINIS, CANCER, LEO, VIRGO, LIBRA, ESCORPIO,
	        				SAGITARIO, CAPRICORNIO, ACUARIO, PISCIS }
	 
	 

	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		LocalDateTime hoy = LocalDateTime.now();
		Period p = Period.between(fechaHasta.toLocalDate(), hoy.toLocalDate());
		Duration d = Duration.between(fechaHasta.toLocalTime(), hoy.toLocalTime());
		System.out.println("Han pasado "+p.getYears()+" años "+
									p.getMonths()+" meses "+
									p.getDays()+" dias "+
									d.toHours()+" horas "+
									d.toMinutes()+" minutos "+
									d.toSeconds()+" segundos");
	}
	
	public static void main(String[] args) {
		FechaUtils.cuentaAtras(LocalDateTime.now().minusYears(31).minusMonths(3).
				minusDays(11).minusHours(0).minusMinutes(10), null);

	}
	 public static String diaCumple(LocalDate fechaCumple, int año) {
	        LocalDate fecha = fechaCumple.withYear(año);
	        return fecha.format(DateTimeFormatter.ofPattern("EEEE", new Locale("es")));
	    }
	 
	 public static int numYears(LocalDate fechaCumple) {
	        LocalDate fechaActual = LocalDate.now();
	        Period periodo = Period.between(fechaCumple, fechaActual);
	        return periodo.getYears();
	    }

	    public static String zodiaco(LocalDate fecha) {
	        int dia = fecha.getDayOfMonth();
	        int mes = fecha.getMonthValue();
	        switch (mes) {
	            case 1:
	                if (dia < 21) {
	                    return SignosZodiaco.CAPRICORNIO.name();
	                } else {
	                    return SignosZodiaco.ACUARIO.name();
	                }
	            case 2:
	                if (dia < 20) {
	                    return SignosZodiaco.ACUARIO.name();
	                } else {
	                    return SignosZodiaco.PISCIS.name();
	                }
	            case 3:
	                if (dia < 21) {
	                    return SignosZodiaco.PISCIS.name();
	                } else {
	                    return SignosZodiaco.ARIES.name();
	                }
	            case 4:
	                if (dia < 21) {
	                    return SignosZodiaco.ARIES.name();
	                } else {
	                    return SignosZodiaco.TAURO.name();
	                }
	            case 5:
	                if (dia < 22) {
	                    return SignosZodiaco.TAURO.name();
	                } else {
	                    return SignosZodiaco.GEMINIS.name();
	                }
	            case 6:
	                if (dia < 22) {
	                    return SignosZodiaco.GEMINIS.name();
	                } else {
	                    return SignosZodiaco.CANCER.name();
	                }
	            case 7:
	                if (dia < 23) {
	                    return SignosZodiaco.CANCER.name();
	                } else {
	                    return SignosZodiaco.LEO.name();
	                }
	            case 8:
	                if (dia < 24) {
	                    return SignosZodiaco.LEO.name();
	                } else {
	                    return SignosZodiaco.VIRGO.name();
	                }
	            case 9:
	                if (dia < 24) {
	                    return SignosZodiaco.VIRGO.name();
	                } else {
	                    return SignosZodiaco.LIBRA.name();
	                }
	           case 10:
	                    if (dia < 24) {
	                        return SignosZodiaco.LIBRA.name();
	                    } else {
	                        return SignosZodiaco.ESCORPIO.name();
	                    }
	          case 11:
	                    if (dia < 23) {
	                        return SignosZodiaco.ESCORPIO.name();
	                    } else {
	                        return SignosZodiaco.SAGITARIO.name();
	                    }
	          case 12:
	                    if (dia < 22) {
	                        return SignosZodiaco.SAGITARIO.name();
	                    } else {
	                        return SignosZodiaco.CAPRICORNIO.name();
	                    }
	          default: 		return "";                              
			            
}
	    }
	        public static boolean isIntervalo(LocalDateTime inicio, LocalDateTime fin, LocalDateTime fecha) {
	            return fecha.isEqual(inicio) || fecha.isEqual(fin) || (fecha.isAfter(inicio) && fecha.isBefore(fin));
	       }
 }