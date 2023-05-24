package SetsyArrayList;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class PersonajeTS {

	
	protected String nombre;
	protected int salud;
	protected int mana;
	protected TreeSet <TipoArmadura> componentesArmadura;
	protected Arma armaDer;
	protected Arma armaIzq;
	
	public PersonajeTS(String nombre, int salud, int mana, TreeSet<TipoArmadura> componentesArmadura) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.componentesArmadura = componentesArmadura;

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
	public int getSalud() {
		return salud;
	}
	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}
	/**
	 * @return the mana
	 */
	public int getMana() {
		return mana;
	}
	/**
	 * @param mana the mana to set
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}
	/**
	 * @return the componentesArmadura
	 */
	public TreeSet<TipoArmadura> getComponentesArmadura() {
		return componentesArmadura;
	}
	/**
	 * @param componentesArmadura the componentesArmadura to set
	 */
	public void setComponentesArmadura(TreeSet<TipoArmadura> componentesArmadura) {
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
		
		   if (!componentesArmadura.contains(tipoArmadura)) {
			   
		        componentesArmadura.add(tipoArmadura);
		    }
		}
	
	public void listarArmaduraDanioFisico() {
		
		System.out.println("Armadura de daño fisico:");
			for(TipoArmadura tipoArmadura : componentesArmadura) {
				if(tipoArmadura.getDefensaFisica()>0) {
					System.out.println(tipoArmadura);
				}
			}

	}
	
	public void listarArmaduraDanioMagico() {
		
		System.out.println("Armadura de daño magico:");
			for(TipoArmadura tipoArmadura : componentesArmadura) {
				if(tipoArmadura.getDefensaMagica()>0) {
					System.out.println(tipoArmadura);
				}
			}
		
	}

	public void listarArmaduraZona() {
		
	    System.out.println("Armadura por zona");
	    TreeSet<TipoArmadura.Zona> zonas = new TreeSet<>();

	    for (TipoArmadura tipoArmadura : componentesArmadura) {
	        TipoArmadura.Zona zona = tipoArmadura.getZona();
	        zonas.add(zona);
	    }

	    for (TipoArmadura.Zona zona : zonas) {
	        System.out.println("Zona: " + zona);

	        for (TipoArmadura tipoArmadura : componentesArmadura) {
	            if (tipoArmadura.getZona().equals(zona)) {
	                System.out.println(tipoArmadura);
	            }
	        }

	        System.out.println();
	    }
	}

	
	public void listarArmaduraNombre() {
		
	    System.out.println("Componentes de armadura ordenados por nombre:");
	    TreeSet<TipoArmadura> armaduraOrdenada = new TreeSet<>(Comparator.comparing(TipoArmadura::getNombre));

	    armaduraOrdenada.addAll(componentesArmadura);

	    for (TipoArmadura tipoArmadura : armaduraOrdenada) {
	        System.out.println(tipoArmadura);
	    }
	}
	  
	public void listarArmaduraCreacion() {
		
	    System.out.println("Componentes de armadura ordenados por creación:");
	    TreeSet<TipoArmadura> armaduraOrdenada = new TreeSet<>(Comparator.comparingInt(TipoArmadura::hashCode));

	    armaduraOrdenada.addAll(componentesArmadura);

	    for (TipoArmadura tipoArmadura : armaduraOrdenada) {
	        System.out.println(tipoArmadura);
	    }
	}
}