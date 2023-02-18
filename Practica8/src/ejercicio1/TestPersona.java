package ejercicio1;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona a= new Persona();
		System.out.println(a);
		System.out.println("Es mayor de edad? "+a.esMayorDeEdad());
		System.out.println("IMC "+a.calcularIMC());		
	}

}
