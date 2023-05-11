package Ejercicio4;

public class Ciudad {
	
    private static int cod_inicial = 1;

    protected int codigo;
    protected String nombre;
    protected int poblacion;
    protected Pais pais;

    public Ciudad(String nombre, int poblacion, Pais pais) {
        this.codigo = cod_inicial++;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
    }
    
    public Ciudad (String nombre, int poblacion) {
        this.codigo = cod_inicial++;
    	this.nombre=nombre;
    	this.poblacion=poblacion;
    	
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ciudad ciudad = (Ciudad) obj;
        return codigo == ciudad.codigo;
    }
}
