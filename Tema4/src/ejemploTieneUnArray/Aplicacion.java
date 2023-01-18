package ejemploTieneUnArray;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empresa cosentino = new Empresa("Cosentino");
		cosentino.contratar(new Empleado("Javi", "Guillen", "jj@gmail.com", "Programador jefe", 3000));
		cosentino.contratar(new Empleado("Lucia", "Lopez", "ll@gmail.com", "Directora RRHH", 3000));
		cosentino.pintar();
	}

}
