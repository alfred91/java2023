package ejemplos.interfaces;

public class Spotify implements Reproducible {
	
	private String cancion;

	public Spotify(String cancion) {
		super();
		this.cancion = cancion;
	}
	

	/**
	 * @return the cancion
	 */
	public String getCancion() {
		return cancion;
	}


	/**
	 * @param cancion the cancion to set
	 */
	public void setCancion(String cancion) {
		this.cancion = cancion;
	}



	@Override
	public void play() {
		System.out.println("Empezando la música " + this.cancion);
		
	}

	@Override
	public void stop() {
		System.out.println("Música parada "  + this.cancion);
		
	}

	@Override
	public void reset() {
		System.out.println("Reiniciando canción "  + this.cancion);
		
	}
	
	public void crearLista() {
		
	}

	
}
