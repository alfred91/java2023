package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestFincas {
	
    public static void main(String[] args) {
    	
    	//CREAR EL OBJETO DAOFINCA Y CARGAR LOS DATOS DEL ARCHIVO CSV
    	
        DAOFinca daoFinca = new DAOFinca(new ArrayList<>());
        daoFinca.cargarDatos();

        
        // LLAMAR Y PINTAR LOS METODOS DE LA PARTE 3
        
        List<Finca> fincas = daoFinca.getFincasPorSuperficie();
        System.out.println("Fincas ordenadas por superficie:");
        fincas.stream()
              .forEach(finca -> System.out.println(finca.getNombre() + ": " + finca.getSuperficie()));


        //OBTENER LAS 3 FINCAS MAS GRANDES:
        
        List<Finca> masGrandes = daoFinca.getMasGrandes();
        System.out.println("\nLas 3 fincas mas grandes:");
        masGrandes.stream()
                .forEach(finca -> System.out.println(finca.getNombre() + ": " + finca.getSuperficie()));

        
        //OBTENER LAS FINCAS AGRUPADAS POR CIUDAD
        
        Map<String, List<Finca>> fincasPorCiudad = daoFinca.getFincasPorCiudad();
        System.out.println("\nFincas agrupadas por ciudad:");
        for (Map.Entry<String, List<Finca>> entry : fincasPorCiudad.entrySet()) {
            String ciudad = entry.getKey();
            List<Finca> fincasEnCiudad = entry.getValue();
            System.out.println(ciudad + ": " + fincasEnCiudad.size() + " fincas");
        }

        
        //OBRENER LAS FINCAS CON SUPERFICIE ENTRE 50 Y 150
        
        List<String> fincasMedio = daoFinca.getFincasMedio();
        
        System.out.println("\nFincas con superficie entre 50 y 150:");
        fincasMedio.stream()
                .forEach(System.out::println);
        
        
     //  ELIMINAR 5 LECTURAS
        
        try {
            DAOLectura daoLectura = new DAOLectura(); // Crear una instancia de DAOLectura
            
            List<Lectura> lecturas = new ArrayList<>(daoLectura.getLecturas());
            if (lecturas.size() >= 5) {
                lecturas.stream()
                        .limit(5)
                        .forEach(daoLectura::deleteLectura);
            }
        } catch (Exception e) {
        	
            System.out.println("Error al eliminar las lecturas.");;
            
        }
        
        // GUARDAR CAMBIOS EN EL ARCHIVO CSV
        
        try {
            DAOLectura daoLectura = new DAOLectura(); // Crear una instancia de DAOLectura
            
            daoLectura.grabarDatos();
            
        } catch (Exception e) {
            System.out.println("Error al guardar los cambios.");
        
        }
    }
}
