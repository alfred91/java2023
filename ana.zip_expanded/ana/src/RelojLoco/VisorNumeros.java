package RelojLoco;
public class VisorNumeros {
    private final VisorNumeros horas;
    private final VisorNumeros minutos;
    private String horaFormateada;

    public VisorNumeros(int limiteHora, int limiteMinuto){
        if(12 != limiteHora && 24!= limiteHora){
            System.out.println("Error: la hora no coincide con los limites establecidos");
        }
        horas = new VisorNumeros(limiteHora);
        minutos = new VisorNumeros(limiteMinuto);
        actualizarHoraYFormatear();
    }

    public static VisorNumeros iniciarEnMediaNoche(){
        return new VisorNumeros(24, 60);
    }

    public String leerHora(){
        return horaFormateada;
    }

    public void configurar(int hora, int minuto){
        horas.cambiarNumero(hora);
        minutos.cambiarNumero(minuto);
        actualizarHoraYFormatear();
    }

    /* Versi�n NORMAL del Visor de Reloj */
    public void avanzarTiempo() {
        minutos.incrementar();
        if(minutos.leer() == 0){
            horas.incrementar();
        }

        actualizarHoraYFormatear();
    }
    
    /* Versi�n LOCA del Visor de Reloj */
    public void avanzarTiempoAleatoriamente() {
        minutos.incrementar();
        if(minutos.leer() == 0){
            horas.incrementar();
        }

        actualizarHoraYFormatear();
    }

    private void actualizarHoraYFormatear() {
        horaFormateada = horas.leerConFormato() + " : " + minutos.leerConFormato(); 
    }
    
}