package Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
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
        for (Finca finca : fincas) {
            System.out.println(finca.getNombre() + ": " + finca.getSuperficie());
        }

        //OBTENER LAS 3 FINCAS MAS GRANDES:
        
        List<Finca> masGrandes = daoFinca.getMasGrandes();
        System.out.println("\nLas 3 fincas mas grandes:");
        for (Finca finca : masGrandes) {
            System.out.println(finca.getNombre() + ": " + finca.getSuperficie());
        }

        
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
        for (String nombre : fincasMedio) {
            System.out.println(nombre);
        }
        
        // Eliminar 5 lecturas
       /** List<Lectura> lecturas = new ArrayList<>(DAOLectura.getLecturas());
        if (lecturas.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Lectura lectura = lecturas.get(i);
                daoLectura.deleteLectura(lectura);
            }
        }

        // Guardar los cambios en el archivo CSV
        daoLectura.grabarDatos();*/
    }
}
