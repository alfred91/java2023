package ejemplos.interfaces;

import java.util.Arrays;

public class TestSpotify {

	public static void main(String[] args) {
	
		Spotify sp = new Spotify("La nueva de Shakira");
		Youtube yt1 = new Youtube("Un vídeo de Youtube", 100);
		Youtube yt2 = new Youtube("Otro vídeo de Youtube", 200);
		Youtube yt3 = new Youtube("Otro vídeo de Youtube", 120);
		
		sp.play();
		sp.stop();
		sp.reset();
		
		yt1.play();
		yt1.stop();
		yt1.reset();
		
		Youtube[] videos = new Youtube[3];
		videos[0] = yt1;
		videos[1] = yt2;
		videos[2] = yt3;
		
		Arrays.sort(videos); //Ordena el array puesto que yo he implementado el interfaz Comparable (compareTo)
		
		for(int i=0; i<videos.length; i++) {
			System.out.println(videos[i].getDuracion());
		}
		
	}

}
