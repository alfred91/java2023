package Ejercicio3;

import java.util.HashMap;
import java.util.Objects;

public class Usuario implements Comparable<Usuario>{

	private String nombre;
	private String email;
	private String nick;
	private HashMap<Juego,Puntuacion> puntuaciones;
	
	public Usuario(String nombre, String email, String nick) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.nick = nick;
		this.puntuaciones = new HashMap<>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the puntuaciones
	 */
	public HashMap<Juego, Puntuacion> getPuntuaciones() {
		return puntuaciones;
	}

	@Override
	public String toString() {
		return nick + " - " + email;
	}
	
	/**
	 * Añade una puntuación de una partida a las puntuaciones del usuario
	 * Si no tenía partidas de ese juego crea una
	 * Si tenía partidas reemplaza los datos actualizando los valores
	 * @param idJuego
	 * @param haGanado
	 * @param puntosObtenidos
	 */
	public void addPuntuacion(Juego juego, boolean haGanado, int puntosObtenidos) {
		//Comprobar que el usuario juega a ese juego
		Puntuacion punt = puntuaciones.get(juego);
		if (punt == null) {
			if (haGanado) {
				puntuaciones.put(juego, new Puntuacion(puntosObtenidos, 1, 1, 0));
			} else {
				puntuaciones.put(juego, new Puntuacion(puntosObtenidos, 1, 0, 1));
			}
		} else {
			if (haGanado) {
				puntuaciones.put(juego, new Puntuacion(puntosObtenidos+punt.getPuntos(), punt.getpJugadas()+1, punt.getpGanadas()+1, punt.getpPerdidas()));
			} else {
				puntuaciones.put(juego, new Puntuacion(puntosObtenidos+punt.getPuntos(), punt.getpJugadas()+1, punt.getpGanadas(), punt.getpPerdidas()+1));
			}
		}	
	}
	
	
	/**
	 * Devuelve los puntos de un Juego pasado como parámetro
	 * Si el usuario no ha jugado a ese juego devuelve -1
	 * Si ha jugado devuelve los puntos que lleva en ese juego
	 * @param idJuego
	 * @return
	 */
	public Puntuacion getPuntuacion(Juego juego) {
		if (puntuaciones.get(juego) == null) {
			return null; //No tiene
		} else {
			return puntuaciones.get(juego);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nick);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nick, other.nick);
	}

	@Override
	public int compareTo(Usuario o) {
		return this.nick.compareTo(o.getNick());
	}
	
}