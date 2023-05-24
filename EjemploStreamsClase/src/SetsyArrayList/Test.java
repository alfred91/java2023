package SetsyArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear personajes
        PersonajeHS personaje1 = new PersonajeHS("HashSetAntonio", 100, 50, new HashSet<>());
        PersonajeHS personaje2 = new PersonajeHS("HashSetMaria", 150, 80, new HashSet<>());
        PersonajeHS personaje3 = new PersonajeHS("HashSetPepe", 120, 70, new HashSet<>());
        
        PersonajeTS personaje4 = new PersonajeTS("TreeSetJuan", 100, 50, new TreeSet<>());
        PersonajeTS personaje5 = new PersonajeTS("TreeSetBruno", 120, 100, new TreeSet<>());
        PersonajeTS personaje6 = new PersonajeTS("TreeSetJulia", 80, 40, new TreeSet<>());

        PersonajeAL personaje7 = new PersonajeAL("ArrayLuis", 50, 95, new ArrayList<>());
        PersonajeAL personaje8 = new PersonajeAL("ArrayMon", 60, 85, new ArrayList<>());
        PersonajeAL personaje9 = new PersonajeAL("Arrayan", 70, 105, new ArrayList<>());
        
        
        

        // Agregar componentes de armadura a los personajes
        personaje1.addArmadura(new TipoArmadura("Coraza", TipoArmadura.Zona.TORSO, 20, 10));
        personaje2.addArmadura(new TipoArmadura("Hombreras", TipoArmadura.Zona.TORSO, 10, 20));
        personaje3.addArmadura(new TipoArmadura("Casco de Barbaro", TipoArmadura.Zona.CABEZA, 0, 30));

        personaje4.addArmadura(new TipoArmadura("Sudadera ignifuga", TipoArmadura.Zona.TORSO, 15, 15));
        personaje5.addArmadura(new TipoArmadura("Pendientes de Topacio", TipoArmadura.Zona.CABEZA, 0, 25));
        personaje6.addArmadura(new TipoArmadura("Casaca forrada", TipoArmadura.Zona.TORSO, 0, 20));

        personaje7.addArmadura(new TipoArmadura("Armadura Zora", TipoArmadura.Zona.TORSO, 0, 30));
        personaje8.addArmadura(new TipoArmadura("Casco del Vigilante", TipoArmadura.Zona.CABEZA, 0, 40));
        personaje9.addArmadura(new TipoArmadura("Brazo de Rauru", TipoArmadura.Zona.BRAZODER, 0, 20));

        
        // Llamar a los métodos de listado para cada personaje
        personaje1.listarArmaduraDanioFisico();
        personaje2.listarArmaduraDanioMagico();
        personaje3.listarArmaduraZona();
        personaje4.listarArmaduraNombre();
        personaje5.listarArmaduraCreacion();

        personaje6.listarArmaduraDanioFisico();
        personaje7.listarArmaduraDanioMagico();
        personaje8.listarArmaduraZona();
        personaje9.listarArmaduraNombre();
        personaje8.listarArmaduraCreacion();

        personaje7.listarArmaduraDanioFisico();
        personaje6.listarArmaduraDanioMagico();
        personaje5.listarArmaduraZona();
        personaje4.listarArmaduraNombre();
        personaje3.listarArmaduraCreacion();
    }
}