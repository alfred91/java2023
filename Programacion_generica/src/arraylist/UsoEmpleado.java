package arraylist;
import java.util.*;

public class UsoEmpleado {
	
	public static void main (String[] args) {
		
		
		/*Empleado listaEmpleados[]= new Empleado[3];
		
		listaEmpleados[0]=new Empleado("Ana", 45, 2500);
		
		listaEmpleados[1]=new Empleado("Antonio", 55, 2000);
		
		listaEmpleados[2]=new Empleado("Maria", 25, 2600);*/
		
		/*UN ARRAYLIST SOLO PUEDE ALMACENAR OBJETOS EN SU INTERIOR,
		 * NO PUEDE ALMACENAR DATOS DE TIPO PRIMITIVO PARA ESO USAREMOS UNA CLASE ENVOLTORIO*/
	
		ArrayList <Empleado> listaEmpleados= new ArrayList<Empleado>();

		listaEmpleados.add(new Empleado("Ana", 45, 2500));	
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));		
		listaEmpleados.add(new Empleado("Maria", 25, 2600));		
		listaEmpleados.add(new Empleado("Julian", 35, 2200));		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));	
		listaEmpleados.add(new Empleado("Carlos", 55, 2000));
		listaEmpleados.add(new Empleado("Marta", 25, 2600));
		listaEmpleados.add(new Empleado("Augusto", 35, 2200));
		listaEmpleados.add(new Empleado("Carmen", 45, 2500));
		listaEmpleados.add(new Empleado("Alfonsito", 55, 2000));
	
		listaEmpleados.trimToSize();
		
		listaEmpleados.add(new Empleado("Julio", 35, 2200));
		
		listaEmpleados.set(1, new Empleado("Olga",2200,21) );//SET
		
		System.out.println(listaEmpleados.get(4).dameDatos());
		
		System.out.println("La lista es de "+listaEmpleados.size()+" Elementos");
			
		/*	for (Empleado e: listaEmpleados) {
			System.out.println(e.dameDatos());
			}	FOR EACH */
		
		Iterator <Empleado> iterador =listaEmpleados.iterator();
		
		while(iterador.hasNext()) { //WHILE ITELADOR TIENE NUMEROS=TRUE
			
			System.out.println(iterador.next().dameDatos());
			
		}
		
	
		
	/*	for (int i=0;i<listaEmpleados.size();i++) {
			Empleado e=listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}*/
	}
}
	
	class Empleado{
		
		private String nombre;
		private int edad;
		private double salario;
		
		public String dameDatos() { //METODO DAME DATOS
			return "El empleado se llama "+nombre+". "
					+ "Tiene "+edad+" años. Y un salario de "+salario;
		}
		
		public Empleado(String nombre, int edad, double salario) {
			
			this.nombre=nombre;
			this.edad=edad;
			this.salario=salario;
		}
		
	}