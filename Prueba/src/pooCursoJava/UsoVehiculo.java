package pooCursoJava;

public class UsoCoche {

	public static void main(String[] args) {

		Coche micoche = new Coche();
		
		micoche.estableceColor("Verde");
		
		System.out.println(micoche.dime_datos_generales());
		
		//Esto no hace: micoche.color="rosa"
		
	System.out.println( micoche.dime_color());	
	
	micoche.configura_asientos("no");
	
	System.out.println(micoche.dime_asientos());
	
	micoche.configura_climatizador("si");
	
	System.out.println(micoche.dime_climatizador());
	
	System.out.println(micoche.dime_peso_coche()+" Kg"); //ESTE ES GETTER SETTER, SE CONFIGURA EN COCHE
	
	System.out.println("El precio final del coche es : " +micoche.precio_coche()+" €");
	
	}
}