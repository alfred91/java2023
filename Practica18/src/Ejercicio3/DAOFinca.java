package Ejercicio3;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class DAOFinca {
	
	private ArrayList<Finca> fincas;
	
	public DAOFinca(ArrayList<Finca> fincas) {
		
		super();		
		this.fincas = fincas;
	}

	/**
	 * @return the fincas
	 */
	public ArrayList<Finca> getFincas() {
		return fincas;
	}

	/**
	 * @param fincas the fincas to set
	 */
	public void setFincas(ArrayList<Finca> fincas) {
		this.fincas = fincas;
	}

	public void cargarDatos() {
		
		String csvFile="C:\\Users\\Apache\\eclipse-workspace\\Practica18\\src\\Ejercicio3\\fincas.csv";
		String line="";
		String csvSplitBy=",";
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
		    br.readLine();
		    
		    while ((line = br.readLine()) != null) {
		    	
		        String[] datos = line.split(csvSplitBy);
		        int id = Integer.parseInt(datos[0]);
		        String nombre = datos[1];
		        double longitud = Double.parseDouble(datos[2]);
		        double latitud = Double.parseDouble(datos[3]);
		        double superficie = Double.parseDouble(datos[4]);
		        String localidad = datos[5];
		        String provincia = datos[6];
		        
		        Finca finca = new Finca(id, nombre, longitud, latitud, superficie, localidad, provincia);
		        
		        fincas.add(finca);
		    }
		} catch (IOException e) {
		    System.out.println("Error al cargar los datos: " + e.getMessage());
		}
	}
	
	
	public Finca findById(int id) {
		
		for (Finca finca : fincas) {
			
		
			if (finca.getId()==id) {
				return finca;
			}
			
		} return null;
	}
	
	
	public void addFinca(Finca f) {
		
		fincas.add(f);
	}
	
	
	public void deleteFinca(Finca f) {
		fincas.remove(f);
	}
	
	
	Finca findByname(String nombre) {
		
		for (Finca finca : fincas) {
			if (finca.getNombre().equalsIgnoreCase(nombre)) {
				return finca;
			}
		} return null;
		
		
	}  
	
	public List<Finca> getFincasPorSuperficie() {
       
		return fincas.stream()
				.sorted(Comparator.comparingDouble(Finca::getSuperficie))
				.collect(Collectors.toList());
    }
	
	
	public List<Finca> getMasGrandes(){
		return fincas.stream()
				.sorted(Comparator.comparingDouble(Finca::getSuperficie).reversed())
				.limit(3)
				.collect(Collectors.toList());
		}
	
	
	public Map<String, List<Finca>> getFincasPorCiudad() {
		return fincas.stream()
				.collect(Collectors.groupingBy(Finca::getLocalidad));
	}
	
	public List <String> getFincasMedio(){
		return fincas.stream()
				.filter(finca -> finca.getSuperficie() >= 50 && finca.getSuperficie() <= 150)
				.map(Finca::getNombre)
				.collect(Collectors.toList());
	}
}