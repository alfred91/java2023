package ejemploTieneUn;

public class Partida {

	public static void main(String[] args) {
		
		Jugador j1 = new Jugador("Jugador1", "Barbaro");
		Jugador j2 = new Jugador("Jugador2", "Mago");
		
		j1.setArmaDerecha(new Arma("Hacha grande", 50));
		j1.golpearDerecha(j2);
		j1.golpearIzquierda(j2);
		
		j2.setArmaIzquierda(new Arma("Pistola láser brutal", 250));
		j2.golpearIzquierda(j1);
		j2.golpearIzquierda(j1);
		
		System.out.println(j1);
		System.out.println(j2);

	}

}
