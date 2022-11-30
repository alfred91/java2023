package Tema3;

public class EjemploCadenas {

	public static void main(String[] args) {
		char cadena[] = new char [10];
		
		String cadena1 = "Hola mundo";
		String cadena2 = new String("Hola mundo cruel mundo");
		String cadena3="";
		String cadena4="DAW";
		
		System.out.println("Hola mundo" + " 1DAW");
		
		System.out.println(cadena1.length()); 			//Longitud
		System.out.println(cadena1.startsWith("H"));	//Si empieza por una subcadena
		
		System.out.println(cadena2.indexOf("mundo"));	//Busca subcadena en cadena, te devuelve el indice o posicion de comienzo de la subcadena
		System.out.println(cadena2.indexOf("mundo",6));
		
		cadena4=cadena4+" "+ cadena1;
		cadena3=cadena4.concat(cadena1);				//Concat hace lo mismo que +
		System.out.println(cadena4);
		System.out.println(cadena3);
		
		System.out.println(cadena3.substring(0,3));
		System.out.println(String.valueOf(10.5f));  	//Pasa el numero a cadena, De numero a string ValueOf
		
		String cadena5= "149.95";
		double precio = Double.parseDouble(cadena5);	//
		System.out.println(precio+1);
		
		String cadena6="149.95";
		if (cadena5.equals(cadena6)) {					// Equals es mejor que "==" 
			System.out.println("Son iguales");
			
		String cadena7="Elefante";
		String cadena8="Girafa";						//Devuelve negativo si la primera cadena es menor que la segunda alfabéticamente
		System.out.println(cadena7.compareTo(cadena8));	//Devuelve 0 si son iguales
														//Devuelve positivo si la primera es mayor que la segunda alfabeticamente
		}
		
	}

}