package ejercicio3;

	public class Direccion {
	    private String tipoVia;
	    private String nombreVia;
	    private String cp;
	    private String pais;
	    private double latitud;
	    private double longitud;
	    private int numero;
	    private String poblacion;
	    private String provincia;
	    
	    public Direccion() {
	        this.tipoVia = "";
	        this.nombreVia = "";
	        this.cp = "";
	        this.pais = "";
	        this.latitud = 0.0;
	        this.longitud = 0.0;
	        this.numero = 0;
	        this.poblacion = "";
	        this.provincia = "";
	    }
	    
	    public Direccion(String tipoVia, String nombreVia, String cp, String pais, double latitud, double longitud, int numero, String poblacion, String provincia) {
	        this.tipoVia = tipoVia;
	        this.nombreVia = nombreVia;
	        this.cp = cp;
	        this.pais = pais;
	        this.latitud = latitud;
	        this.longitud = longitud;
	        this.numero = numero;
	        this.poblacion = poblacion;
	        this.provincia = provincia;
	    }
	    
	    public Direccion(Direccion otraDireccion) {
	        this.tipoVia = otraDireccion.tipoVia;
	        this.nombreVia = otraDireccion.nombreVia;
	        this.cp = otraDireccion.cp;
	        this.pais = otraDireccion.pais;
	        this.latitud = otraDireccion.latitud;
	        this.longitud = otraDireccion.longitud;
	        this.numero = otraDireccion.numero;
	        this.poblacion = otraDireccion.poblacion;
	        this.provincia = otraDireccion.provincia;
	    }
	    
	    public String getTipoVia() {
	        return tipoVia;
	    }
	    
	    public String getNombreVia() {
	        return nombreVia;
	    }
	    
	    public String getCP() {
	        return cp;
	    }
	    
	    public String getPais() {
	        return pais;
	    }
	    
	    public double getLatitud() {
	        return latitud;
	    }
	    
	    public double getLongitud() {
	        return longitud;
	    }
	    
	    public int getNumero() {
	        return numero;
	    }
	    
	    public String getPoblacion() {
	        return poblacion;
	    }
	    
	    public String getProvincia() {
	        return provincia;
	    }
	    
	    public void setTipoVia(String tipoVia) {
	        if (tipoVia != null && !tipoVia.isEmpty()) {
	            this.tipoVia = tipoVia;
	        } else {
	            throw new IllegalArgumentException("El tipo de vía no puede ser nulo o vacío.");
	        }
	    }
	    
	    public void setNombreVia(String nombreVia) {
	        if (nombreVia != null && !nombreVia.isEmpty()) {
	            this.nombreVia = nombreVia;
	        } else {
	            throw new IllegalArgumentException("El nombre de la vía no puede ser nulo o vacío.");
	        }
	    }
	    
	    public void setCP(String cp) {
	        if (cp != null && !cp.isEmpty()) {
	            this.cp = cp;
	        } else {
	            throw new IllegalArgumentException("El código postal no puede ser nulo o vacío.");
	        }
	    }
	    
	    public void setPais(String pais) {
	        if (pais != null && !pais.isEmpty()) {
	            this.pais = pais;
	        } else {
	            throw new IllegalArgumentException("El país no puede ser nulo o vacío.");
	        }
	    }
	    
	    public void setLatitud(double latitud) {
	        if (latitud >= -90.0 && latitud <= 90.0) {
	            this.latitud = latitud;
	        } else {
	            throw new Exception(e);
	            
	    }
	}}