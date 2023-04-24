import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PersonajeTS extends Personaje {
    private TreeSet<TipoArmadura> componentesArmadura;
    
    public PersonajeTS(String nombre, int salud, int mana) {
        super(nombre, salud, mana);
        componentesArmadura = new TreeSet<TipoArmadura>();
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