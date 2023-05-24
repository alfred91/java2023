package Ejercicio3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class DAOLectura {
	
private Set<Lectura>lecturas;


	/**
 * @return the lecturas
 */
public HashSet<Lectura> getLecturas() {
	
	return new HashSet<>(lecturas); // DEVUELVE UNA COPIA DE LA COLECCION
}


/**
 * @param lecturas the lecturas to set
 */
public void setLecturas(HashSet<Lectura> lecturas) {
	this.lecturas = lecturas;
}


	public DAOLectura() {
		
		super();
		this.lecturas=new HashSet<>();
		cargarDatos();
	}

	
    private void cargarDatos() {
    	
        Path csvFile = Paths.get("lecturas.csv");
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = Files.newBufferedReader(csvFile)) {
            br.readLine(); // Leer la primera línea y descartarla

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(csvSplitBy);

                int idFinca = Integer.parseInt(datos[0].trim());

                DAOFinca daoFinca = new DAOFinca(new ArrayList<>());
                Finca finca = daoFinca.findById(idFinca);

                if (finca != null) {
                    Lectura lectura = new Lectura(finca);
                    lecturas.add(lectura);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }
	
	
    public void grabarDatos() {
    	
        Path csvFile = Paths.get("lecturas1.csv");

        try (BufferedWriter bw = Files.newBufferedWriter(csvFile)) {
            bw.write("idFinca \n");

            for (Lectura lectura : lecturas) {
                int idFinca = lectura.getFinca().getId();
                bw.write(idFinca + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos " + e.getMessage());
        }
    }
		
		
		   public void addLectura(Lectura l) {
		        lecturas.add(l);
		    }

		   
		    public void deleteLectura(Lectura l) {
		        lecturas.remove(l);
		    }
		    
		    
		    //DEVUELVE LAS LECTURAS ORDENADAS POR ID FINCA 	
		    
			public Map<Integer, List<Lectura>> getLecturasPorFinca() {
		        return lecturas.stream()
		                .collect(Collectors.groupingBy(lectura -> lectura.getFinca().getId()));
		    }
		    
			
		    //DEVUELVE LA TEMP. MAXIMA DE TODAS LAS LECTURAS DE UNA FINCA
			
			public double getTempMaximaFinca(int id) {
				
				return lecturas.stream()
						.filter(lectura -> lectura.getFinca().getId() == id)
						.mapToDouble(Lectura::getTemperatura)
						.max()
						.orElse(Double.NaN);
			}
		    
			
		    //DEVUELVE LA TEMP. MINIMA DE TODAS LAS LECTURAS DE UNA FINCA
			
		    public Double getTempMinimaFinca(int id) {
		    	
		    	return lecturas.stream()
						.filter(lectura -> lectura.getFinca().getId() == id)
						.mapToDouble(Lectura::getTemperatura)
						.min()
						.orElse(Double.NaN);
			}
		    
		    
		    //DEVUELVE LAS HUMEDADES AGRUPADAS POR FINCA
		    
		    public List<Double> getHumedadPorFinca(int id) {
		    	
		    	return lecturas.stream()
						.filter(lectura  -> lectura.getFinca().getId() == id)
						.sorted(Comparator.comparing(Lectura::getId))
						.map(Lectura::getHumedad)
						.collect(Collectors.toList());		    	
		    }
		    
		    
		    //DEVUELVE LAS TEMPERATURAS AGRUPADAS POR FINCA
		    
		    public List<Double> getTemperaturaPorFinca(int id) {
		    	
		    	return lecturas.stream()
						.filter(lectura  -> lectura.getFinca().getId() == id)
						.sorted(Comparator.comparing(Lectura::getId))
						.map(Lectura::getTemperatura)
						.collect(Collectors.toList());		    	
		    }
		    
		    
		    //MUESTRA LAS TEMP. DE UNA FINCA EN UN DIA CONCRETO ORDENADO POR FECHA HORA
		    
		    public List<Double> getTempDiaPorFinca(int id, LocalDate dia) {
		    	
		    	return lecturas.stream()
		    			
		    	        .filter(lectura -> lectura.getFinca().getId() == id &&
		    	        		lectura.getMomento().toLocalDate().equals(dia))
		    	        
		    	        .sorted(Comparator.comparing(Lectura::getMomento))
		    	        .map(Lectura::getTemperatura)
		    	        .collect(Collectors.toList());
		    	}		        
}