package ejercicio6;

	public class Satelite {
		
		private double meridiano;
		private double paralelo;
		private double distancia_tierra;
		Satelite (double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
		}
		Satelite () {
		meridiano=paralelo=distancia_tierra=0;
		}
			
		public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
		}
		public void printPosicion() {
		System.out.print("El satelite se encuentra en ");
		System.out.print("el paralelo "+paralelo+" meridiano "+meridiano);
		System.out.print(" a una distancia de la Tierra de "+distancia_tierra+" kms.");
		}
		
		public void variaAltura(double desplazamiento) {
			distancia_tierra=desplazamiento+distancia_tierra;
		}
		
		String enOrbita() {
			if(distancia_tierra==0) {return "El satelite esta en tierra.";
			} else {
				return "El satelite esta en orbita.";	}
			
			}
		public void variaPosicion(double variap, double variam) {
			paralelo=paralelo+=variap;
			meridiano=meridiano+=variam;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Satelite [meridiano=");
			builder.append(meridiano);
			builder.append(", paralelo=");
			builder.append(paralelo);
			builder.append(", distancia_tierra=");
			builder.append(distancia_tierra);
			builder.append(", enOrbita()=");
			builder.append(enOrbita());
			builder.append(", getClass()=");
			builder.append(getClass());
			builder.append(", hashCode()=");
			builder.append(hashCode());
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}
		}