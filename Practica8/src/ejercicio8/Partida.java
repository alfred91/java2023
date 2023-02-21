package ejercicio8;

import java.util.ArrayList;

public class Partida {

	public JugadorHumano jugador;
	public ArrayList<Enemigo> enemigos;
	
	public Partida(JugadorHumano jh) {
		this.jugador = jh;
		this.enemigos = new ArrayList<>();
		this.iniciarPartida();
	}
	
	
	private void iniciarPartida() {
		for(int i=0; i < 50; i++) {
			this.enemigos.add(new Enemigo("Trol", "Barbaro", 55));
		}
	}
	
	/**
	 * El jugador dispara al primer enemigo con lo tenga
	 * Si no quedan enemigos devuelve true (ganado)
	 * Sino, golpeas al primer enemigo que queda vivo, si lo matas, lo borras del ArrayList
	 */
	public boolean turnoJugador() {
		
		/**
		 * Esto no se puede hacer, puesto que no puedo borrar elementos de un arraylist mientras lo recorro.
		 */
		/*
		for(Enemigo e: this.enemigos) {
			this.jugador.golpear(e);
			if (e.getSalud() <= 0) {
				this.enemigos.remove(e);
			}
		}
		*/
		
		
		//Golpear al primer enemigo
		this.jugador.golpear(this.enemigos.get(0));
		
		//Comprobar si el primer está vivo o me lo he cargado
		if (this.enemigos.get(0).getSalud() <= 0)
			this.enemigos.remove(0);
		
		//Comprobar que quedan enemigos
		if (this.enemigos.size() == 0)
			return true;
		
		return false;		
	}
	
	
	
	public boolean turnoEnemigo() {
		//Si no hay enemigos no haga nada
		if (this.enemigos.size() == 0)
			return false;
		
		//El primer enemigo golpear al jugador
		return this.enemigos.get(0).golpear(this.jugador);
	}


	/**
	 * @return the jugador
	 */
	public JugadorHumano getJugador() {
		return jugador;
	}


	/**
	 * @return the enemigos
	 */
	public ArrayList<Enemigo> getEnemigos() {
		return enemigos;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Partida [jugador=");
		builder.append(jugador.getSalud());
		builder.append(" nº enemigos ");
		builder.append(this.enemigos.size());
		builder.append("]");
		return builder.toString();
	}
}