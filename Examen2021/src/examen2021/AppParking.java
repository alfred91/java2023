package examen2021;
import examen2021.Coche.Combustible;
public class AppParking {

	public static void main(String[] args) {
		Parking pg = new Parking();
		System.out.println(pg.imprimePlazas());
		
		pg.registrarEntradaVehiculo(new Coche("aaa 4444", "Peugeot", Combustible.DIESEL));
		pg.registrarEntradaVehiculo(new Furgoneta("bbb 3333", "VW", 7));
		
		//System.out.println(pg.imprimePlazas());
		for(Vehiculo v: pg.getVehiculos()) {
			System.out.println(v);
		}
		
		System.out.println(pg.registrarSalidaVehiculo("bbb 3333"));
		
		
		System.out.println(pg.imprimePlazas());
		for(Vehiculo v: pg.getVehiculos()) {
			System.out.println(v);
		}

		
	}

}
