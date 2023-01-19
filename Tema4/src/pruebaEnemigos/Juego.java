package pruebaEnemigos;

public class Juego {

	public static void main(String[] args) throws CloneNotSupportedException {
		Enemigo e1 = new Enemigo("Robot", 100);
		Enemigo e2 = (Enemigo) e1.clone();
		
		Partida p = new Partida();
		p.nuevoEnemigo(e1);
		p.nuevoEnemigo(e2);
		p.pintarEnemigos();
		p.eliminarEnemigo(e1);
		p.pintarEnemigos();
		
	}

}
