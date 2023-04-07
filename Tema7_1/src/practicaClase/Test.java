package practicaClase;

public static void main(String[] args) {
	
    TipoArmadura ta1 = new TipoArmadura("Armadura de cuero", Zona.PIERNAIZQ, 5, 0);
    TipoArmadura ta2 = new TipoArmadura("Brazales de hierro", Zona.BRAZOIZQ, 10, 0);
    TipoArmadura ta3 = new TipoArmadura("Pantalones de cuero", Zona.TORSO, 5, 0);
    TipoArmadura ta4 = new TipoArmadura("Casco de hierro", Zona.CABEZA, 10, 0);
    TipoArmadura ta5 = new TipoArmadura("Botas de cuero", Zona.PIERNADER, 5, 0);
    
    Arma a1 = new Arma("Espada de acero", TipoArma.ESPADA, false, 20, 0);
    Arma a2 = new Arma("Bastón de fuego", TipoArma.BASTON, true, 5, 20);
    
    PersonajeHS phs = new PersonajeHS("Aragorn", 100, 50);
	    phs.addArmadura(ta1);
	    phs.addArmadura(ta2);
	    phs.addArmadura(ta3);
	    phs.addArmadura(ta4);
	    phs.addArmadura(ta5);
	    phs.setArmaDer(a1);
	    phs.setArmaIzq(a2);
	    
	    System.out.println("Versión con HashSet:");
	    System.out.println(phs.listarArmaduraDanioFisico());
	    System.out.println(phs.listarArmaduraDanioMagico());
	    System.out.println(phs.listarArmaduraZona());
	    System.out.println(phs.listarArmaduraNombre());
	    System.out.println(phs.listarArmaduraCreacion());
	    System.out.println(phs);
    
    PersonajeTS pts = new PersonajeTS("Gandalf", 50, 100);
    pts.addArmadura(ta1);
    pts.addArmadura(ta2);
    pts.addArmadura(ta3);
    pts.addArmadura(ta4);
    pts.addArmadura(ta5);
    pts.setArmaDer(a1);
    pts.setArmaIzq(a2);
	    System.out.println("Versión con TreeSet:");
	    System.out.println(pts.listarArmaduraDanioFisico());
	    System.out.println(pts.listarArmaduraDanioMagico());
	    System.out.println(pts.listarArmaduraZona());
	    System.out.println(pts.listarArmaduraNombre());
	    System.out.println(pts.listarArmaduraCreacion());
	    System.out.println(pts);
    
    PersonajeAL pal = new PersonajeAL("Legolas", 75, 75);
	    pal.addArmadura(ta1);
	    pal.addArmadura(ta2);
	    pal.addArmadura(ta3);
	    pal.addArmadura(ta4);
	    pal.addArmadura(ta5);
	    pal.setArmaDer(a1);
	    pal.setArmaIzq(a2);
    
    System.out.println("Versión con ArrayList:");
	    System.out.println(pal.listarArmaduraDanioFisico());
	    System.out.println(pal.listarArmaduraDanioMagico());
	    System.out.println(pal.listarArmaduraZona());
	    System.out.println(pal.listarArmaduraNombre());
	    System.out.println(pal.listarArmaduraCreacion());
	    System.out.println(pal);
    }
}
	