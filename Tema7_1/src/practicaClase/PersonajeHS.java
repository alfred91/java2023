package practicaClase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonajeHS extends Personaje {
    private Set<TipoArmadura> componentesArmadura;
    
    public PersonajeHS(String nombre, int salud, int mana) {
        super(nombre, salud, mana);
        componentesArmadura = new HashSet<TipoArmadura>();
    }
    
    @Override
    public void addArmadura(TipoArmadura armadura) {
        componentesArmadura.add(armadura);
    }
    
    @Override
    public List<TipoArmadura> listarArmaduraCreacion() {
        List<TipoArmadura> armaduras = new ArrayList<TipoArmadura>(componentesArmadura);
        return armaduras;
    }
}