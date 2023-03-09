package ejercicio8;

public class Enemigo extends Jugador {

	public Enemigo(String nick, String clase, int salud) {
		super(nick, clase, salud);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean golpear(Jugador jugador) {
		return jugador.reducirVida(30);		
	}
}