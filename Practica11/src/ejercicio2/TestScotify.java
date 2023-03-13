package ejercicio2;

public class TestScotify {
	
	PrimeVideo primeVideo = new PrimeVideo();
	for(int i = 0; i < 200; i++) {
	    boolean isPlus = false;
	    if(i < 30) {
	        isPlus = true;
	    }
	    Multimedia m = new Pelicula("Título " + i, isPlus, 2.99, Genero.Terror, 120);
	    primeVideo.addMultimedia(m);
	}
	
	for(int j = 0; j < 1000000; j++) {
	    Cliente c;
	    int j = i;
		if(j % 4 == 0) {
	        c = new ClientePrimePro("Cliente " + j, "email" + j + "@gmail.com", null);
	    } else {
	        c = new ClientePrime("Cliente " + j, "email" + j + "@gmail.com", null);
	    }
	    primeVideo.addSuscriptor(c);
	}
}
}
