package pooCursoJava;

public class Coche {

	private int ruedas;
	
	private int largo;
	 
	private double ancho;
	 
	private int motor;
	 
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
//	CONSTRUCTOR ><
	 
	public Coche () {
		
		ruedas=4;
		
		largo=3000;
		
		ancho=1600;
		
		motor=5000;
		
		peso_plataforma=1500;
	}
	
	//	METODOS GETTER<
	
	public String dime_datos_generales() {
		
		return "La plataforma del vehiculo tiene "+ruedas+" ruedas"+
		". Mide "+largo/1000+" metros con un ancho de "+ancho/1000+ " metros y un peso de plataforma de "+peso_plataforma+
		" Kilos.";
	}
	
	public String dime_color() {
		return "El color del coche es " + color;
	}
	
	
	public String dime_asientos() {
		
		if (asientos_cuero==true) {
			
			return "El coche tiene asientos de cuero.";
			
		} else {return "Este coche no vale un duro.";}
	}
	
	//	METODOS SETTER>
	
	public void estableceColor(String color_coche) {
		
		color=color_coche;
		
	}
	
	public void configura_asientos(String asientos_cuero) {
	
		if(asientos_cuero=="si") {
			
			this.asientos_cuero=true;
			
		} else { this.asientos_cuero=false;}
	}
	
	public void configura_climatizador(String climatizador) {
		if(climatizador=="si") {
			
			this.climatizador=true;
				} else {
			this.climatizador=false;
		}
		
	}

	public String dime_climatizador() {
		if (climatizador==true) { return "El coche lleva climatizador";
			
		} else { return "El coche va sin aire, a abrir las ventanas por la autovia en agosto ";
			
			}
		}
	
	
	//SETTER + GETTER
	public String dime_peso_coche() { //LOS PUBLIC STRING DEVUELVEN STRINGS ...
		
		int peso_carroceria=600;
		
		peso_total=peso_plataforma+peso_carroceria;
		if (asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if (climatizador==true) {
			
			peso_total=peso_total+15;
		}
	
		return "El peso del coche es "+peso_total;
	}
	
	
	
	public int precio_coche() {
		int precio_final=20000;
		
		if (asientos_cuero=true) {
			precio_final+=2000;
		}
		if (climatizador=true) {
			precio_final+=1000;
		}
		return precio_final;
	}
	
} 