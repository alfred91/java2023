package ejemplos.constructorcopia;

public class Juego {

	public static void main(String[] args) {
		
		Tablero tb = new Tablero();
		Robot base = new Robot("Naranja", 150, 0, 0);
		
		for(int i=0; i<50; i++) {
			Robot r = new Robot(base); //Copiar el robot base, y tener robots iguales en posiciones diferentes
			r.setPosicionRandom();
			tb.agregarRobot(r);
		}
		
		tb.pintarTablero();
		

	}

}
