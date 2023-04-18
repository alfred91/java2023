package Ejercicio4;

import Ejercicio4.Vehiculo.TipoFosil;

public class Test {

	public static void main(String[] args) {
		
		VehiculoElectrico ve1 = new VehiculoElectrico("1111", "Tesla", "3", "Rojo", 40000d, 250, false, 70);
		VehiculoElectrico ve2 = new VehiculoElectrico("2222", "Tesla", "Y", "Rojo", 60000d, 350, false, 110);
		VehiculoFosil vf1 = new VehiculoFosil("3333", "Seat", "Ibiza", "Blanco", 22000d, 90, false, TipoFosil.GASOLINA, 40);
		VehiculoFosil vf2 = new VehiculoFosil("4444", "Ford", "Focus", "Azul", 27000d, 130, false, TipoFosil.GASOLINA, 48);
		VehiculoHibrido vh1 = new VehiculoHibrido("5555", "Porsche", "Cayenne", "Negro", 75000d, 250, false, 20, TipoFosil.GASOLINA, 50);
		
		TallerSet miTaller = new TallerSet("Reparaciones Manolo");
		miTaller.ingresarVehiculo(vh1);
		miTaller.ingresarVehiculo(vf1);
		miTaller.ingresarVehiculo(vf2);
		miTaller.ingresarVehiculo(ve1);
		miTaller.ingresarVehiculo(ve2);
		
		for(int i=1; i<1000000; i++) {
			miTaller.ingresarVehiculo(new VehiculoElectrico(""+i, "Tesla", "Y", "Rojo", 60000d, 350, false, 110));
		}
		
		System.out.println(miTaller);		
		
		System.out.println(miTaller.buscarVehiculo("3333"));
		
		System.out.println(miTaller);
		
		
		
	}

}