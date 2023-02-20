package ejercicio8;

public class Jugador {
    private String nick;
    private String clase;
    private int salud;
    private Arma arma;
    
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
    
    public Arma getArma() {
        return arma;
    }
    
    public void equipar(Arma arma) {
        this.arma = arma;
    }
    
    public void golpear(Enemigo enemigo) {
        int danio;
        if (arma == null) {
            danio = 20;
        } else {
            danio = arma.getPuntos();
            if (arma.getDisparos() > 0) {
                arma.setDisparos(arma.getDisparos() - 1);
            } else {
                danio = 20;
            }
 
        }
        enemigo.quitarVida(danio);
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
		builder.append(", arma=");
		builder.append(arma);
		builder.append("]");
		return builder.toString();
	}
}