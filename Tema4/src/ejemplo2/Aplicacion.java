package ejemplo2;

public class Aplicacion {

	public static void main(String[] args) {
		Bicicleta bici1 = new Bicicleta();
		
		System.out.println(bici1.esElectrica);
		System.out.println(bici1.marca);
		System.out.println(bici1.precio);
		System.out.println(bici1.material);
		
		Bicicleta bici2 = new Bicicleta(true, "Orbea","Shimano","Shimano","Fox","Fibra de carbono",4500);
		
		System.out.println(bici2.marca);
		System.out.println(bici2.frenos);
		System.out.println(bici2.orquilla);
		System.out.println(bici2.precio);
		System.out.println(bici2.precioConDescuento());
	}

}
