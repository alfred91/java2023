package ejercicio7;

public class TestSteam {

	public static void main(String[] args) {
		SteamJuego Juego1=new SteamJuego("Half Life", "FPS SHOOTER CLASICO", "www.valve.com", 545, 50000, 0, "", 35);
		SteamJuego Juego2=new SteamJuego("Ocarina of time ", "AVENTURAS/PUZZLES CLASICO", "www.zelda.com/ocarina-of-time/", 900, 50000, 0,"", 15);
		SteamJuego Juego3=new SteamJuego("The legend of Zelda - Breath of the wild", "Accion / Aventuras en Mundo abierto", "www.zelda.com/breath-of-the-wild/", 20000, 50000, 69,"", 3);
		
	System.out.println("Juego 3: "+Juego3.nombre+" : "+Juego3.descripcionCorta+" Media Jugadores: "+Juego3.mediaJugadoresDiarios+" PVP: "+Juego3.precio+" "+Juego3.freeToPlay());
	System.out.println("Juego 1: "+Juego1.nombre+" : "+Juego1.descripcionCorta+" Media Jugadores: "+Juego1.mediaJugadoresDiarios+" PVP: "+Juego1.freeToPlay());
	System.out.println("Juego 3: "+Juego2.nombre+" : "+Juego2.descripcionCorta+" Media Jugadores: "+Juego2.mediaJugadoresDiarios+" PVP: "+Juego2.precio+" "+Juego2.freeToPlay());
	
	} 

}
