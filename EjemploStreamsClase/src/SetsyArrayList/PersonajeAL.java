package SetsyArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class PersonajeAL {
	
	protected String nombre;
	protected int salud;
	protected int mana;
	protected ArrayList <TipoArmadura> componentesArmadura;
	protected Arma armaDer;
	protected Arma armaIzq;
	
	public PersonajeAL(String nombre, int salud, int mana, ArrayList<TipoArmadura> componentesArmadura) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.componentesArmadura = new ArrayList<>();

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
	public ArrayList<TipoArmadura> getComponentesArmadura() {
		return componentesArmadura;
	}
	/**
	 * @param componentesArmadura the componentesArmadura to set
	 */
	public void setComponentesArmadura(ArrayList<TipoArmadura> componentesArmadura) {
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
	    
	    List<TipoArmadura.Zona> zonas = new ArrayList<>();
	    List<List<TipoArmadura>> armaduraPorZona = new ArrayList<>();

	    for (TipoArmadura tipoArmadura : componentesArmadura) {
	        TipoArmadura.Zona zona = tipoArmadura.getZona();
	        int index = zonas.indexOf(zona);
	        if (index == -1) {
	            zonas.add(zona);
	            armaduraPorZona.add(new ArrayList<>());
	            index = zonas.size() - 1;
	        }
	        armaduraPorZona.get(index).add(tipoArmadura);
	    }

	    for (int i = 0; i < zonas.size(); i++) {
	    	
	        TipoArmadura.Zona zona = zonas.get(i);
	        List<TipoArmadura> armaduraEnZona = armaduraPorZona.get(i);

	        System.out.println("Zona: " + zona);

	        for (TipoArmadura tipoArmadura : armaduraEnZona) {
	            System.out.println(tipoArmadura);
	        }
	        System.out.println();
	    }
	}

	
	  public void listarArmaduraNombre() {
		  
	        System.out.println("Componentes de armadura ordenados por nombre:");
	        
	        List<TipoArmadura> armaduraOrdenada = new ArrayList<>(componentesArmadura);
	        armaduraOrdenada.sort(Comparator.comparing(TipoArmadura::getNombre));
	        
	        for (TipoArmadura tipoArmadura : armaduraOrdenada) {
	            System.out.println(tipoArmadura);
	        }
	    }
	 
	  
	public void listarArmaduraCreacion() {
		
        System.out.println("Componentes de armadura ordenados por creación:");
        
        List<TipoArmadura> armaduraOrdenada=new ArrayList<>(componentesArmadura);
        armaduraOrdenada.sort(Comparator.comparingInt(Object::hashCode));
        
        for (TipoArmadura tipoArmadura : armaduraOrdenada) {
        	System.out.println(tipoArmadura);
        	
        }
	}
}