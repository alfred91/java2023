package ejercicio2;

public class Coche {
	
	private int velocidad;

	public Coche() {
		super();
		this.velocidad=0;
	}

	public int getVelocidad() {
		return velocidad;}
	
		public void setVelocidad(int velocidad) {
			this.velocidad=velocidad;
		}
			public void acelera(int mas) {
				this.velocidad=this.velocidad+mas;
			}
			public void frena(int menos) {
				
				if (menos<=this.velocidad) {
					
					this.velocidad=this.velocidad-menos;
					} 
				else this.velocidad=0;
			}
	}