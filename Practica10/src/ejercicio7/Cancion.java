package ejercicio7;

public class Cancion extends Multimedia {
	
    private int posicion;
    private Genero genero;
    private Disco disco;

    public Cancion(String nombre, int duracion, int posicion, Genero genero) {
        super(nombre, duracion);
        this.posicion = posicion;
        this.genero = genero;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + this.getNombre());
        this.incrementarReproducciones();
    }

	static void incrementarReproducciones() {
		// TODO Auto-generated method stub
		
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Posición: ").append(posicion);
        sb.append(", Género: ").append(genero);
        return sb.toString();
    }
}