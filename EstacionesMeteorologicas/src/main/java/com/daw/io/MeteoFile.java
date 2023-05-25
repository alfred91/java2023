package com.daw.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.daw.model.EstacionMeteorologica;
import com.daw.model.EstacionMeteorologica.Comunidad;
import com.daw.model.RegistroDatosDia;
import com.daw.service.ServicioGeneralMeteorologico;

public class MeteoFile {

	
	public static ServicioGeneralMeteorologico cargarCSV() {
	    ServicioGeneralMeteorologico sgm = new ServicioGeneralMeteorologico();
	    
	    Path f1 = Paths.get("estaciones.csv");
	    List<String> lineas = null;
	    
	    try {
	        lineas = Files.readAllLines(f1);
	        
	        lineas.stream()
	            .filter(linea -> linea.length() > 0)
	            .map(linea -> {
	                String[] campos = linea.split(",");
	                
	                Comunidad comunidad = Comunidad.valueOf(campos[2]); // Obtener el valor del enumerado Comunidad
	                
	                return new EstacionMeteorologica(
	                    Integer.parseInt(campos[0]),
	                    campos[1],
	                    comunidad, // Utilizar el valor del enumerado obtenido
	                    Double.parseDouble(campos[3]),
	                    Double.parseDouble(campos[4]),
	                    new TreeSet<>(Comparator.comparing(RegistroDatosDia::getFecha))
	                );
	            })
	            .forEach(em -> {
	                try {
	                    sgm.crearEstacion(em);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            });
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
			
	//Leer RegistrosDatosDia	    
	 Path f2 = Paths.get("registros.csv");
	try {
		lineas = Files.readAllLines(f2);	
		
		lineas.stream()
			.filter( linea -> linea.length() > 0) //Para quitar las líneas en blanco que pueda haber al final
			.forEach( linea -> {
				String[] campos = linea.split(",");
				
				//long id, LocalDate fecha, double tempMax, double tempMin, double tempMedia
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				
				RegistroDatosDia rdd = new RegistroDatosDia(Integer.parseInt(campos[0]), LocalDate.parse(campos[1], dtf), Double.parseDouble(campos[2]), Double.parseDouble(campos[3]), Double.parseDouble(campos[4]));
				
				//Sacar de sgm la estación con ese id
				int idEstacion = Integer.parseInt(campos[5]);
				EstacionMeteorologica em = sgm.buscar(idEstacion);
				
				//A la estación añadirle el registro
				em.nuevoRegistro(rdd);			
			});


		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	return sgm;
}
	public static void grabarEstaciones(ServicioGeneralMeteorologico sgm) {
	    Path f1 = Paths.get("estaciones.csv");

	    try {
	        Files.deleteIfExists(f1);
	        Files.createFile(f1);

	        List<String> lineas = sgm.getEstaciones().stream()
	                .map(estacion -> {
	                    StringBuilder sb = new StringBuilder();
	                    sb.append(estacion.getId()).append(",");
	                    sb.append(estacion.getNombre()).append(",");
	                    sb.append(estacion.getComunidad()).append(",");
	                    sb.append(estacion.getLatitud()).append(",");
	                    sb.append(estacion.getLongitud());
	                    return sb.toString();
	                })
	                .collect(Collectors.toList());

	        Files.write(f1, lineas);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void grabarCSV(ServicioGeneralMeteorologico sgm) {
	    grabarEstaciones(sgm);
	    grabarRegistros(sgm);
	}
	
	public static void grabarRegistros(ServicioGeneralMeteorologico sgm) {
	    Path f2 = Paths.get("registros.csv");

	    try {
	        Files.deleteIfExists(f2);
	        Files.createFile(f2);

	        List<String> lineas = sgm.getEstaciones().stream()
	                .flatMap(estacion -> estacion.getRegistros().stream()
	                        .map(registro -> {
	                            StringBuilder sb = new StringBuilder();
	                            sb.append(registro.getId()).append(",");
	                            sb.append(registro.getFecha()).append(",");
	                            sb.append(registro.getTempMax()).append(",");
	                            sb.append(registro.getTempMin()).append(",");
	                            sb.append(registro.getTempMedia()).append(",");
	                            sb.append(estacion.getId());
	                            return sb.toString();
	                        })
	                )
	                .collect(Collectors.toList());

	        Files.write(f2, lineas);
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	}
}