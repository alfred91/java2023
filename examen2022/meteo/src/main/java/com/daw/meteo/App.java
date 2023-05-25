package com.daw.meteo;

import com.daw.meteo.io.MeteoFile;
import com.daw.meteo.servicio.ServicioGeneralMeteorologico;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServicioGeneralMeteorologico sgm = MeteoFile.cargarCSV();
        sgm.getNumRegistros().forEach( (k,v) -> System.out.println(k + ": " + v));
        
        sgm.getTempPorComunidad("Galicia").forEach( c -> System.out.println(c));
    }
}
