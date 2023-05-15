package Ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import Ejercicio4.Pais.Continente;
  	
    	public class Test {
    	    public static void main(String[] args) {
    	    	
    	    List<Pais> paises = new ArrayList<Pais>();	
    	    	
    	        // CREAR CUDADES
    	    	
    	        Ciudad madrid = new Ciudad("Madrid", 3223000);
    	        Ciudad barcelona = new Ciudad("Barcelona", 1602000);
    	        Ciudad valencia = new Ciudad("Valencia", 794000);
    	        Ciudad nuevaYork = new Ciudad("Nueva York", 8538000);
    	        Ciudad losAngeles = new Ciudad("Los Angeles", 3976000);
    	        Ciudad chicago = new Ciudad("Chicago", 2716000);
    	        Ciudad tokio = new Ciudad("Tokio", 13930000);
    	        Ciudad osaka = new Ciudad("Osaka", 1949000);
    	        Ciudad kioto = new Ciudad("Kioto", 1475000);
    	        Ciudad sydney = new Ciudad("Sydney", 5028000);
    	        Ciudad melbourne = new Ciudad("Melbourne", 5060000);
    	        Ciudad perth = new Ciudad("Perth", 2052000);
    	        Ciudad rioDeJaneiro = new Ciudad("Río de Janeiro", 6498000);
    	        Ciudad saoPaulo = new Ciudad("Sao Paulo", 12330000);
    	        Ciudad brasilia = new Ciudad("Brasilia", 2886000);
    	        Ciudad hamburg = new Ciudad("Hamburgo", 1841179);
    	        Ciudad munich = new Ciudad("Munich", 1538302);
    	        Ciudad berlin = new Ciudad("Berlin", 1759928);
    	        Ciudad guangzhou = new Ciudad("Guangzhou", 14043500);
    	        Ciudad bombay = new Ciudad("Bombay", 12442373);
    	        Ciudad kolkata = new Ciudad("Kolkata", 14787000);
    	        Ciudad guadalajara = new Ciudad("Guadalajara", 1460148);
    	        Ciudad monterrey = new Ciudad("Monterrey", 1138369);
    	        Ciudad pekin = new Ciudad("Pekin", 21710000);
    	        Ciudad shanghai = new Ciudad("Shanghai", 24150000);
    	        Ciudad nuevaDelhi = new Ciudad("Nueva Delhi", 30771000);
    	        Ciudad ciudadDeMexico = new Ciudad("Ciudad de Mexico", 8918653);
    	        Ciudad paris = new Ciudad("Paris", 8918653);
    	        Ciudad marsella = new Ciudad("Marsella", 8918653);
    	        Ciudad lyon = new Ciudad("Lyon", 8918653);
    	        
    	        
    	        //CREAR PAISES
    	    	Pais espana = new Pais(1, "Espana", Pais.Continente.EUROPA, 505990, 46940000, madrid);
    	        paises.add(espana);
    	        
    	        //AÑADIR CIUDADES AL PAIS
    	        espana.addCiudad(madrid);
    	        espana.addCiudad(barcelona);
    	        espana.addCiudad(valencia);
    	
    	        Pais estadosUnidos = new Pais(2, "Estados Unidos", Pais.Continente.AMERICA, 9834000, 331500000, nuevaYork);
    	        paises.add(estadosUnidos);
    	        
    	        estadosUnidos.addCiudad(nuevaYork);
    	        estadosUnidos.addCiudad(losAngeles);
    	        estadosUnidos.addCiudad(chicago);

    	        Pais japon = new Pais(3, "Japon", Pais.Continente.ASIA, 377972, 126300000, tokio);
    	        paises.add(japon);
    	        
    	        japon.addCiudad(tokio);
    	        japon.addCiudad(osaka);
    	        japon.addCiudad(kioto);

    	        Pais australia = new Pais(4, "Australia", Pais.Continente.OCEANIA, 7692024, 25600000, sydney);
    	        paises.add(australia);
    	        
    	        australia.addCiudad(sydney);
    	        australia.addCiudad(melbourne);
    	        australia.addCiudad(perth);

    	        Pais brasil = new Pais(5, "Brasil", Pais.Continente.AMERICA, 8515767, 213200000, brasilia);
    	        paises.add(brasil);
    	        
    	        brasil.addCiudad(rioDeJaneiro);
    	        brasil.addCiudad(saoPaulo);
    	        brasil.addCiudad(brasilia);
    	        
    	        Pais alemania = new Pais(6, "Alemania", Pais.Continente.EUROPA, 357386, 83149300, berlin);
    	        paises.add(alemania);
    	        
    	        alemania.addCiudad(berlin);
    	        alemania.addCiudad(hamburg);
    	        alemania.addCiudad(munich);

    	        Pais china = new Pais(7, "China", Pais.Continente.ASIA, 9596961, 1404328000, pekin);
    	        paises.add(china);
    	        
    	        china.addCiudad(pekin);
    	        china.addCiudad(shanghai);
    	        china.addCiudad(guangzhou);

    	        Pais india = new Pais(8, "India", Pais.Continente.ASIA, 3287263, 1366417756, nuevaDelhi);
    	        paises.add(india);
    	        
    	        india.addCiudad(nuevaDelhi);
    	        india.addCiudad(bombay);
    	        india.addCiudad(kolkata);

    	        Pais mexico = new Pais(9, "Mexico", Pais.Continente.AMERICA, 1964375, 129166028, ciudadDeMexico);
    	        paises.add(mexico);
    	        
    	        mexico.addCiudad(ciudadDeMexico);
    	        mexico.addCiudad(guadalajara);
    	        mexico.addCiudad(monterrey);
    
    	        Pais francia = new Pais(10, "Francia", Pais.Continente.EUROPA, 357388, 83145300, paris);
    	        paises.add(francia);
    	        
    	        francia.addCiudad(paris);
    	        francia.addCiudad(marsella);
    	        francia.addCiudad(lyon);
    	        
    	   
    	      //MENOR SUPERFICIE
    	        
	        	System.out.println("MENOR SUPERFICIE:");
	            Optional<Pais> paisMenorSuperficie = paises.stream()
	                    .min(Comparator.comparing(Pais::getSuperficie)); 	            
	            System.out.println(paisMenorSuperficie.get().getNombre());
	            System.out.println();
	            
	           //ORDENADOS POR POBLACION DESCENDENTE 
	            
	            System.out.println("ORDENADOS POR POBLACION DESCENDENTE:");
	            paises.stream()
	            .sorted(Comparator.comparing(Pais::getPoblacion).reversed())
	            .forEach(Pais -> System.out.println(Pais.getNombre() + ": " + Pais.getPoblacion()));
	            System.out.println();
            	// 5 PAISES CON MAYOR SUPERFICIE 
	            
	            System.out.println("5 PAISES CON MAYOR SUPERFICIE:");
	 	        paises.stream()
	            .sorted(Comparator.comparingDouble(Pais::getSuperficie).reversed())
	            .limit(5)
	            .forEach(Pais -> System.out.println(Pais.getNombre() + ": " + Pais.getSuperficie()));
	 	       System.out.println();
	 	        //PAISES DE AMERICA ORDENADOS DE MENOR A MAYOR POBLACION
	 	       
	 	       System.out.println("PAISES DE AMERICA ORDENADOS DE MENOR A MAYOR POBLACION:");
	 	       paises.stream()
	 	      .filter(p -> p.getContinente() == Continente.AMERICA)
	 	      .sorted(Comparator.comparingLong(Pais::getPoblacion))
	 	      .forEach(p -> System.out.println(p.getNombre() + ": " + p.getPoblacion()));
	 	       System.out.println();
	 	       
	 	       //CAPITALES DE TODOS LOS PAISES ORDENADAS ALFABETICAMENTE
	 	       
	 	      System.out.println("CAPITALES DE TODOS LOS PAISES ORDENADAS ALFABETICAMENTE:");
	 	      paises.stream()
	 	     .map(Pais::getCapital)
	 	     .sorted(Comparator.comparing(Ciudad::getNombre))
	 	     .forEach(c -> System.out.println(c.getNombre()));
	 	     System.out.println();
	 	      
	 	      //TRES CAPITALES MAS POBLADAS 
	 	      
	 	     System.out.println("LAS TRES CAPITALES MAS POBLADAS:");
	 	     paises.stream()
	 	      .sorted(Comparator.comparing(Pais::getPoblacion).reversed())
	 	      .limit(3)
	 	      .forEach(p -> System.out.println(p.getCapital().getNombre()));
	 	    System.out.println();
	 	     
	 	     
	 	     //CADA CONTINENTE SEGUIDO POR ':' LOS PAISES DE ESE CONTINENTE 
	 	     
	 	    System.out.println("CADA CONTINENTE SEGUIDO POR ':' LOS PAISES DE ESE CONTINENTE: ");
		 	    Map<Continente, List<Pais>> paisesPorContinente = paises.stream()
		 	    .collect(Collectors.groupingBy(Pais::getContinente));
		 	    paisesPorContinente.forEach((k, v) -> {
		 	    System.out.println(k + ":");
		 	    v.forEach(p -> System.out.println("- " + p.getNombre()));
		 	    });	 	    
		 	    System.out.println();
	 	    
    	 	    
    	 	    
    	 	 //SI TODOS LOS PAISES TIENEN MAS DE 20M DE HABITANTES O NO
    	 	    
    	 	   System.out.println("SI TODOS LOS PAISES TIENEN 20M+ DE HABITANTES O NO");
    	 	   boolean vm = paises.stream()
    	 			    .allMatch(p -> p.getPoblacion() > 20000000);
    	 			System.out.println(vm);
    	 			System.out.println();
    	 			
    	 	//MEDIA DE POBLACION DE TODOS LOS PAISES EN CONJUNTO:
    	 			
    	 			System.out.println("MEDIA DE POBLACION DE TODOS LOS PAISES EN CONJUNTO");
    	 			double mediaPoblacion = paises.stream()
    	 				    .mapToLong(Pais::getPoblacion)
    	 				    .average()
    	 				    .getAsDouble();
    	 				System.out.println("Media de poblacion de los países: " + mediaPoblacion);
    	 				System.out.println();
    	 				
    	 	//MUESTRA TODOS LOS CONTINENTES Y CUANTOS PAISES HAS METIDO EN CADA CONTINENTE
    	 				
    	 			System.out.println("MUESTRA TODOS LOS CONTINENTES Y CUANTOS PAISES HAS METIDO EN CADA CONTINENTE");
    	 			paises.stream()
    	 			    .collect(Collectors.groupingBy(Pais::getContinente, Collectors.counting()))
    	 			    .forEach((continente, cantidadPaises) -> System.out.println(continente + ": " + cantidadPaises));
    	 			System.out.println();
    	 	//MUESTRA LOS PAISES ORDENADOS POR SUPERFICIE Y PARA CADA PAIS SUS CIUDADES ORDENADAS POR POBLACION 
    	 			
    	 			System.out.println("MUESTRA LOS PAISES ORDENADOS POR SUPERFICIE Y PARA CADA PAIS SUS CIUDADES ORDENADAS POR POBLACION");
    	 			paises.stream()
    	 		      .sorted(Comparator.comparing(Pais::getSuperficie))
    	 		      .forEach(p -> {
    	 		          System.out.println(p.getNombre() + ":");
    	 		          p.getCiudades().stream()
    	 		                          .sorted(Comparator.comparing(Ciudad::getPoblacion).reversed())
    	 		                          .forEach(c -> System.out.println("\t" + c.getNombre() + " - " + c.getPoblacion()));
    	 		      });
    	 			System.out.println();
    	 			
    	 			
    	 	//MUESTRA CADA PAIS, LA SUMA DE LAS POBLACIONES DE SUS CIUDADES

    	 			System.out.println("MUESTRA CADA PAIS, LA SUMA DE LAS POBLACIONES DE SUS CIUDADES:");
    	 			paises.stream()
    	 		      .forEach(p -> {
    	 		        long sumaPoblaciones = p.getCiudades().stream()
    	 		                                            .mapToLong(Ciudad::getPoblacion)
    	 		                                            .sum();
    	 		          System.out.println(p.getNombre() + ": " + sumaPoblaciones);
    	 		      });
    	 			System.out.println();

    	 	//CAPITAL MAS POBLADA
    	 			
    	 			System.out.println("CAPITAL MAS POBLADA:");
    	 			Ciudad capitalMasPoblada = paises.stream()
                            .map(Pais::getCapital)
                            .max(Comparator.comparing(Ciudad::getPoblacion))
                            .get();
    	 			System.out.println("Capital más poblada: " + capitalMasPoblada.getNombre());

    	 			
    	 	//PAISES ORDENADOS POR DENSIDAD DE POBLACION
    	 			
    	 			List<Pais> paisesOrdenadosPorDensidad = paises.stream()
    	 			        .sorted(Comparator.comparing(Pais::getPoblacion))
    	 			        .collect(Collectors.toList());

    	 			paisesOrdenadosPorDensidad.forEach(p -> System.out.println("- " + p.getNombre() + " (" + p.getPoblacion() + " hab/km²)"));
    	 			System.out.println();
    	 	

    	 			
    	 	//DEVUELVE LA PRIMERA CAPITAL D QUE EMPIECE POR B
    	 			
    	 			System.out.println("DEVUELVE LA PRIMERA CAPITAL QUE EMPIEZE POR 'B':");
    	 			
    	 			Optional<String> primeraCiudadConB = paises.stream()
    	 			        .map(Pais::getCapital)
    	 			        .filter(c -> c.getNombre().startsWith("B"))
    	 			        .map(Ciudad::getNombre)
    	 			        .findFirst();

    	 		    System.out.println(primeraCiudadConB.get());
    	 			
    	 			System.out.println();
    	 			
    	 	//MUESTRA CADA PAIS Y SU CIUDAD MAS POBLADA
    	 			
    	 			System.out.println("PAISES Y SU CIUDAD MAS POBLADA:");

    	 			paises.forEach(p -> {
    	 			    Ciudad ciudadMasPoblada = p.getCiudades().stream()
    	 			            .sorted(Comparator.comparingInt(Ciudad::getPoblacion).reversed())
    	 			            .findFirst()
    	 			            .orElse(null);

    	 			    if (ciudadMasPoblada != null) {
    	 			        System.out.println("- " + p.getNombre() + ": " + ciudadMasPoblada.getNombre() + " (" + ciudadMasPoblada.getPoblacion() + ")");
    	 			    } else {
    	 			        System.out.println("- " + p.getNombre() + ": No se encontró ninguna ciudad");
    	 			    }
    	 			});
    	 			System.out.println();
    	 			
    	 	//MUESTRA LA CIUDAD MAS POBLADA 
    	 	
    	 			System.out.println("CIUDAD MAS POBLADA :");

    	 			Ciudad ciudadMasPoblada = paises.stream()
    	 			        .flatMap(p -> p.getCiudades().stream())
    	 			        .sorted(Comparator.comparingInt(Ciudad::getPoblacion).reversed())
    	 			        .findFirst()
    	 			        .orElse(null);

    	 			if (ciudadMasPoblada != null) {
    	 			    System.out.println(ciudadMasPoblada.getNombre() + " (" + ciudadMasPoblada.getPoblacion() + ")");
    	 			} else {
    	 			    System.out.println("No se encontró ninguna ciudad");
    	 			}

    	 			
    	    
}    	}       