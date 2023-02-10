package ejercicio10;

public class TestConsumo {

	public static void main(String[] args) {
							//*KMS LITROS VMED PGAS
		Consumo i30=new Consumo(10, 2,120 , 2);
		
		System.out.println(i30);
		
		System.out.println("Tiempo (mins): "+i30.getTiempo()+", Consumo € "+i30.consumoEuros()+" , Consumo medio : "+i30.consumoMedio());

	}

}
