package ejercicio9;

public class TestJugador {

	public static void main(String[] args) {

Jugador player1= new Jugador("Fred", "Mago", 150, 1, 200);
Jugador player2= new Jugador("Juan", "Barbaro", 300, 1, 200);
Jugador player3= new Jugador("Eugenio", "Brujo", 100, 1, 200);

Enemigo enemigo1=new Enemigo("Bokoblin", 200);

System.out.println("Salud del jugador: "+player1.getSalud());
System.out.println("Salud del enemigo: "+enemigo1.getSalud());

System.out.println("Golpeamos al enemigo. ");
player1.golpear(enemigo1);


System.out.println("Salud del jugador: "+player1.salud);
System.out.println("Salud del enemigo: "+enemigo1.salud);

System.out.println("Nivel del jugador 1: "+player1.nivel);
player1.subirNivel();
System.out.println("Nivel del jugador 1: "+player1.nivel);
System.out.println("Salud del jugador 1: "+player1.salud);
	}

}
