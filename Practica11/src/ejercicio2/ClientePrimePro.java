package ejercicio2;

class ClientePrimePro extends Cliente {
    private static final double PRECIO_MENSUAL = 5;

    public ClientePrimePro(String dni, String nombre, String email) {
        super(dni, nombre, email, PRECIO_MENSUAL);
    }

    @Override
    public boolean esPro() {
        return true;
    }

    @Override
    public double getPrecioTotal() {
        return getPrecioMensual();
    }
}