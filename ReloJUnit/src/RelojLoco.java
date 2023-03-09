
public class RelojLoco {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.out.println( "*********************************" );
		System.out.println( "*** Bienvenidos al Reloj Loco ***" );
		System.out.println( "*********************************\n" );
		String horaReloj="00:00";
		//Reloj con 12 AM y otras 12 PM
		
		VisorReloj reloj = new VisorReloj(12, 60);
		System.out.println("Hora Inicial: "+reloj.leerHora());
		reloj.configurar(11, 57);
		
		//Leemos la nueva hora y la mostramos por consola
		horaReloj=reloj.leerHora();
		System.out.println("Nueva Hora Actual: "+horaReloj);
		
		while (!horaReloj.equals ("00:00")) {
			reloj.avanzarTiempo();
			//Leemos la nueva hora y la mostramos por consola
			horaReloj=reloj.leerHora();
			System.out.println("Nueva Hora Actual: "+horaReloj);
			
			Thread.sleep(1000);
		}
		
		System.out.println( "*********************************" );
		System.out.println( "*** Adios al Reloj Loco ***" );
		System.out.println( "*********************************\n" );
	}

}