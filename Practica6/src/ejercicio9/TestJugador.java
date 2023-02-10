package ejercicio9;

public class TestJugador {

	public static void main(String[] args) {

Jugador player1= new Jugador("Fred", "Mago", 50, 1, 200);
Jugador player2= new Jugador("Juan", "Barbaro", 100, 1, 250);
Jugador player3= new Jugador("Eugenio", "Brujo", 60, 1, 200);

Enemigo enemigo1=new Enemigo("Bokoblin", 200);
Enemigo enemigo2=new Enemigo("Izalfos", 300);

System.out.println(player1+"\n"+player2+"\n"+player3);

System.out.println(enemigo1+"  "+enemigo2);


System.out.println("Golpear al "+enemigo1.getNombre());
	player1.golpear(enemigo1);
		System.out.println(enemigo1);
		
			player1.subirNivel();
				System.out.println(player1);
	}
}