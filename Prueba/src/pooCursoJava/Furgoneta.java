package pooCursoJava;

public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		
		super();
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
	public String dimeDatosFurgoneta() {
		
		return "La capacidad es "+capacidad_carga+" y las plazas extra: "+plazas_extra;
	}
	

}