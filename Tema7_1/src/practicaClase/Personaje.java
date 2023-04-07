package practicaClase;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import practicaClase.TipoArmadura.Zona;

public class Personaje {
	
	public String nombre;
	public double salud;
	public double mana;
	public HashSet<TipoArmadura> componentesArmadura;
	public Arma armaDer;
	public Arma armaIzq;

	/**
	 * @param nombre
	 * @param salud
	 * @param mana
	 */
	Personaje(String nombre, double salud, double mana) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.componentesArmadura = componentesArmadura;
		this.armaDer = armaDer;
		this.armaIzq = armaIzq;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the salud
	 */
	public double getSalud() {
		return salud;
	}
	/**
	 * @param salud the salud to set
	 */
	public void setSalud(double salud) {
		this.salud = salud;
	}
	/**
	 * @return the mana
	 */
	public double getMana() {
		return mana;
	}
	/**
	 * @param mana the mana to set
	 */
	public void setMana(double mana) {
		this.mana = mana;
	}
	/**
	 * @return the componentesArmadura
	 */
	public HashSet<TipoArmadura> getComponentesArmadura() {
		return componentesArmadura;
	}
	/**
	 * @param componentesArmadura the componentesArmadura to set
	 */
	public void setComponentesArmadura(HashSet<TipoArmadura> componentesArmadura) {
		this.componentesArmadura = componentesArmadura;
	}
	/**
	 * @return the armaDer
	 */
	public Arma getArmaDer() {
		return armaDer;
	}
	/**
	 * @param armaDer the armaDer to set
	 */
	public void setArmaDer(Arma armaDer) {
		this.armaDer = armaDer;
	}
	/**
	 * @return the armaIzq
	 */
	public Arma getArmaIzq() {
		return armaIzq;
	}
	/**
	 * @param armaIzq the armaIzq to set
	 */
	public void setArmaIzq(Arma armaIzq) {
		this.armaIzq = armaIzq;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personaje [nombre=");
		builder.append(nombre);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", mana=");
		builder.append(mana);
		builder.append(", componentesArmadura=");
		builder.append(componentesArmadura);
		builder.append(", armaDer=");
		builder.append(armaDer);
		builder.append(", armaIzq=");
		builder.append(armaIzq);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public void addArmadura(TipoArmadura tipoArmadura) {
		componentesArmadura.add(tipoArmadura);
	}
	
	public boolean listarArmaduraDanioFisico() {
		System.out.println("Armas con Daño Fisico ");
			for(TipoArmadura tipoArmadura:componentesArmadura) {
				if(tipoArmadura.getDefensaFisica()>0){
					System.out.println(tipoArmadura.getNombre());
				}
			}
	}
	
	public void listarArmaduraDanioMagico() {
		System.out.println("Armas con Daño Magico ");
			for(TipoArmadura tipoArmadura:componentesArmadura) {
				if(tipoArmadura.getDefensaMagica()>0) {
					System.out.println(tipoArmadura.getNombre());
				}
			}
	}
	
	public void listarArmaduraZona() {
		System.out.println("Armadura de zona ");
		
			for(TipoArmadura tipoArmadura:componentesArmadura) {
				
				if (Zona.BRAZODER != null){
					System.out.println("Brazo derecho "+tipoArmadura.getNombre());
					
				} else if (Zona.BRAZOIZQ != null){
						System.out.println("Brazo Izquierdo "+tipoArmadura.getNombre());
						
					}else if (Zona.CABEZA != null){
						System.out.println("Cabeza  "+tipoArmadura.getNombre());
						
							} else if (Zona.PIERNADER!=null) {
								System.out.println("Pierna Derecha "+tipoArmadura.getNombre());
								
									} else if (Zona.TORSO!=null) {
										System.out.println("Torso "+tipoArmadura.getNombre());		
							}
		}
	}
	
	public void listarArmaduraCreacion() {
		System.out.println("Lista de Armaduras en orden ");
			
				Set<String> lista=new HashSet<String>();
				lista.addAll(lista);
				for(TipoArmadura tipoArmadura:componentesArmadura) {
					System.out.println(lista);
				}
	}
}
