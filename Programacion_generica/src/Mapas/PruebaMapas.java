package Mapas;
import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap<CLAVE, VALOR>
		
		HashMap<String, Empleado> personal = new HashMap<String,Empleado>();
		
		personal.put("145", new Empleado("Juan")); //añade
		
		personal.put("146",new Empleado("Jose"));
		
		personal.put("144", new Empleado("Sandra"));
		
		System.out.println(personal);
		
		personal.remove("144");	//elimina
		
		System.out.println(personal);
		
		personal.put("146",new Empleado("Juan Jose")); //reemplaza

		System.out.println(personal);
		
		//System.out.println(personal.entrySet());
		
		for(Map.Entry<String, Empleado> entrada:personal.entrySet()) {
			
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			
			System.out.println("Clave: "+entrada+" Valor: "+valor);
		}
	}

}

class Empleado{
	public Empleado(String n) {
		nombre=n;
		sueldo=200;
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [nombre=");
		builder.append(nombre);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append("]");
		return builder.toString();
	}
	private String nombre;
	private double sueldo;
}