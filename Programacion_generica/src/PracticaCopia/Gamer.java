package PracticaCopia;


public class Gamer {
	
	private String nick;
	private String email;
	private String juego;
	protected Nivel nivel;
	enum Nivel {DIOS,MAQUINA,BUENO,NORMAL,REGULAR,MALILLO,PAQUETE}

	Gamer(String nick, String email, String juego, Nivel nivel) {

		this.nick = nick;
		this.email = email;
		this.juego = juego;
		this.nivel = nivel;
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
	 * @return the juego
	 */
	public String getJuego() {
		return juego;
	}

	/**
	 * @param juego the juego to set
	 */
	public void setJuego(String juego) {
		this.juego = juego;
	}

	/**
	 * @return the nivel
	 */
	public Nivel getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gamer [nick=");
		builder.append(nick);
		builder.append(", email=");
		builder.append(email);
		builder.append(", juego=");
		builder.append(juego);
		builder.append(", nivel=");
		builder.append(nivel);
		builder.append("]");
		return builder.toString();
	}

}