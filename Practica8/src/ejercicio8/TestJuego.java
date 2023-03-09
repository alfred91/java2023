package ejercicio8;

public class TestJuego {

	public static void main(String[] args) {

		//Crear partida
		Partida p1 = new Partida(new JugadorHumano("Juan", "Barbaro", 1500));
		
		//Equipar al jugador con un arma
		p1.getJugador().equipar(new Arma("Hacha Doble", 150, 35));
		
		//Simular turnos
		for(int i=0; i < 50; i++) {					
			if (p1.turnoJugador()) {
				System.out.println("Ha ganado el jugador");
				break;
			}
			
			if (p1.turnoEnemigo()) {
				System.out.println("Los enemigos han derrotado al jugador");
				break;
			}
			
			System.out.println(p1);
		}

	}

}