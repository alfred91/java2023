package Ejercicio3;

public class JuegosUsuarios {
	public static void main(String[] args) {
	    Stim stim = new Stim();
	    
	    // Añadir 10 juegos
	    stim.addJuego(new Juego("1", "GTA VI"));
	    stim.addJuego(new Juego("2", "World of Warcraft"));
	    stim.addJuego(new Juego("3", "The Legend of Zelda: Tears of the Kingdom"));
	    stim.addJuego(new Juego("4", "Fortnite"));
	    stim.addJuego(new Juego("5", "Call of Duty: Warzone"));
	    stim.addJuego(new Juego("6", "The last of Us part II"));
	    stim.addJuego(new Juego("7", "FIFA 23"));
	    stim.addJuego(new Juego("8", "League of Legends"));
	    stim.addJuego(new Juego("9", "Horizon Zero Dawn"));
	    stim.addJuego(new Juego("10", "Pokemon Iberia"));
	    
	    // Añadir 10 usuarios con 5 puntuaciones cada uno
	    for (int i = 1; i <= 10; i++) {
	        Usuario usuario = new Usuario("usuario" + i, "email" + i + "gmail.com", "password" + i);
	        for (int j = 1; j <= 5; j++) {
	            int puntos = (int) (Math.random() * 1000); // generar puntos aleatorios entre 0 y 999
	            boolean haGanado = Math.random() < 0.5; // generar aleatoriamente si ha ganado o no
	            Puntuacion puntuacion = new Puntuacion();
	            usuario.addPuntuacion(puntos, haGanado, puntos);
	        }
	        stim.addJugador(usuario);
	    }
	    
	    // Prueba de métodos
	    System.out.println("Lista de juegos:");
	    stim.listarJuegos();
	    System.out.println("Lista de jugadores:");
	    stim.listarJugadores();
	    
	    // Obtener puntuaciones de un juego y usuario específico
	    int idJuego = 1;
	    int idUsuario = 1;
	    Puntuacion puntuacion;
		try {
			puntuacion = Stim.buscarPuntuacion(idJuego, idUsuario);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.printf("Puntuación de usuario%d en juego%d: %d puntos, %d partidas jugadas, %d partidas ganadas\n",
	                      idUsuario, idJuego, puntuacion.getPuntos(), puntuacion.getPJ(), puntuacion.getPG());
	    
	    
	    // Pintar ranking de juegos
	    stim.pintarRankingJuegos();
	}
}