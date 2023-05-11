package Ejercicio2;
import Ejercicio2.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Genero crimen = new Genero("Crimen");
    private static Genero accion = new Genero("Acción");
    private static Genero cienciaFiccion = new Genero("Ciencia ficción");
    private static Genero mafia = new Genero("Mafia");
    private static Genero drama = new Genero("Drama");

    private static Director ridleyScott = new Director("Ridley Scott");
    private static Director francisFordCoppola = new Director("Francis Ford Coppola");
    private static Director christopherNolan = new Director("Christopher Nolan");
    private static Director martinScorsese = new Director("Martin Scorsese");
    private static Director quentinTarantino = new Director("Quentin Tarantino");

    public static void main(String[] args) {
        List<Pelicula> peliculas = crearPeliculas();
        
        TestPelicula testPelicula = new TestPelicula(peliculas);
        testPelicula.pelisOrdenadasPorAño();
        testPelicula.tituloMasLargo();
        testPelicula.directoresMayúsculas();
        testPelicula.numPelis();
        testPelicula.dramaYMafia();
        testPelicula.filmografías();
        
    }
    public void verPeliculas() {
        for (Pelicula pelicula : pelicula) {
            System.out.println(pelicula.getTitulo() + " (" + pelicula.getAnio() + ")");
            System.out.println("Géneros: " + pelicula.getGeneros());
            System.out.println("Director(es): " + pelicula.getDirectores());
            System.out.println();
        }
    }

    private static List<Pelicula> crearPeliculas() {
        // Crear películas
        Pelicula pulpFiction = new Pelicula("Pulp Fiction", 1994);
        pulpFiction.addGenero(crimen);
        pulpFiction.addDirector(quentinTarantino);
        
        Pelicula reservoirDogs = new Pelicula("Reservoir Dogs", 1992);
        reservoirDogs.addGenero(crimen);
        reservoirDogs.addDirector(quentinTarantino);
        
        Pelicula gladiator = new Pelicula("Gladiator", 2000);
        gladiator.addGenero(accion);
        gladiator.addDirector(ridleyScott);
        
        Pelicula bladeRunner = new Pelicula("Blade Runner", 1982);
        bladeRunner.addGenero(cienciaFiccion);
        bladeRunner.addDirector(ridleyScott);
        
        Pelicula alien = new Pelicula("Alien", 1979);
        alien.addGenero(cienciaFiccion);
        alien.addDirector(ridleyScott);
        
        Pelicula apocalypseNow = new Pelicula("Apocalypse Now", 1979);
        apocalypseNow.addGenero(drama);
        apocalypseNow.addDirector(francisFordCoppola);
        
        Pelicula elPadrino = new Pelicula("El Padrino", 1972);
        elPadrino.addGenero(mafia);
        elPadrino.addDirector(francisFordCoppola);
        
        Pelicula tenet = new Pelicula("Tenet", 2020);
        tenet.addGenero(cienciaFiccion);
        tenet.addDirector(christopherNolan);
        
        Pelicula origen = new Pelicula("Origen", 2010);
        origen.addGenero(cienciaFiccion);
        origen.addDirector(christopherNolan);
        
        Pelicula casino = new Pelicula("Casino", 1995);
        casino.addGenero(mafia);
        casino.addDirector(martinScorsese);
        
        Pelicula goodfellas = new Pelicula("Goodfellas", 1990);
        goodfellas.addGenero(mafia);
        goodfellas.addDirector(martinScorsese);
        
        Pelicula elLoboDeWallStreet = new Pelicula("El lobo de Wall Street", 2013);
        elLoboDeWallStreet.addGenero(crimen);
        elLoboDeWallStreet.addDirector(martinScorsese);

        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(pulpFiction);
        peliculas.add(reservoirDogs);
        peliculas.add(gladiator);
        peliculas.add(bladeRunner);
        peliculas.add(alien);
        peliculas.add(apocalypseNow);
        peliculas.add(elPadrino);
        peliculas.add(tenet);
        peliculas.add(origen);
        peliculas.add(casino);
        peliculas.add(goodfellas);
        peliculas.add(elLoboDeWallStreet);

        TestPelicula testPelicula = new TestPelicula(peliculas);
        testPelicula.pelisOrdenadasPorAño();
        testPelicula.tituloMasLargo();
        testPelicula.directoresMayúsculas();
        testPelicula.numPelis();
        testPelicula.dramaYMafia();
        testPelicula.filmografías();
        
        return peliculas;
        
    	}
    
    }
