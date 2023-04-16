package practicaClase;
import java.util.ArrayList;
import java.util.List;

public class PersonajeAL extends Personaje {
	
	private List<TipoArmadura> componentesArmadura;
	
	public PersonajeAL(String nombre, int salud, int mana) {
		
    super(nombre, salud, mana);
    
    componentesArmadura = new ArrayList<TipoArmadura>();
}

@Override
public void addArmadura(TipoArmadura armadura) {
    componentesArmadura.add(armadura);
}

@Override
public void listarArmaduraCreacion() {
    List<TipoArmadura> armaduras = new ArrayList<TipoArmadura>(componentesArmadura);
    return;
	}
}