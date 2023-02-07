package ejemplos.electrodomesticos;

import java.util.ArrayList;

import ejemplos.electrodomesticos.Electrodomestico.ColorE;
import ejemplos.electrodomesticos.Electrodomestico.ConsumoE;
import ejemplos.electrodomesticos.Television.ResolucionTV;
import ejemplos.electrodomesticos.Television.TecnologiaLed;

public class Aplicacion {

	public static void main(String[] args) {
		
		
		Electrodomestico e1 = new Electrodomestico("Bosch", "Microondas 220", 350.0, 10.0, ConsumoE.D, ColorE.BLANCO);
		System.out.println(e1.precioFinal());
		
		Lavadora l1 = new Lavadora("Bosch", "Lavadora XX3", 550.0, 30.0, ConsumoE.B, ColorE.GRIS, 10);
		System.out.println(l1.precioFinal());

		Lavadora l2 = new Lavadora("Balay", "Lavadora C7", 350.0, 35.0, ConsumoE.C, ColorE.GRIS, 7);
		System.out.println(l1.precioFinal());

		Television t1 = new Television("LG", "X1", 2200d, 15.0, ConsumoE.A, ColorE.NEGRO, 65, TecnologiaLed.OLED, ResolucionTV.R_8K);
		System.out.println(t1.precioFinal());
		
		Television t2 = new Television("LG", "D100", 1200d, 19.0, ConsumoE.C, ColorE.NEGRO, 55, TecnologiaLed.QLED, ResolucionTV.R_4K);
		System.out.println(t1.precioFinal());

		Television t3 = new Television("Samsung", "UE8000", 2100d, 20.0, ConsumoE.B, ColorE.NEGRO, 70, TecnologiaLed.QLED, ResolucionTV.R_4K);
		System.out.println(t1.precioFinal());
		
		
		ArrayList<Electrodomestico> miTienda = new ArrayList<>();
		miTienda.add(l1);
		miTienda.add(l2);
		miTienda.add(t1);
		miTienda.add(t2);
		miTienda.add(t3);
		
		
		for(Electrodomestico e: miTienda) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
