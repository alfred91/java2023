package ejercicio3;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		
		ArrayList<Serie> series = new ArrayList<>();
		ArrayList<Videojuego> videojuegos = new ArrayList<>();
		
		series.add(new Serie("The Last of us", 1, "Un fulano", "Drama"));
		series.add(new Serie("Tokyo Vice", 1, "Otro fulano", "Comedia"));
		series.add(new Serie("Friends", 7, "Friendzone", "Suspense"));
		
		videojuegos.add(new Videojuego("Fifa 23", 200, Videojuego.GeneroV.DEPORTES, "EA"));
		videojuegos.add(new Videojuego("Valorant", 300, Videojuego.GeneroV.SHOOTER, "Riot Games"));
		videojuegos.add(new Videojuego("Final Fantasy 14", 50, Videojuego.GeneroV.MMORPG, "Squarenix"));
		
		//Prestar algo
		series.get(0).entregar();
		videojuegos.get(1).entregar();
		videojuegos.get(2).entregar();
		
		int posicion = series.indexOf(new Serie("Friends",""));
		series.get(posicion).entregar();
		
		
		int contSeries = 0;
		for(Serie s: series) {
			if (s.esPrestado())
				contSeries++;
			
			System.out.println(s);
		}
		
		int contVideojuegos = 0;
		for(Videojuego v: videojuegos) {
			if (v.esPrestado())
				contVideojuegos++;
			System.out.println(v);
		}
		
		System.out.println("Hay " + contSeries + " series prestadas." );
		System.out.println("Hay " + contVideojuegos + " videojuegos prestados." );

	}
}