package ejercicio2;

class ClientePrime extends Cliente {
    private static final double PRECIO_MENSUAL = 3;

    public ClientePrime(String dni, String nombre, String email) {
        super(dni, nombre, email, PRECIO_MENSUAL);
    }

    @Override
    public boolean esPro() {
        return false;
    }

    @Override
    public double getPrecioTotal() {
        return getPrecioMensual();
    }
}