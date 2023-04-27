package Ejercicio3;

import java.util.*;

public class Stim {

	private ArrayList<Juego> juegos;
	private LinkedList<Usuario> usuarios;
	
	public Stim() {
		super();
		juegos = new ArrayList<>(100);
		usuarios = new LinkedList<>();
	}

	/**
	 * @return the juegos
	 */
	public ArrayList<Juego> getJuegos() {
		return juegos;
	}

	/**
	 * @return the usuarios
	 */
	public LinkedList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void addJuego(Juego j) {
		if (! juegos.contains(j))
			juegos.add(j);
	}
	
	public void delJuego(Juego j) {
		juegos.remove(j);
	}
	
	public void addUsuario(Usuario u) {
		if (! usuarios.contains(u))
			usuarios.add(u);
		
		Collections.sort(usuarios);
	}
	
	public void delUsuario(Usuario u) {
		usuarios.remove(u);
	}
	
	/**
	 * Obtiene todas las puntuaciones de los usuarios que juegen a ese Juego
	 * @param idJuego
	 * @return
	 */
	public TreeMap<Puntuacion,Usuario> obtenerPuntuaciones(Juego juego) {
		TreeMap<Puntuacion,Usuario> puntus = new TreeMap<>();
		
		int indexJuego = juegos.indexOf(juego);
		if (indexJuego < 0)
			return null;
		else {
			for(Usuario u : usuarios) {
				Puntuacion punt = u.getPuntuacion(juego);
				if (punt != null) {
					puntus.put(punt,u);
				}
			}			
		} 
		
		return puntus;
	}
	
	/**
	 * Busca si un Usuario tiene puntuacion para un Juego
	 * Si es así devuelve la Puntuacion, si no devuelve null
	 * @param j
	 * @param u
	 * @return
	 */
	public Puntuacion buscarPuntuacion(Juego j, Usuario u) {
		Puntuacion punt = null;
		
		int indexUsuario = Collections.binarySearch(usuarios, u);
		if (indexUsuario < 0)
			return punt; //No existe el usuario
		else {
			int indexJuego = juegos.indexOf(j);
			if (indexJuego < 0)
				return null;
			else {
				return usuarios.get(indexUsuario).getPuntuacion(juegos.get(indexJuego));
			}
		}
	}
	
	/**
	 * Para todos los juegos que tengamos sacamos el ranking de puntuaciones
	 */
	public void pintarRankingJuegos() {
		for(Juego j: juegos) {
			System.out.println("Juego --> " + j);
			
			TreeMap<Puntuacion,Usuario> datos = this.obtenerPuntuaciones(j);
			Set<Puntuacion> punts = datos.keySet();
			
			for(Puntuacion p : punts) {
				System.out.println(datos.get(p).getNick() + " --> Puntos: " + p.getPuntos());
				
			}
		}
	}
	
	
	/**
	 * M�TODOS DE STREAMS -------------------------------------------------------------------------------------------------------
	 */
	
	/**
	 * Pintar usuarios ordenados por nick, mostrando nick y email
	 */
	public void pintarUsuariosNick() {
		
		this.usuarios.stream()
			.sorted((u1,u2) -> u1.getNick().compareTo(u2.getNick()))
			.map(u -> u.getNick() + " - " + u.getEmail())
			.forEach(System.out::println);
	}
	
	/**
	 * Pinta para cada usuario los juegos a los que juega y la puntuaci�n que tiene en cada uno de ellos
	 */
	public void pintarPuntuacionesUsuario() {
		this.usuarios.stream()
			.forEach( u -> {
				System.out.println();
				System.out.println(u.getNick());
				System.out.println("------------------------");
				Set<Juego> juegosALosQueJuega = u.getPuntuaciones().keySet();
				juegosALosQueJuega.stream()
					.forEach( j -> {
						System.out.println("" + j + u.getPuntuacion(j));
					});
			});
	}
	
	/**
	 * Puntuaciones de un usuario ordenadas por puntuaci�n
	 */
	public void pintarPuntuacionesDeUsuario(Usuario u) {
		if (this.usuarios.contains(u)) {
			System.out.println();
			System.out.println("Puntuaciones para " + u.getNick());
			//Se podr�a intentar usar el usuario pasado como par�metro
			Usuario user = this.usuarios.get(this.usuarios.indexOf(u));
			user.getPuntuaciones().keySet().stream()
				.sorted((j1,j2) -> user.getPuntuaciones().get(j2).getPuntos() - user.getPuntuaciones().get(j1).getPuntos() )
				.forEach( j -> {
					System.out.println("  " + j.getNombre() + " (" + j.getPlataforma() + ") " + " -> " + user.getPuntuaciones().get(j).getPuntos());
				});
				
			
		} else {
			System.out.println("Usuario no registrado");
		}
	}
	
	/**
	 * Pintar ranking de juegos, a ver si me sale
	 */
	public void pintarRankingStreams() {
		System.out.println();
		
		this.juegos.stream()
			.forEach( juego -> {
				System.out.println("Juego -> " + juego.getNombre() + " en " + juego.getPlataforma() + " ------------------------------------------------------");
				this.usuarios.stream()
					.filter(u -> u.getPuntuaciones().keySet().contains(juego))
					.sorted( (u1, u2) -> u2.getPuntuacion(juego).getPuntos() - u1.getPuntuacion(juego).getPuntos())
					.forEach( u -> {
						System.out.println(u.getNick() + " -> " + u.getPuntuacion(juego).getPuntos());
					});
			});
	}
}