package SetsyArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class PersonajeHS {
	
	protected String nombre;
	protected int salud;
	protected int mana;
	protected HashSet <TipoArmadura> componentesArmadura;
	protected Arma armaDer;
	protected Arma armaIzq;
	
	public PersonajeHS(String nombre, int salud, int mana, HashSet<TipoArmadura> componentesArmadura) {
		
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.componentesArmadura = new HashSet<>();

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
	
	
	   public void listarArmaduraDanioFisico() {
		   
	        System.out.println("Armadura de daño físico:");
	        
	        for (TipoArmadura armadura : componentesArmadura) {
	        	
	            if (armadura.getDefensaFisica() > 0) {
	            	
	                System.out.println(armadura);
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

	    Set<TipoArmadura.Zona> zonas = new HashSet<>();
	    Set<TipoArmadura> armaduraPorZona = new HashSet<>();

	    for (TipoArmadura tipoArmadura : componentesArmadura) {
	        TipoArmadura.Zona zona = tipoArmadura.getZona();
	        zonas.add(zona);
	        armaduraPorZona.add(tipoArmadura);
	    }

	    for (TipoArmadura.Zona zona : zonas) {
	        System.out.println("Zona: " + zona);

	        for (TipoArmadura tipoArmadura : armaduraPorZona) {
	            if (tipoArmadura.getZona() == zona) {
	                System.out.println(tipoArmadura);
	            }
	        }
	        System.out.println();
	    }
	}

	
	 public void listarArmaduraNombre() {
		 
	        System.out.println("Componentes de armadura ordenados por nombre:");

	        Set<TipoArmadura> armaduraOrdenada = new HashSet<>(componentesArmadura);

	        armaduraOrdenada.stream()
	                .sorted(Comparator.comparing(TipoArmadura::getNombre))
	                .forEach(System.out::println);
	    }

	 
	 public void listarArmaduraCreacion() {
		 
	        System.out.println("Componentes de armadura ordenados por creación:");

	        Set<TipoArmadura> armaduraOrdenada = new HashSet<>(componentesArmadura);

	        armaduraOrdenada.stream()
	                .sorted(Comparator.comparingInt(Object::hashCode))
	                .forEach(System.out::println);
	    }	    
}