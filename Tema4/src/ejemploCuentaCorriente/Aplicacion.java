package ejemploCuentaCorriente;

public class Aplicacion {

	public static void main(String[] args) {
		
		CuentaCorriente cc1 = new CuentaCorriente(20000);
		CuentaCorriente cc2 = new CuentaCorriente(1000);
		System.out.println(cc1);
		System.out.println(cc2);
		
		cc1.ingreso(10000);
		System.out.println(cc1);
		
		if (cc1.cargo(35000) == 1) {
			System.out.println("Cargo se ha realizado correctamente");
			System.out.println(cc1);
		} else {
			System.out.println("No hay suficiente saldo para hacer ese cargo, lo siento");
			System.out.println(cc1);
		}
		
		if (cc1.transferencia(5000, cc2) == 1) {
			System.out.println("Transferencia realizada");
			System.out.println(cc1);
			System.out.println(cc2);
		} else {
			System.out.println("No tienes suficiente dinero para transferir esa cantidad");
			System.out.println(cc1);
			System.out.println(cc2);
		}
		

	}

}
