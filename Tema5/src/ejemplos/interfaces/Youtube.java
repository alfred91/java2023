package ejemplos.interfaces;

public class Youtube implements Reproducible, Comparable<Youtube> {

	private String video;
	private int duracion;
	
	public Youtube(String video, int duracion) {
		super();
		this.video = video;
		this.duracion = duracion;
	}
	

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}


	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	/**
	 * @return the video
	 */
	public String getVideo() {
		return video;
	}

	/**
	 * @param video the video to set
	 */
	public void setVideo(String video) {
		this.video = video;
	}



	@Override
	public void play() {
		System.out.println("Empezando vídeo " + this.video);

	}

	@Override
	public void stop() {
		System.out.println("Parando vídeo " + this.video);

	}

	@Override
	public void reset() {
		System.out.println("Reiniciando vídeo " + this.video);

	}
	
	public void seguirAutor() {
		
	}


	@Override
	public int compareTo(Youtube o) {
		if (this.duracion < o.duracion) {
			return -1;
		} else if (this.duracion > o.duracion) {
			return 1;
		} else
			return 0;
	}


	

}
