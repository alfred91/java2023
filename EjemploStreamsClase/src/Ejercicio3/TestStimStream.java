package Ejercicio3;

public class TestStimStream {

	public static void main(String[] args) {
		
Stim stim = new Stim();
		
		Juego j1 = new Juego("Lol","PC");
		Juego j2 = new Juego("Minecraft","PC");
		Juego j3 = new Juego("Fifa22","PC");
		Juego j4 = new Juego("Fifa22","PS5");
		Juego j5 = new Juego("Fortnite","PC");
		
		stim.addJuego(j1);
		stim.addJuego(j2);
		stim.addJuego(j3);
		stim.addJuego(j4);
		stim.addJuego(j5);
		
		Usuario u1 = new Usuario("usuario1","u1@gmail.com","u1");
		u1.addPuntuacion(j1, true, 100);
		u1.addPuntuacion(j1, false, -50);
		u1.addPuntuacion(j1, true, 140);
		u1.addPuntuacion(j2, true, 200);
		u1.addPuntuacion(j2, true, 300);		
		
		Usuario u2 = new Usuario("usuario2","u2@gmail.com","u2");
		u2.addPuntuacion(j1, true, 100);
		u2.addPuntuacion(j3, true, 200);
		u2.addPuntuacion(j3, true, 300);
		u2.addPuntuacion(j3, false, -100);
		u2.addPuntuacion(j5, true, 150);		
		
		Usuario u3 = new Usuario("usuario3","u3@gmail.com","u3");
		u3.addPuntuacion(j1, true, 200);
		u3.addPuntuacion(j2, true, 200);
		u3.addPuntuacion(j3, true, 200);
		u3.addPuntuacion(j4, true, 200);
		u3.addPuntuacion(j5, true, 200);
		
		Usuario u4 = new Usuario("usuario4","u4@gmail.com","u4");
		u4.addPuntuacion(j1, false, -100);
		u4.addPuntuacion(j2, false, -100);
		u4.addPuntuacion(j3, false, -100);
		u4.addPuntuacion(j4, false, -100);
		u4.addPuntuacion(j5, false, -100);		
		
		Usuario u5 = new Usuario("usuario5","u5@gmail.com","u5");
		u5.addPuntuacion(j1, true, 120);
		u5.addPuntuacion(j2, true, 120);
		u5.addPuntuacion(j3, true, 120);
		u5.addPuntuacion(j4, true, 120);
		u5.addPuntuacion(j5, true, 120);
		u5.addPuntuacion(j1, true, 70);
		u5.addPuntuacion(j2, true, 80);
		u5.addPuntuacion(j3, true, 90);
		u5.addPuntuacion(j4, true, 100);
		u5.addPuntuacion(j5, true, 120);
		u5.addPuntuacion(j1, false, -50);
		u5.addPuntuacion(j2, false, -50);
		u5.addPuntuacion(j3, false, -50);
		u5.addPuntuacion(j4, false, -50);
		u5.addPuntuacion(j5, false, -50);		
		
		stim.addUsuario(u1);
		stim.addUsuario(u2);
		stim.addUsuario(u3);
		stim.addUsuario(u4);
		stim.addUsuario(u5);		
		
		stim.pintarUsuariosNick();
		stim.pintarPuntuacionesUsuario();
		stim.pintarPuntuacionesDeUsuario(u5);
		stim.pintarRankingStreams();

	}
}