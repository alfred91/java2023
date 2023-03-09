package ejercicio8;

public abstract class Jugador {
	protected String nick;
    protected String clase;
    protected int salud;
    
    
    public Jugador(String nick, String clase, int salud) {
        this.nick = nick;
        this.clase = clase;
        this.salud = salud;
    }
    
    public String getNick() {
        return nick;
    }
    
    public String getClase() {
        return clase;
    }
    
    public int getSalud() {
        return salud;
    }
    
    public void setSalud(int salud) {
        this.salud = salud;
    }
    

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador [nick=");
		builder.append(nick);
		builder.append(", clase=");
		builder.append(clase);
		builder.append(", salud=");
		builder.append(salud);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * Quitar vida a otro jugador, dependiendo de si es enemigo o jugador
	 * @param jugador
	 */
	public abstract boolean golpear(Jugador jugador);
	
	
	/**
	 * Resta a la salud del jugador, la cantidad indicada. 
	 * @param cantidad
	 * @return true - si se queda sin vida, false - si todavía tiene vida
	 */
	public boolean reducirVida(int cantidad) {
		this.salud = this.salud - cantidad;
		
		if (this.salud <= 0)
			return true;
		else
			return false;
	}
}